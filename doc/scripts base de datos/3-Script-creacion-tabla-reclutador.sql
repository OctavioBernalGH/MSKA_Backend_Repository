/*
@author: Josep Oriol López
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creación de la tabla RECLUTADOR
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `reclutador`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `experiencia` int default 0,
    `nivel` int default 1,
    `web` nvarchar(255),
    `tipo_reclutador` nvarchar(255),
    primary key (`id`),
    constraint `fk_id_reclutador`
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);