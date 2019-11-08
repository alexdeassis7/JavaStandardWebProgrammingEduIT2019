CREATE TABLE mitabla (
  DNI varchar(12) default NULL,
  correo varchar(32) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 
-- Estructura de tabla para la tabla 'miotratabla'
--IMPORTANTE al crear las tablas,si usamos un xampp version menor a la 5 debemos utilizar ENGINE=InnoDB
-- y no MyISAM esto porque InnoDB tiene soporte para transacciones, bloqueo de registros y nos permite tener las características ACID  garantizando la integridad de nuestras tablas.
-- 

CREATE TABLE miotratabla (
  nombre varchar(20) default NULL,
  apellido varchar(20) default NULL,
  edad int(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;