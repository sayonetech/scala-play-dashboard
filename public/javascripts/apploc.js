
// Main app module
var app = angular.module('myApp', ['ui.bootstrap', 'confirmDialogBoxModule']);

app.controller('locCtrl', function($scope, $http, $timeout, $uibModal, LocService) {

 $scope.locations = [];

    function getAllLocation() {
       LocService.getAll().then(function(res){
             $scope.locations = res.data;
        }, function(err){
           // error
        });
     }

      $scope.selectedLocation = {};

      $scope.editLocation = function(emp){
            $scope.selectedLocation = angular.copy(emp);
      };

      $scope.updateLocation = function(){
          LocService.updateEmployee($scope.selectedLocation).then(function(res) {
             $('.modal').modal('hide');
             showAlertMessage(res.status, res.msg);
             getAllLocation();
         }, function(err){
             // error
        });
      }

    $scope.newLocation = {};

    $scope.addLocation = function() {
        LocService.addLocation($scope.newLocation).then(function(res) {
                  $('.modal').modal('hide');
                  var newId = res.data.id;
                  $scope.newLocation["id"] = newId;
                  $scope.locations.push($scope.newLocation);
                  $scope.newLocation ={};
                  showAlertMessage(res.status, res.msg);
          }, function(err){
                // error
          });
    }

     $scope.deleteEmployee = function(empId) {
         LocService.deleteEmployee(empId).then(function(res){
                       var newEmpList=[];
                       angular.forEach($scope.locations,function(emp){
                                if(emp.id != empId) {
                                        newEmpList.push(emp);
                                 }
                        });
                        $scope.locations = newEmpList;
             showAlertMessage(res.status, res.msg);
         }, function(err){
                 // error
          });
      }

    getAllLocation();

    $scope.alerts = [];

    function showAlertMessage(status, message) {
              if(status == "success") {
                    $scope.alerts.push({type: "alert-success", title: "SUCCESS", content: message});
              } else if(status == "error") {
                     $scope.alerts.push({type: "alert-danger", title: "ERROR", content: message});
              }
    };

  });


/**
 * Directive for alert notification. You can also use angular ui-bootstrap for better alert notifications
 */
app.directive('notification', function($timeout){
  return {
    restrict: 'E',
    replace: true,
    scope: {
      ngModel: '='
    },
    template: '<div ng-class="ngModel.type" class="alert alert-box">{{ngModel.content}}</div>',
     link: function(scope, element, attrs) {
          $timeout(function(){
            element.hide();
          }, 3000);
      }
  }
});



/**
 * EmpService: Provides all employee services and run asynchronously
 */
app.service("LocService", function($http, $q) {

   var task = this;
   task.taskList = {};

   task.getAll = function() {
          var defer = $q.defer();
          $http.get('/loc/list')
          .success(function(res){
                task.taskList = res;
                defer.resolve(res);
           })
           .error(function(err, status){
              defer.reject(err);
           });

         return defer.promise;
     }

   task.deleteLocation = function(id) {
        var defer = $q.defer();
        $http.get('/loc/delete?locId=' + id)
        .success(function(res){
               task.taskList = res;
                defer.resolve(res);
         }).error(function(err, status){
               defer.reject(err);
         });

         return defer.promise
   }

   task.updateLocation = function(data) {
      var defer = $q.defer();
      $http.post('/loc/update', data)
      .success(function(res){
               task.taskList = res;
               defer.resolve(res);
       }).error(function(err, status){
                defer.reject(err);
       });

       return defer.promise
   }

   task.addELocation = function(data) {
         var defer = $q.defer();
         $http.post('/loc/create', data)
         .success(function(res){
                task.taskList = res;
                defer.resolve(res);
         })
         .error(function(err, status){
                defer.reject(err);
         });

          return defer.promise
      }

   return task;

 });


/**
 * Module for confirm dialog box
 * To use this, add this module as a dependency in app module.
 */
angular.module('confirmDialogBoxModule', ['ui.bootstrap'])
  .directive('ngConfirmClick', ['$uibModal', function($uibModal) {

      var modalInstanceCtrl = function($scope, $uibModalInstance) {
        $scope.ok = function() {
          $uibModalInstance.close();
        };

        $scope.cancel = function() {
          $uibModalInstance.dismiss('cancel');
        };
      };

      return {
        restrict: 'A',
        scope:{
          ngConfirmClick:"&"
        },
        link: function(scope, element, attrs) {
          element.bind('click', function() {
            var message = attrs.ngConfirmMessage || "Are you sure ?";

            // Template for confirmation dialog box
            var modalHtml = '<div class="modal-body">' + message + '</div>';
            modalHtml += '<div class="modal-footer"><button class="btn btn-primary" ng-click="ok()">OK</button><button class="btn btn-default" ng-click="cancel()">Cancel</button></div>';

            var modalInstance = $uibModal.open({
              template: modalHtml,
              controller: modalInstanceCtrl
            });

            modalInstance.result.then(function() {
              scope.ngConfirmClick();
            }, function() {
              //Modal dismissed
            });
          });

        }
      }
    }
  ]);
