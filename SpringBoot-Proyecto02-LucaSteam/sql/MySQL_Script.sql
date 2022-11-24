create database videojuegosdb;
use videojuegosdb;

CREATE TABLE `videojuegos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rango` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `year` varchar(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  `platform` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `eu_Sales` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1