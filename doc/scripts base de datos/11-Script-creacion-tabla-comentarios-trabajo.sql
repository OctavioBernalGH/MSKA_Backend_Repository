/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla COMENTARIOS_TRABAJO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `comentario_trabajo`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `comentario` nvarchar(255) not null,
    `fecha_comentario` timestamp,
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);