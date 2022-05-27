/*
@author: Josep Oriol Là¸£à¸“pez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creacià¸£à¸“n de la tabla VALORACIONES
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `valoracion`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `estrellas` int not null,
    `comentario` nvarchar(255) not null,
    `reclutador` nvarchar(100) not null,
    `usuario` nvarchar(100) not null,
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);