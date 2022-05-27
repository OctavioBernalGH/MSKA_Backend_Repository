/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla TRABAJO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `trabajo`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `descripcion` nvarchar(255) not null,
    `fecha_ini` date not null,
    `fecha_fin` date,
    `estrellas` int not null,
    `prespuesto` float,
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);