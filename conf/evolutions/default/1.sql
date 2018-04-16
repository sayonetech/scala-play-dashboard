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

INSERT INTO "Wine" values ('Grover Vineyards',
                           'https://worldblazeblog.files.wordpress.com/2016/11/chene-grand-reserve.jpg',
                           'Grover Vineyards is Chene Grand Reserve',
                           'https://www.bk.com/sites/default/files/Thumb_0004_BBQ_Bacon_Whopper_0.jpg',
                           'Another widely recommended wine brand from the house of Grover Vineyards is Chene Grand Reserve, which is loved for its fine aroma and wonderful taste.',
                           'https://technicallyeasy.net/wp-content/uploads/2011/11/signal-strength-bar.png',
                           'http://www.differencebetween.info/sites/default/files/images/4/lime.jpg',
                           '12.79876',
                           '-13.58689',
                           5);
INSERT INTO "Wine" values ('Rasa Shiraz',
                           'https://worldblazeblog.files.wordpress.com/2016/11/rasa-shiraz.jpg',
                           'Sula Vineyards of Nashik.',
                           'http://www.differencebetween.info/sites/default/files/images/4/lemon.jpg',
                           'The vintage red wine is loved for its classic aroma and is used in preparing barbecues and several other dishes. It comes at a price of Rs 1175 for 750 ml.',
                           'http://images.knowhow.com/Computing/wifiicon.png',
                           'https://www.bk.com/sites/default/files/Thumb_0004_BBQ_Bacon_Whopper_0.jpg',
                           '55.72346',
                           '-15.58689',
                           4);
INSERT INTO "Wine" values ('Grover La’ Reserve',
                           'https://worldblazeblog.files.wordpress.com/2016/11/la_-reserve.jpg',
                           'Grover Vineyards is Chene Grand Reserve.',
                           'https://cakemart.com.ng/wp-content/uploads/2017/10/meat-lovers-pizza.png',
                           'La Reserve red wine delivered from their finest Cabernet Sauvignon and Shiraz grapes, the wine is made in the best French winemaking customs of Bordeaux.',
                           'https://technicallyeasy.net/wp-content/uploads/2011/11/signal-strength-bar.png',
                           'http://www.differencebetween.info/sites/default/files/images/4/lime.jpg',
                           '12.79876', '-18.58689', 3);
INSERT INTO "Wine" values ('Fratelli Sangiovese Bianco',
                           'https://worldblazeblog.files.wordpress.com/2016/11/fratelli-sangiovese-bianco.jpg',
                           'Solapur district close to Pune',
                           'https://cakemart.com.ng/wp-content/uploads/2017/10/Brioche.jpg',
                           'the Tuscan quality and taste of wine, developed in Indian atmosphere and territory. Their winery home is in the Solapur district close to Pune with the vineyards adjacent too.',
                           'https://www.officeeasy.fr/media/pub/desc/Stella-Room-Dual-Band-_GSM-_-3G_-4.jpg',
                           'https://jmdgv15kxa018mieg2cibjuu-wpengine.netdna-ssl.com/wp-content/uploads/2016/02/grapes-1.png',
                           '13.79876', '-12.58689', 2);
INSERT INTO "Wine" values ('Dindori Reserve Shiraz',
                           'https://www.worldblaze.in/wp-content/uploads/2015/07/Dindori-Reserve-Shiraz.jpg',
                           'Sula Vineyards',
                           'https://cakemart.com.ng/wp-content/uploads/2017/10/d9f639ee4da2e762129bc4b820cd0de0-breakfast-club-breakfast-dishes.jpg',
                           'The wine, which has a full body taste, makes a perfect combination with lamb and hard cheese. The price is pocket friendly at Rs 850 for 750 ml.',
                           'http://images.knowhow.com/Computing/wifiicon.png',
                           'https://jmdgv15kxa018mieg2cibjuu-wpengine.netdna-ssl.com/wp-content/uploads/2016/02/grapes-1.png',
                           '12.79876', '-13.58689', 1);

# --- !Downs

DROP TABLE IF EXISTS "User";
DROP TABLE IF EXISTS "Wine";