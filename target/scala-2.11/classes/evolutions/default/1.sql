# --- !Ups
CREATE TABLE "User"("id" SERIAL PRIMARY KEY ,"username" varchar(200) , "email" varchar(200)  ,"firstname" varchar,"lastname" varchar);
INSERT INTO "User" values (1,'Vikas', 'vikas@knoldus.com','Fname','Lname');
INSERT INTO "User" values (2,'Bhavya', 'bhavya@knoldus.com','Fname','Lname');
INSERT INTO "User" values (3,'Ayush', 'ayush@knoldus.com','Fname','Lname');
INSERT INTO "User" values (4,'Satendra', 'satendra@knoldus.com','Fname','Lname');

# --- !Downs

DROP TABLE "User";
