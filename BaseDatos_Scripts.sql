create database miranda;
use miranda;
create table cliente (
	cli_id int(5) primary key AUTO_INCREMENT,
	cli_dni int(8),
	cli_nombre varchar(45),
	cli_apellido varchar(45),
	cli_razon_social varchar(255)
	
	);

##select * from cliente;