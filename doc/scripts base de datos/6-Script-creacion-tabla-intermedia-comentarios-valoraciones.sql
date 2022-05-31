/*
@author: Josep Oriol Là¸£à¸“pez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creacià¸£à¸“n de la tabla COMENTARIOS_VALORACIONES
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `comentario_valoracion`
(
	`id` int auto_increment,
    `fk_id_valoracion` int,
    `fecha_comentario` timestamp,
    `comentario` nvarchar(255) not null,
    primary key (`id`),
    foreign key (`fk_id_valoracion`) references `valoracion`(`id`)
    on update cascade on delete cascade
);