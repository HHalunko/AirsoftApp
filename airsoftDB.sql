
drop database if exists AirsoftAppDB;
create database if not exists AirsoftAppDB;
USE airsoftappdb;

 CREATE TABLE `Age` (
 `id_age` bigint (255) not null UNIQUE,
   `birth_date` varchar(200) NOT NULL,
   `current_full_age` int(100) NOT NULL,
   PRIMARY KEY (`id_age`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Location` (
   `id_Location` bigint(255) NOT NULL UNIQUE,
   `country_Location` varchar(200) NOT NULL,
   `city_Location` varchar(20) NOT NULL,
   `street_Location` varchar(40),
   `coordinates_Location` varchar(200),
   PRIMARY KEY (`id_Location`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Contact` (
   `id_Contact` bigint(255) NOT NULL UNIQUE,
   `phone_Contact` varchar(20) NOT NULL UNIQUE,
   `email_Contact` varchar(20) NOT NULL UNIQUE,
   `skype_Contact` varchar(20) UNIQUE,
   `facebook_Contact` varchar(20) UNIQUE,
   `vk_Contact` varchar(50) UNIQUE,
   PRIMARY KEY (`id_Contact`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 CREATE TABLE `Person` (
   `id_Person` bigint(255) NOT NULL UNIQUE,
   `firstName_Person` varchar(20) NOT NULL,
   `lastName_Person` varchar(20) NOT NULL,
   `nickname_Person` varchar(20) NOT NULL UNIQUE,
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
 
   CREATE TABLE `Conflict` (
   `id_Conflict` bigint(200) NOT NULL UNIQUE,
   `name_Conflict` varchar(255) NOT NULL UNIQUE,
   `description_Conflict` varchar(255) NOT NULL,
   `start_Conflict` varchar(200) NOT NULL,
   `end_Conflict` varchar(200) NOT NULL,
   PRIMARY KEY (`id_Conflict`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
  CREATE TABLE `Unit` (
   `id_Unit` bigint(205) NOT NULL UNIQUE,
   `name_Unit` varchar(20) NOT NULL UNIQUE,
   `country_Unit` varchar(255) NOT NULL,
   `info_Unit` varchar(255),
   PRIMARY KEY (`id_Unit`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
  CREATE TABLE `Team` (
   `id_Team` bigint(255) NOT NULL UNIQUE,
   `teamName_Team` varchar(20) NOT NULL UNIQUE,
   `info_Team` varchar(255),
   `id_location_Team` bigint(255) NOT NULL,
   `id_unit_Team` bigint(255),
   `id_teamLeader_Team` bigint(200) not null,
   `startPeriod_Team` varchar(200),
   `endPeriod_Team` varchar(200),
   PRIMARY KEY (`id_Team`),
   FOREIGN KEY (id_location_Team) REFERENCES Location(id_Location),
   FOREIGN KEY (id_unit_Team) REFERENCES Unit(id_Unit),
   FOREIGN KEY (id_teamLeader_Team) REFERENCES Person(id_Person)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
   CREATE TABLE `Camo` (
   `id_Camo` bigint(205) NOT NULL UNIQUE,
   `name_Camo` varchar(20) NOT NULL UNIQUE,
   `info_Camo` varchar(255),
   PRIMARY KEY (`id_Camo`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    CREATE TABLE `WeaponAccessories` (
   `id_WA` bigint(205) NOT NULL UNIQUE,
   `name_WA` varchar(20) NOT NULL UNIQUE,
   `type_WA` varchar(255) not null,
   `manufacturer_WA` varchar(255) not null,
   `color_WA` varchar(255) not null,
   PRIMARY KEY (`id_WA`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
     CREATE TABLE `Weapon` (
   `id_Weapon` bigint(205) NOT NULL UNIQUE,
   `model_Weapon` varchar(20) NOT NULL ,
   `manufacturer_Weapon` varchar(255) not null,
   `prototype_Weapon` varchar(255),
   `info_Weapon` varchar(255),
   `color_Weapon` varchar(255) not null,
   `exhaust_Weapon` int (250) not null,
   `type_Weapon` varchar (255) not null,
   `energy_type_Weapon` varchar (255) not null,
   PRIMARY KEY (`id_Weapon`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
      CREATE TABLE `Glasses` (
   `id_Glasses` bigint(205) NOT NULL UNIQUE,
   `model_name` varchar(20) ,
   `color` varchar(255) ,
   `manufacturer` varchar(255),
   `lense_Glasses` varchar(255),
   PRIMARY KEY (`id_Glasses`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;