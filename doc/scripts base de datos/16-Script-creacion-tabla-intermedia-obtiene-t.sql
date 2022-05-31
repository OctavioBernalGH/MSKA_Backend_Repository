/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla OBTIENE_T,
esta tabla es intermedia entre TECNICO y BANDAGES_TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `obtiene_t`
(
	`fk_id_tecnico` int,
    `fk_id_bandage_tecnico` int,
    foreign key (`fk_id_tecnico`) references `tecnico`(`id`)
    on update cascade on delete cascade,
    foreign key (`fk_id_bandage_tecnico`) references `bandage_tecnico`(`id`)
    on update cascade on delete cascade
);