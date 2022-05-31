/**
============================
	1. INSERTAR RECLUTADOR
============================
*/
/* Insert en reclutador */
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (50, 1, 'testweb1', 'reclutado tipo uno');
/* Insert en reclutador */
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (100, 2, 'testweb2', 'reclutado tipo dos');




/**
============================
	2. INSERTAR TECNICO
============================
*/
/* Insert en tecnico */
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, trabajos_finalizados, tipo_tecnico)
values (50, 1, 'github1', 'pinterest1 ', 1, 5, 'test1');
/* Insert en tenico */
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, trabajos_finalizados, tipo_tecnico)
values (150, 2, 'github2', 'pinterest2', 1, 5, 'test3');




/**
============================
	3. INSERTAR USUARIO
============================
*/
/* Insert en usuarios */
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Test1', 'ApeTest', 'mailTest', 'usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest',
'linkedTest', 5,5,5,5,1,1, 'uriTest' );
/* Insert en usuarios */
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Test2', 'a22222peTest', '22222mailTest', '22222usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest2',
'linkedTest2', 5,5,5,5,1,1, 'uriTest' );
/* NO SE PUEDE REALIZAR EL INSERT DEBIDO A LA INTEGRIDAD REFERENCIAL
** SE VALIDA LOS CAMPOS ÚNICOS DE LA TABLA Y SE VERIFICA SU CORRECTO FUNCIONAMIENTO 
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Test Nulo', 'Test Nulo', 'Test Nulo', 'Test Nulo', 'Test Nulo', 'Test Nulo', 'Test Nulo', 'Test Nulo' , current_timestamp(), '2015/10/10', 6000000, 'Test Nulo',
'Test Nulo', 5,5,5,5,1,null, 'uriTest' ); 
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Test Nulo2', 'Test Nulo2', 'Test Nulo2', 'Test Nulo2', 'Test Nulo2', 'Test Nulo2', 'Test Nulo2', 'Test Nulo2' , current_timestamp(), '2015/10/10', 6000000, 'Test Nulo2',
'Test Nulo2', 5,5,5,5,null,null, 'uriTest' ); 
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Test Nulo3', 'Test Nulo3', 'Test Nulo3', 'Test Nulo3', 'Test Nulo3', 'Test Nulo3', 'Test Nulo3', 'Test Nulo3' , current_timestamp(), '2015/10/10', 600001, 'Test Nulo3',
'Test Nulo3', 5,5,5,5,null,1, 'uriTest' ); 
*/

select * from usuario;


/**
============================
	4. INSERTAR VALORACION
============================
*/
/* Insert de valoracion */
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 5, 'Me gusta1', 'Paco1', 'Manoli1');
/* Insert de valoracion */
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (11, 5, 'Me gusta2', 'Paco2', 'Manoli2');
/* Insert de valoracion */
/* NO SE PUEDE REALIZAR EL INSERT DEBIDO A LA INTEGRIDAD REFERENCIAL CON USUARIO 
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (100, 5, 'Me gusta', 'Paco', 'Manoli');
*/




/*
============================
	5. INSERTAR ENTREVISTA
============================
*/

insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (1, 11, '2022-05-05 22:00:00', 30, 1);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (11, 1, '2023-08-10 22:00:00', 30, 0);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (11, 11, '2022-10-06 21:00:00', 30, 1);





/*
============================
	6. INSERTAR MENSAJE
============================
*/
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (1, 'Buenos días quería contactar contigo MP.', current_timestamp(), 1);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (11, 'Despedido', current_timestamp(), 1);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (11, 'Contratado !', current_timestamp(), 1);
/** Error por integridad referencial 
insert into mensaje (fk_id_usuario, mensaje, fecha_mensaje)
values (0, 'Contratado !', current_timestamp());
*/




/*
============================
	7. INSERTAR TRABAJO
============================
*/
insert into trabajo (fk_id_asignador, fk_id_asignado, descripcion, fecha_ini, fecha_fin, estrellas, presupuesto) 
values (1,11, 'Trabajo de machaca informatico', '2022-08-15', '2023-05-05', 5, 1680);
insert into trabajo (fk_id_asignador, fk_id_asignado, descripcion, fecha_ini, fecha_fin, estrellas, presupuesto) 
values (11,1, 'Trabajo programador', '2024-10-15', '2028-05-05', 5, 2500.84);
insert into trabajo (fk_id_asignador, fk_id_asignado, descripcion, fecha_ini, fecha_fin, estrellas, presupuesto) 
values (11,11, 'Albañil tecnológico', '2022-08-15', '2023-05-05', 4, 1330.15);




/*
============================
	8. INSERTAR BANDAGES RECLUTADOR
============================
*/
/*Insert de BandagesReclutador*/
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Escoria novata', 'Bandage de Reclutador', 'Primera interacción como reclutador', '2');
/*Insert de BandagesReclutador*/
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Gran novato', 'Bandage de Reclutador 2', 'Interactua 15 veces', '4');




/*
============================
	9. INSERTAR OBTIENE_R
============================
*/
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (1,1);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (11,1);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (11,11);




/*
============================
	10. INSERTAR BANDAGES TECNICO
============================
*/
/*Insert de BandagesTecnico*/
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice', 'Bandage de Tecnico', 'Primera interacción como técnico', '2');
/*Insert de BandagesTecnico*/
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice pro', 'Bandage de Tecnico 2', 'Comete un bollo', '4');




/*
============================
	11. INSERTAR OBTIENE_T
============================
*/
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (1,1);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (11,1);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (11,11);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (1,11);




/*
============================
	12. INSERTAR COMENTARIO_TRABAJO
============================
*/
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (1,11, 'Este trabajo es horrible', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (11,1, 'Este trabajo es horrible', current_timestamp());




/*
============================
	13. INSERTAR POST_USUARIO
============================
*/
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (1, 100, 200, current_timestamp(), 'www.linkfalso....', 'uri foto1');
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (11, 100, 200, current_timestamp(), 'www.linkfalso....', 'uri foto1');





/*
============================
	14. INSERTAR SKILLS
============================
*/
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Skill Test 1', 1, ' testeo de skills 1', 5);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Skill Test 2', 1, ' testeo de skills 2', 10);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Skill Test 3', 0, ' testeo de skills 3', 15);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Skill Test 4', 0, ' testeo de skills 4', 20);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Skill Test 5', 0, ' testeo de skills 5', 25);





/*
============================
	15. INSERTAR POSEE
============================
*/
insert into posee(fk_id_skill, fk_id_trabajo)
values(1,1);
insert into posee(fk_id_skill, fk_id_trabajo)
values(11,11);
insert into posee(fk_id_skill, fk_id_trabajo)
values(21,21);




/*
============================
	16. INSERTAR EXAMEN
============================
*/
insert into examen (fk_id_skill, nombre, tipo, descripcion, cantidad_exp)
values (1, 'Examen java', 'Tipo 1', 'Descripción 1', 5);
insert into examen (fk_id_skill, nombre, tipo, descripcion, cantidad_exp)
values (11, 'Examen python', 'Tipo 2', 'Descripción 2', 15);
insert into examen (fk_id_skill, nombre, tipo, descripcion, cantidad_exp)
values (21, 'Examen angular', 'Tipo 3', 'Descripción 3', 35);

