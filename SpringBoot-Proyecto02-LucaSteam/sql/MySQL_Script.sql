create database videojuegosdb;
use videojuegosdb;

CREATE TABLE `videojuegos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
<<<<<<< HEAD
  `Rank` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `year` int(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  `platform` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `EU_Sales`double NOT NULL,
=======
  `orden` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `year` Date(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  `platform` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `ventas` double(45) NOT NULL,
>>>>>>> 992b8aeb4f391163faa908a61568f0a75746ea25
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1