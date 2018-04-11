
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jk/activator-play-slick-angularjs/conf/routes
// @DATE:Tue Apr 10 20:06:16 IST 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWebJarAssets WebJarAssets = new controllers.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLocationController LocationController = new controllers.ReverseLocationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseEmployeeController EmployeeController = new controllers.ReverseEmployeeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWebJarAssets WebJarAssets = new controllers.javascript.ReverseWebJarAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLocationController LocationController = new controllers.javascript.ReverseLocationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseEmployeeController EmployeeController = new controllers.javascript.ReverseEmployeeController(RoutesPrefix.byNamePrefix());
  }

}
