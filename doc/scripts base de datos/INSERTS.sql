/**
============================
	1. INSERTAR RECLUTADOR
============================
*/
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (50, 1, 'testweb1', 'reclutado 1');
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (100, 2, 'testweb2', 'reclutado 2');
insert into reclutador (web, tipo_reclutador)
values ('testweb3', 'reclutado 3');
insert into reclutador (web, tipo_reclutador)
values ('testweb4', 'reclutado 4');
insert into reclutador (web, tipo_reclutador)
values ('testweb5', 'reclutado 5');

-- select * from reclutador;


/**
============================
	2. INSERTAR TECNICO
============================
*/
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, trabajos_finalizados, tipo_tecnico)
values (50, 1, 'github1', 'pinterest1 ', 1, 5, 'test1');
insert into tecnico (nivel, github, pinterest, trabajo_en_curso, trabajos_finalizados, tipo_tecnico)
values ( 2, 'github2', 'pinterest2', 1, 5, 'test3');
insert into tecnico (experiencia,  github, pinterest, trabajo_en_curso, trabajos_finalizados, tipo_tecnico)
values (150, 'github3', 'pinterest3', 10, 50, 'test4');
insert into tecnico (experiencia, nivel, github, pinterest, trabajos_finalizados, tipo_tecnico)
values (150, 3, 'github4', 'pinterest4',  50, 'test5');
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (150, 3, 'github5', 'pinterest5', 10, 'test6');

-- select * from tecnico;


/**
============================
	3. INSERTAR USUARIO
============================
*/
insert into usuario (nombre, apellidos, email, username, password, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_rol, fk_id_tecnico, uri_foto) 
values ('Test1', 'ApeTest', 'mailTest', 'usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest',
'linkedTest', 5,5,5,5,1,1, 'uriTest' );
/* Insert en usuarios */
insert into usuario (nombre, apellidos, email, username, password,  
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_rol, fk_id_tecnico, uri_foto) 
values ('Test2', 'a22222peTest', '22222mailTest', '22222usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest2',
'linkedTest2', 5,5,5,5,11,21, 'uriTest' );
insert into usuario (nombre, apellidos, email, username, password, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_rol, fk_id_tecnico, uri_foto) 
values ('Test3', 'a33333peTest', '33333mailTest', '33333usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest3',
'linkedTest3', 5,5,5,5,21,11, 'uriTest' );
insert into usuario (nombre, apellidos, email, username, password,  
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_rol, fk_id_tecnico, uri_foto) 
values ('Test2', 'a44444peTest', '44444mailTest', '44444usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest4',
'linkedTest4', 5,5,5,5,31,31, 'uriTest' );
insert into usuario (nombre, apellidos, email, username, password,  
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
fk_id_reclutador, fk_id_rol, fk_id_tecnico, uri_foto) 
values ('Test2', 'a55555peTest', '555555mailTest', '55555usernameTest', 'passTest', 'poblaTest', 'paisTest', '43006' , current_timestamp(), '2015/10/10', 600000, 'instaTest5',
'linkedTest5', 41,41, 'uriTest' );

-- select * from usuario;


/**
============================
	4. INSERTAR VALORACION
============================
*/
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 1, 'Me gusta1', 'Paco1', 'Manoli1');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (11, 2, 'Me gusta2', 'Paco2', 'Manoli2');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (21, 3, 'Me gusta3', 'Paco3', 'Manoli3');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (31, 4, 'Me gusta4', 'Paco4', 'Manoli4');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (41, 5, 'Me gusta5', 'Paco5', 'Manoli5');

-- select * from valoracion;


/*
============================
	5. INSERTAR ENTREVISTA
============================
*/
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (1, 1, '2022-05-05 22:00:00', 30, 1);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (11, 11, '2023-08-10 22:00:00', 30, 0);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (21, 21, '2023-08-10 22:00:00', 30, 0);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (31, 31, '2023-08-10 22:00:00', 30, 0);
insert into entrevista (fk_id_entrevistador, fk_id_entrevistado, fecha_entrevista, duracion, estado_entrevista_bol)
values (41, 41, '2023-08-10 22:00:00', 30, 0);

-- select * from entrevista;




/*
============================
	6. INSERTAR MENSAJE
============================
*/
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (1, 'Buenos días quería contactar contigo MP.', current_timestamp(), 11);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (11, 'Despedido', current_timestamp(), 21);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (21, 'Contratado !', current_timestamp(), 31);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (31, 'Contratado !', current_timestamp(), 41);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (41, 'Contratado !', current_timestamp(), 1);

-- select * from mensaje;



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
values (21,21, 'Albañil tecnológico', '2022-08-15', '2023-05-05', 4, 1330.15);
insert into trabajo (fk_id_asignador, fk_id_asignado, descripcion, fecha_ini, fecha_fin, estrellas, presupuesto) 
values (31,31, 'Albañil tecnológico', '2022-08-15', '2023-05-05', 4, 1330.15);
insert into trabajo (fk_id_asignador, fk_id_asignado, descripcion, fecha_ini, fecha_fin, estrellas, presupuesto) 
values (41,41, 'Albañil tecnológico', '2022-08-15', '2023-05-05', 4, 1330.15);

-- select * from trabajo;




/*
============================
	8. INSERTAR BANDAGES RECLUTADOR
============================
*/
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Escoria novata', 'Bandage de Reclutador', 'Primera interacción como reclutador', '2');
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Gran novato', 'Bandage de Reclutador 2', 'Interactua 15 veces', '4');
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Gran novato', 'Bandage de Reclutador 2', 'Interactua 15 veces', '4');
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Gran novato', 'Bandage de Reclutador 2', 'Interactua 15 veces', '4');
INSERT INTO bandage_reclutador(nombre, tipo, descripcion, cantidad_exp)
VALUES('Gran novato', 'Bandage de Reclutador 2', 'Interactua 15 veces', '4');

-- select * from reclutador;




/*
============================
	9. INSERTAR OBTIENE_R
============================
*/
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (1,1);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (11,11);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (21,21);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (31,31);
insert into obtiene_r(fk_id_reclutador, fk_id_bandage_reclutador)
values (41,41);

-- select * from obtiene_r;




/*
============================
	10. INSERTAR BANDAGES TECNICO
============================
*/
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice', 'Bandage de Tecnico', 'Primera interacción como técnico', '2');
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice pro', 'Bandage de Tecnico 1', 'Comete un boll1', '4');
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice pro2', 'Bandage de Tecnico 2', 'Comete un boll2', '6');
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice pro3', 'Bandage de Tecnico 3', 'Comete un bollo3', '8');
INSERT INTO bandage_tecnico(nombre, tipo, descripcion, cantidad_exp) 
VALUES('Novice pro4', 'Bandage de Tecnico 4', 'Comete un bollo4', '10');

-- select * from bandage_tecnico;




/*
============================
	11. INSERTAR OBTIENE_T
============================
*/
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (1,1);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (11,11);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (21,21);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (31,31);
insert into obtiene_t(fk_id_tecnico, fk_id_bandage_tecnico)
values (41,41);

-- select * from obtiene_t;




/*
============================
	12. INSERTAR COMENTARIO_TRABAJO
============================
*/
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (1,1, 'Este trabajo es horrible', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (11,11, 'Este trabajo es horrible2', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (21,21, 'Este trabajo es horrible3', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (31,31, 'Este trabajo es horrible4', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (41,41, 'Este trabajo es horrible5', current_timestamp());

-- select * from comentario_trabajo;




/*
============================
	13. INSERTAR POST_USUARIO
============================
*/
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (1, 100, 200, current_timestamp(), 'www.linkfalso....', 'uri foto1');
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (11, 100, 200, current_timestamp(), 'www.linkfalso2....', 'uri foto2');
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (21, 100, 200, current_timestamp(), 'www.linkfalso3....', 'uri foto3');
insert into post_usuario(fk_id_usuario, retwit, fecha_post, link, uri_foto)
values (31, 200, current_timestamp(), 'www.linkfalso4....', 'uri foto4');
insert into post_usuario(fk_id_usuario, likes, fecha_post, link, uri_foto)
values (41, 200, current_timestamp(), 'www.linkfalso5....', 'uri foto5');

-- select * from post_usuario;




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

-- select * from skills;




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
insert into posee(fk_id_skill, fk_id_trabajo)
values(31,31);
insert into posee(fk_id_skill, fk_id_trabajo)
values(41,41);

-- select * from posee;




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
insert into examen (fk_id_skill, nombre, tipo, descripcion, cantidad_exp)
values (31, 'Examen c++', 'Tipo 3', 'Descripción 3', 35);
insert into examen (fk_id_skill, nombre, tipo, descripcion, cantidad_exp)
values (41, 'Examen typescript', 'Tipo 3', 'Descripción 3', 35);

-- select * from examen;




/*
============================
	TABLA SECURITY
============================
*/
INSERT INTO usuariosecurity (username, password, role) 
VALUES ('admin1', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','superAdministrador');