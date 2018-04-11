# --- !Ups
DROP TABLE IF EXISTS "User";
DROP TABLE IF EXISTS "Wine";
CREATE TABLE  "User"("id" SERIAL PRIMARY KEY ,"username" varchar(200) , "email" varchar(200)  ,"firstname" varchar,"lastname" varchar);
INSERT INTO "User" values (1,'Vikas', 'vikas@knoldus.com','Fname','Lname');
INSERT INTO "User" values (2,'Bhavya', 'bhavya@knoldus.com','Fname','Lname');
INSERT INTO "User" values (3,'Ayush', 'ayush@knoldus.com','Fname','Lname');
INSERT INTO "User" values (4,'Satendra', 'satendra@knoldus.com','Fname','Lname');


CREATE TABLE  "Wine"("name" varchar(200) , "image" varchar(200)  ,
  "provider" varchar(200),"pairing" varchar(200), "description" varchar(200) ,
  "aroma" varchar(200)  ,"taste" varchar(200),"latitude" varchar(200), "longitude" varchar(200),
  "id" SERIAL PRIMARY KEY);

INSERT INTO "Wine" values ('Vikas', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAb_0lLrq7RUlOM3LGe88Bt7uyG5Ouit9u58P9hSio2Ih8TjeT', 'provider','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZrOOV_MdaNeMMfgqd9UdlofCiJXBg67hGncg4aLd0qYzTWIHW4g', 'description','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wcm5NZFhe2c1DALdHCebh77XNYSVuQc_-2J3Jet3pkUb_Q-P', 'https://cdn.iconscout.com/public/images/icon/premium/png-512/breakfast-hotdog-junk-lunch-meal-yummy-food-35e793a7e0ce1238-512x512.png', 'latitude', 'longitude',5);
INSERT INTO "Wine" values ('Bhavya', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAb_0lLrq7RUlOM3LGe88Bt7uyG5Ouit9u58P9hSio2Ih8TjeT', 'provider','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZrOOV_MdaNeMMfgqd9UdlofCiJXBg67hGncg4aLd0qYzTWIHW4g', 'description','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wcm5NZFhe2c1DALdHCebh77XNYSVuQc_-2J3Jet3pkUb_Q-P', 'https://cdn.iconscout.com/public/images/icon/premium/png-512/breakfast-hotdog-junk-lunch-meal-yummy-food-35e793a7e0ce1238-512x512.png', 'latitude', 'longitude',4);
INSERT INTO "Wine" values ('Ayush', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAb_0lLrq7RUlOM3LGe88Bt7uyG5Ouit9u58P9hSio2Ih8TjeT', 'provider','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZrOOV_MdaNeMMfgqd9UdlofCiJXBg67hGncg4aLd0qYzTWIHW4g', 'description','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wcm5NZFhe2c1DALdHCebh77XNYSVuQc_-2J3Jet3pkUb_Q-P', 'https://cdn.iconscout.com/public/images/icon/premium/png-512/breakfast-hotdog-junk-lunch-meal-yummy-food-35e793a7e0ce1238-512x512.png', 'latitude', 'longitude',3);
INSERT INTO "Wine" values ('Satendra', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAb_0lLrq7RUlOM3LGe88Bt7uyG5Ouit9u58P9hSio2Ih8TjeT', 'provider','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZrOOV_MdaNeMMfgqd9UdlofCiJXBg67hGncg4aLd0qYzTWIHW4g', 'description','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wcm5NZFhe2c1DALdHCebh77XNYSVuQc_-2J3Jet3pkUb_Q-P', 'https://cdn.iconscout.com/public/images/icon/premium/png-512/breakfast-hotdog-junk-lunch-meal-yummy-food-35e793a7e0ce1238-512x512.png', 'latitude', 'longitude',2);
INSERT INTO "Wine" values ('Shankar', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAb_0lLrq7RUlOM3LGe88Bt7uyG5Ouit9u58P9hSio2Ih8TjeT', 'provider','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZrOOV_MdaNeMMfgqd9UdlofCiJXBg67hGncg4aLd0qYzTWIHW4g', 'description','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1wcm5NZFhe2c1DALdHCebh77XNYSVuQc_-2J3Jet3pkUb_Q-P', 'https://cdn.iconscout.com/public/images/icon/premium/png-512/breakfast-hotdog-junk-lunch-meal-yummy-food-35e793a7e0ce1238-512x512.png', 'latitude', 'longitude',1);

# --- !Downs

DROP TABLE IF EXISTS "User";
DROP TABLE IF EXISTS "Wine";