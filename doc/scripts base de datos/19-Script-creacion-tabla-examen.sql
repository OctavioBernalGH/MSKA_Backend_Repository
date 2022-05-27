/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla EXAMEN
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `examen`
(
	`id` int auto_increment,
    `fk_id_skill` int,
    `nombre` nvarchar(255) not null,
    `tipo` nvarchar(255) not null,
    `descripcion` nvarchar(255),
    `cantidad_exp` int not null,
    primary key (`id`),
    foreign key (`fk_id_skill`) references `skill`(`id`)
    on update cascade on delete cascade
);