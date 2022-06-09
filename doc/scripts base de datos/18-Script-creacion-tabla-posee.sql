/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla POSEE,
esta tabla es intermedia entre SKILL y TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `posee`
(
	`fk_id_skill` int,
    `fk_id_trabajo` int,
    foreign key (`fk_id_skill`) references `skill`(`id`)
    on update cascade on delete cascade,
    foreign key (`fk_id_trabajo`) references `trabajo`(`id`)
    on update cascade on delete cascade
);