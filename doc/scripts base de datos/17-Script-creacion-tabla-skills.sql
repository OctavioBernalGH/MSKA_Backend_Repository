/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla SKILLS
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `skill`
(
	`id` int auto_increment,
    `tipo` nvarchar(255) not null,
    `validado` bit default 0,
    `descripcion` nvarchar(255),
    `cantidad_exp` int not null,
    primary key (`id`)
);