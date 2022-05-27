/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla BANDAGES_TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `bandage_tecnico`
(
	`id` int auto_increment,
    `nombre` nvarchar(255) not null,
    `tipo` nvarchar(255) not null,
    `descripcion` nvarchar(255),
    `cantidad_exp` int not null,
    primary key (`id`)
);