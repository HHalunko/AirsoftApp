
drop database if exists AirsoftAppDB;
create database if not exists AirsoftAppDB;
USE airsoftappdb;

 CREATE TABLE `Age` (
 `id_age` bigint (255) not null,
   `birth_date` varchar(200) NOT NULL,
   `current_full_age` int(100) NOT NULL,
   PRIMARY KEY (`id_age`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Location` (
   `id_Location` bigint(255) NOT NULL,
   `country_Location` varchar(200) NOT NULL,
   `city_Location` varchar(20) NOT NULL,
   `street_Location` varchar(40),
   PRIMARY KEY (`id_Location`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Contact` (
   `id_Contact` bigint(255) NOT NULL,
   `phone_Contact` varchar(20) NOT NULL,
   `email_Contact` varchar(20) NOT NULL,
   `skype_Contact` varchar(20),
   `facebook_Contact` varchar(20),
   `vk_Contact` varchar(50),
   PRIMARY KEY (`id_Contact`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Person` (
   `id_Person` bigint(255) NOT NULL,
   `firstName_Person` varchar(20) NOT NULL,
   `lastName_Person` varchar(20) NOT NULL,
   `nickname_Person` varchar(20) NOT NULL,
   `id_age_Person` bigint(255) not null,
   `info_Person` varchar(200),
   `id_location_Person` bigint(255) NOT NULL,
   `gender_Person` varchar(20) not null,
   `id_contact_Person` bigint(11) NOT NULL,
   `registDate_Person` varchar(200) not null,
   PRIMARY KEY (`id_Person`),
   FOREIGN KEY (id_age_Person) REFERENCES Age(id_age),
   FOREIGN KEY (id_location_Person) REFERENCES Location(id_location),
   FOREIGN KEY (id_contact_Person) REFERENCES Contact(id_contact)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;