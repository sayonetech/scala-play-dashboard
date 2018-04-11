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

INSERT INTO "Wine" values ('Vikas', '/image.jpg', 'provider','pairing', 'description','aroma', 'taste', 'latitude', 'longitude',5);
INSERT INTO "Wine" values ('Bhavya', '/image.jpg', 'provider','pairing', 'description','aroma', 'taste', 'latitude', 'longitude',4);
INSERT INTO "Wine" values ('Ayush', '/image.jpg', 'provider','pairing', 'description','aroma', 'taste', 'latitude', 'longitude',3);
INSERT INTO "Wine" values ('Satendra', '/image.jpg', 'provider','pairing', 'description','aroma', 'taste', 'latitude', 'longitude',2);
INSERT INTO "Wine" values ('Shankar', '/image.jpg', 'provider','pairing', 'description','aroma', 'taste', 'latitude', 'longitude',1);

# --- !Downs

DROP TABLE IF EXISTS "User";
DROP TABLE IF EXISTS "Wine";