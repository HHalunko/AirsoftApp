
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
   `website_Contact` varchar(200),
   `skype_Contact` varchar(20) UNIQUE,
   `facebook_Contact` varchar(20) UNIQUE,
   `vk_Contact` varchar(50) UNIQUE,
   PRIMARY KEY (`id_Contact`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 
 CREATE TABLE `Manufacturer` (
 `id_Manufacturer` bigint (255) not null UNIQUE,
   `name_Manufacturer` varchar(200) NOT NULL UNIQUE,
   `country_Manufacturer` varchar(255) NOT NULL,
   `contact_manufacturer` bigint(255),
   PRIMARY KEY (`id_Manufacturer`),
   FOREIGN KEY (contact_manufacturer) REFERENCES contact(id_Contact)
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
   `manufacturer_WA` bigint(255) not null,
   `color_WA` varchar(255) not null,
   PRIMARY KEY (`id_WA`),
   FOREIGN KEY (manufacturer_WA) REFERENCES Manufacturer(id_Manufacturer)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
     CREATE TABLE `Weapon` (
   `id_Weapon` bigint(205) NOT NULL UNIQUE,
   `model_Weapon` varchar(20) NOT NULL ,
   `id_Manufacturer` bigint(255) not null,
   `prototype_Weapon` varchar(255),
   `info_Weapon` varchar(255),
   `color_Weapon` varchar(255) not null,
   `exhaust_Weapon` int (250) not null,
   `type_Weapon` varchar (255) not null,
   `energy_type_Weapon` varchar (255) not null,
   FOREIGN KEY (id_Manufacturer) REFERENCES Manufacturer(id_Manufacturer),
   PRIMARY KEY (`id_Weapon`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
  	CREATE TABLE `Gear` (
   `id` bigint(205) NOT NULL UNIQUE,
   `type` varchar(255) not null,
   `model_name` varchar(20) ,
   `color` varchar(255) ,
   `id_manufacturer_gear` bigint(255) not null,
   `lense_glasses` varchar(255),
   `type_Headwear` varchar(255),
   `isActive_HeadGear` char(1),
   FOREIGN KEY (id_manufacturer_gear) REFERENCES Manufacturer(id_Manufacturer),
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 CREATE TABLE `person_team`(
   `id_Person` bigint(255) NOT NULL ,
	`id_Team` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Person) REFERENCES Person(id_Person),
    FOREIGN KEY (id_Team) REFERENCES Team (id_Team)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
  CREATE TABLE `person_camo`(
   `id_Person` bigint(255) NOT NULL ,
	`id_Camo` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Person) REFERENCES Person(id_Person),
    FOREIGN KEY (id_Camo) REFERENCES Camo (id_Camo)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
   CREATE TABLE `person_weapon`(
   `id_Person` bigint(255) NOT NULL ,
	`id_Weapon` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Person) REFERENCES Person(id_Person),
    FOREIGN KEY (id_Weapon) REFERENCES Weapon (id_Weapon)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
   CREATE TABLE `person_gear`(
   `id_Person` bigint(255) NOT NULL ,
	`id_Gear` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Person) REFERENCES Person(id_Person),
    FOREIGN KEY (id_Gear) REFERENCES Gear (id)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
    CREATE TABLE `team_camo`(
   `id_Team` bigint(255) NOT NULL ,
	`id_Camo` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Team) REFERENCES Team(id_Team),
    FOREIGN KEY (id_Camo) REFERENCES Camo (id_Camo)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
     CREATE TABLE `team_person`(
   `id_Team` bigint(255) NOT NULL ,
	`id_Person` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Team) REFERENCES Team(id_Team),
    FOREIGN KEY (id_Person) REFERENCES Person (id_Person)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
     CREATE TABLE `team_weapon`(
   `id_Team` bigint(255) NOT NULL ,
	`id_Weapon` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Team) REFERENCES Team(id_Team),
    FOREIGN KEY (id_Weapon) REFERENCES Weapon (id_Weapon)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
     CREATE TABLE `team_gear`(
   `id_Team` bigint(255) NOT NULL ,
	`id_Gear` bigint(255) NOT NULL ,
    FOREIGN KEY (id_Team) REFERENCES Team(id_Team),
    FOREIGN KEY (id_Gear) REFERENCES Gear (id)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
      CREATE TABLE `unit_conflict`(
   `id_unit` bigint(255) NOT NULL ,
	`id_conflict` bigint(255) NOT NULL ,
    FOREIGN KEY (id_unit) REFERENCES unit(id_unit),
    FOREIGN KEY (id_conflict) REFERENCES conflict (id_conflict)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
      CREATE TABLE `unit_weapon`(
   `id_unit` bigint(255) NOT NULL ,
	`id_weapon` bigint(255) NOT NULL ,
    FOREIGN KEY (id_unit) REFERENCES unit(id_unit),
    FOREIGN KEY (id_weapon) REFERENCES weapon (id_weapon)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
      CREATE TABLE `unit_gear`(
   `id_unit` bigint(255) NOT NULL ,
	`id_Gear` bigint(255) NOT NULL ,
    FOREIGN KEY (id_unit) REFERENCES unit(id_unit),
    FOREIGN KEY (id_Gear) REFERENCES Gear (id)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
      CREATE TABLE `unit_camo`(
   `id_unit` bigint(255) NOT NULL ,
	`id_camo` bigint(255) NOT NULL ,
    FOREIGN KEY (id_unit) REFERENCES unit(id_unit),
    FOREIGN KEY (id_camo) REFERENCES camo (id_camo)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
       CREATE TABLE `weapon_weaponaccessories`(
   `id_weapon` bigint(255) NOT NULL ,
	`id_weaponaccessories` bigint(255) NOT NULL ,
    FOREIGN KEY (id_weapon) REFERENCES weapon(id_weapon),
    FOREIGN KEY (id_weaponaccessories) REFERENCES weaponaccessories (id_wa)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
        CREATE TABLE `camo_manufacturers`(
   `id_camo` bigint(255) NOT NULL ,
	`id_manufacturer` bigint(255) NOT NULL ,
     FOREIGN KEY (id_camo) REFERENCES camo (id_camo),
     FOREIGN KEY (id_manufacturer) REFERENCES Manufacturer(id_Manufacturer)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
         CREATE TABLE `camo_unit`(
   `id_camo` bigint(255) NOT NULL ,
	`id_unit` bigint(255) NOT NULL ,
     FOREIGN KEY (id_camo) REFERENCES camo (id_camo),
     FOREIGN KEY (id_unit) REFERENCES unit(id_unit)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;