/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla ENTREVISTA
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `entrevista`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `fecha_entrevista` timestamp not null,
    `duracion` int not null,
    `estado_entrevista_bol` nvarchar(255) not null,
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);