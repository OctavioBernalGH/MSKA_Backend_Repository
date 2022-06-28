/**
============================
	1. INSERTAR RECLUTADOR
============================
*/
-- NUEVOS --
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (1, 1, 'Jose Manuel', 'IOS Recruiter');
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (1, 100, 'Antonio Molino', 'Backend Recruiter');
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (16, 986, 'Carlos Javier', 'Frontend Recruiter');
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (1, 6, 'Eva Carranza', 'Senior Recruiter');
insert into reclutador (experiencia, nivel, web, tipo_reclutador)
values (1, 1, 'Anna Bernal', 'Junior Recruiter');

-- select * from reclutador;


/**
============================
	2. INSERTAR TECNICO
============================
*/
-- NUEVOS --
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (100, 2, 'https://github.com/OctavioBernalGH', 'www.pinterest.com/octaviobernal', 16, 'Junior Developer');
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (450, 5, 'https://github.com/Kay-Nicte', 'www.pinterest.com/kay-nicte', 28, 'Senior Developer');
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (1800, 22, 'https://github.com/mednologic', 'www.pinterest.com/mednologic', 58, 'Software Analist');
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (999999, 99, 'https://github.com/DavidDalmauDieguez', 'www.pinterest.com/DavidDalmauDieguez', 689, 'Software architect');
insert into tecnico (experiencia, nivel, github, pinterest, trabajo_en_curso, tipo_tecnico)
values (180, 3, 'https://github.com/pablobernal', 'www.pinterest.com/pablobernal', 19, 'Junior Developer');

-- select * from tecnico;


/**
============================
	3. INSERTAR USUARIO
============================
*/
-- NUEVOS --
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Uri', 'López Bosch', 'uri@mail.me', 'urilopez', '123456789', 'Cambrils', 'España', '43205' , current_timestamp(), '1980/12/13', 606123456, 'www.instagram.es/mednologic',
'https://www.linkedin.com/in/oriollopezbosch/', 18,68,58,31,1,21, 'foto_uri' );
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Ixabel', 'Justo', 'ixabel@mail.me', 'ixajusto', '987654321', 'Irún', 'España', '20301' , current_timestamp(), '1980/12/13', 606987654, 'www.instagram.es/kay-nicte',
'https://www.linkedin.com/in/ixabeljusto/', 36,99,28,48,1,11, 'foto_ixa' );
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('David', 'Dalmau', 'daviddalmau@mail.me', 'davidubi', '159951', 'Reus', 'España', '43206' , current_timestamp(), '1980/12/13', 606123456, 'https://www.linkedin.com/in/daviddalmaudieguez/',
'https://www.linkedin.com/in/daviddalmaudieguez/', 1268,2563,658,360,1,31, 'foto_david' );
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Octavio', 'Bernal', 'octabevi@mail.me', 'octabevi', '753357', 'Tarragona', 'España', '43006' , current_timestamp(), '1993/04/11', 606456987, 'www.instagram.es/octabevi',
'https://www.linkedin.com/in/octavio-bernal-vilana/', 29,161,16,48,1,1, 'foto_octavio' );
insert into usuario (nombre, apellidos, email, nombre_usuario, contraseña, 
poblacion, pais, cp, fecha_registro, fecha_nacimiento, movil, instagram, linkedin, 
num_entrevista, num_mensajes, num_trabajos, num_valoraciones, fk_id_reclutador, fk_id_tecnico, uri_foto) 
values ('Pablo', 'Bernal', 'pabevi@mail.me', 'pabevi', '852258', 'Tarragona', 'España', '43006' , current_timestamp(), '1993/04/11', 606753357, 'www.instagram.es/pabevi',
'https://www.linkedin.com/in/pablobernalvilana/', 29,161,16,48,1,41, 'foto_pablo' );

-- select * from usuario;


/**
============================
	4. INSERTAR VALORACION
============================
*/
-- NUEVOS --
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 4, 'Es buen lugar para desempeñar un trabajo.', 'Jose Manuel', 'Octavio');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 5, 'Muy satisfecho con el trabajo realizado y los compañeros', 'Antonio Molino', 'Uri');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 1, 'Me encanta mi nuevo puesto de trabajo.', 'Jose Javier', 'Ixa');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 4, 'Muy contento con mis compañeros.', 'Eva Patricia', 'David');
insert into valoracion (fk_id_usuario, estrellas, comentario, reclutador, tecnico)
values (1, 5, 'Me encanta mi puesto de trabajo.', 'Jose Antonia', 'Pablo');

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
values (11, 'Estoy interesado en entrevistarte!', current_timestamp(), 21);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (21, '¿ En qué proyectos has participado ?', current_timestamp(), 31);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (31, 'Seguimos en contacto.', current_timestamp(), 41);
insert into mensaje (fk_id_emisor, mensaje, fecha_mensaje, fk_id_receptor)
values (41, 'Le contactaré al finalizar el proceso', current_timestamp(), 1);

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
values (1,1, 'Estoy encantado con mi nuevo puesto.', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (11,11, 'Me gusta mucho mi trabajo.', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (21,21, 'Solo se podría mejorar el sueldo, pero con experiencia ya crecerá.', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (31,31, 'Todo perfecto.', current_timestamp());
insert into comentario_trabajo(fk_id_usuario, fk_id_trabajo, comentario, fecha_comentario)
values (41,41, 'Esta todo correcto.', current_timestamp());

-- select * from comentario_trabajo;




/*
============================
	13. INSERTAR POST_USUARIO
============================
*/
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (1, 155, 186, current_timestamp(), 'Roborock S7 Pro Ultra: el robot aspirador con mapeo 3D que lleva la limpieza automatizada al siguiente nivel', 'uri fotografia1');
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (11, 366, 836, current_timestamp(), 'Valve aumenta la producción de la Steam Deck y anuncia que doblará los envíos semanales', 'uri fotografia2');
insert into post_usuario(fk_id_usuario, retwit, likes, fecha_post, link, uri_foto)
values (21, 36, 118, current_timestamp(), 'El nuevo MacBook Pro M2 de 13” tiene un SSD hasta un 50% más lento que el del modelo antiguo', 'uri fotografia3');
insert into post_usuario(fk_id_usuario, retwit, fecha_post, link, uri_foto)
values (31, 39893, current_timestamp(), 'Tenemos un problema de energía en la Luna. La NASA cree que podremos solucionarlo con fisión nuclear', 'uri fotografia4');
insert into post_usuario(fk_id_usuario, likes, fecha_post, link, uri_foto)
values (41, 1594698, current_timestamp(), 'China ha seducido a empresas de todo el mundo durante décadas. Ahora su atractivo se está acabando', 'uri fotografia5');
-- en link pner descripción --
-- select * from post_usuario;




/*
============================
	14. INSERTAR SKILLS
============================
*/
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Java basics', 1, ' Skill: Java basics with objects.', 50);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Machine Learning basics', 1, ' Skill: Machine Learning with python', 100);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Angular certification', 0, ' Skill: Angular certification basic', 230);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('Html advance', 1, 'Skill: html advanced', 2000);
insert into skill (tipo, validado, descripcion, cantidad_exp)
values ('React', 1, ' Skill: react native', 6900);

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

select * from usuariosecurity;
INSERT INTO usuariosecurity (username, password, role) 
VALUES ('admin1', '$2a$10$XURPShQNCsLjp1ESc2laoObo9QZDhxz73hJPaEv7/cBha4pk0AgP.','superAdministrador');