create database videojuegosdb;
use videojuegosdb;

CREATE TABLE `videojuegos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orden` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `year` Date(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  `platform` varchar(45) NOT NULL,
  `publisher` varchar(45) NOT NULL,
  `ventas` double(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1