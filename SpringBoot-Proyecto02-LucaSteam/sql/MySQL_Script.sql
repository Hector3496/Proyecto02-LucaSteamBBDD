create database videojuegosdb;
use videojuegosdb;

CREATE TABLE `videojuegos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rango` varchar(45),
  `name` varchar(45),
  `year` varchar(45),
  `genre` varchar(45),
  `platform` varchar(45),
  `publisher` varchar(45),
  `EU_Sales` double,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1