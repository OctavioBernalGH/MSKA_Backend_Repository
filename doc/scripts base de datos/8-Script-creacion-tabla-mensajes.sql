/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla MENSAJES
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `mensaje`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `mensaje` nvarchar(256) not null,
    `fecha_mensaje` timestamp not null,
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);