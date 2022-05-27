/*
@author: Josep Oriol López
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creación de la tabla TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `tecnico`
(
	`id` int auto_increment,
    `fk_id_usuario` int,
    `experiencia` int default 0,
    `nivel` int default 1,
    `github` nvarchar(255) unique,
    `pinterest` nvarchar(255) unique,
    `trabajo_en_curso` int default 0,
    `trabajos_finalizados` int default 0,
    `tipo_tecnico` nvarchar(255),
    primary key (`id`),
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade
);