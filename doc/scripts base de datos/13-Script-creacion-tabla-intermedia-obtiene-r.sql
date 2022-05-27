/*
@author: Josep Oriol Lรณpez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciรณn de la tabla OBTIENE_R,
esta tabla es intermedia entre RECLUTADOR y BANDAGES_RECLUTADOR
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `obtiene_r`
(
	`fk_id_reclutador` int,
    `fk_id_bandage_reclutador` int,
    foreign key (`fk_id_reclutador`) references `reclutador`(`id`)
    on update cascade on delete cascade,
    foreign key (`fk_id_bandage_reclutador`) references `bandage_reclutador`(`id`)
    on update cascade on delete cascade
);