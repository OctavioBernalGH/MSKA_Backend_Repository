/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla ASIGNA,
esta tabla es intermedia entre TRABAJO y USUARIOS
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `asigna`
(
	`fk_id_usuario` int,
    `fk_id_trabajo` int,
    foreign key (`fk_id_usuario`) references `usuario`(`id`)
    on update cascade on delete cascade,
    foreign key (`fk_id_trabajo`) references `trabajo`(`id`)
    on update cascade on delete cascade
);