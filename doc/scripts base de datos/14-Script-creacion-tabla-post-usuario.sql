/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla POST_USUARIO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `post_usuario`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `retwit` int,
    `likes` int,
    `fecha_post` timestamp not null,
    `link` nvarchar(255),
    `uri_foto` nvarchar(255),
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);