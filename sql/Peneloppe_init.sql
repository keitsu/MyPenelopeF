DROP DATABASE peneloppeDB;
CREATE DATABASE peneloppeDB;
USE peneloppeDB;

CREATE TABLE Project
(
idProject INT not null AUTO_INCREMENT, 
name VARCHAR (255) not null,
dateFin VARCHAR (255) not null,
budget INT,
PRIMARY KEY (idProject)
);

CREATE TABLE Squad 
(
idSquad INT not null AUTO_INCREMENT, 
name VARCHAR (255) not null,
idProject INT, 
PRIMARY KEY (idSquad),
FOREIGN KEY (idProject) REFERENCES Project(idProject)
);

CREATE TABLE User
(
idUser INT not null AUTO_INCREMENT, 
name VARCHAR (255) not null,
firstname VARCHAR (255) not null,
idSquad int not null,
PRIMARY KEY (idUser),
FOREIGN KEY (idSquad) REFERENCES Squad(idSquad)
);

CREATE TABLE Document
(
idDoc INT not null AUTO_INCREMENT,
name VARCHAR (255) not null,
idSquad int not null,
PRIMARY KEY (idDoc),
FOREIGN KEY (idSquad) REFERENCES Squad(idSquad)
);

CREATE TABLE Task
(
idTask INT not null AUTO_INCREMENT,
idUser INT not null,
name VARCHAR (255) not null,
description VARCHAR (255) not null,
PRIMARY KEY (idTask),
FOREIGN KEY (idUser) REFERENCES User(idUser)
);