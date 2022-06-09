/*
@author: Josep Oriol López
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

formato date time aceptado
'AAAA-MM-DD HH: MM: SS' 
*/

-- Se elimina la verificación de foreign keys --
 SET FOREIGN_KEY_CHECKS = 1;
 SET FOREIGN_KEY_CHECKS = 0; 


DROP TABLE IF EXISTS  reclutador, tecnico, usuario, valoracion, comentario_valoracion, 
entrevista, mensaje, trabajo, asigna, comentario_trabajo ,bandage_reclutador, obtiene_r,
post_usuario, bandage_tecnico, obtiene_t, skill, posee, examen, usuario_security, usuariosecurity;

/*
Script utilizado para la creación de la tabla RECLUTADOR
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE reclutador
(
	id int auto_increment,
    experiencia int default 0,
    nivel int default 1,
    web nvarchar(255),
    tipo_reclutador nvarchar(255),
    primary key (id)
);

/*
Script utilizado para la creación de la tabla TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE tecnico
(
	id int auto_increment,
    experiencia int default 0,
    nivel int default 1,
    github nvarchar(255) unique,
    pinterest nvarchar(255) unique,
    trabajo_en_curso int default 0,
    trabajos_finalizados int default 0,
    tipo_tecnico nvarchar(255),
    primary key (id)
);

/*
Script utilizado para la creación de la tabla USUARIOS
con las columnas definidas en el modelo relacional.
*/

CREATE TABLE usuario 
(
	id int auto_increment,
    nombre nvarchar(255) not null,
    apellidos nvarchar(255) not null,
    email nvarchar(255) unique not null,
    nombre_usuario nvarchar(255) unique not null,
    contraseña nvarchar(255) not null,
    poblacion nvarchar(255) not null,
    pais nvarchar(255) not null,
    cp nvarchar(255) not null,
    fecha_registro timestamp,
    fecha_nacimiento date not null,
    movil int,
    instagram nvarchar(255) unique,
    linkedin nvarchar(255) unique,
    num_entrevista int,
    num_mensajes int,
    num_trabajos int,
    num_valoraciones int,
    fk_id_reclutador int,
    fk_id_tecnico int,
    uri_foto nvarchar(255),
    primary key (id),
    foreign key (fk_id_reclutador) references reclutador(id)
	on update cascade on delete cascade,
    foreign key (fk_id_tecnico) references tecnico(id)
	on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla VALORACIONES
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE valoracion
(
	id int auto_increment,
    fk_id_usuario int,
    estrellas int not null,
    comentario nvarchar(255) not null,
    reclutador nvarchar(100) not null,
    tecnico nvarchar(100) not null,
    primary key (id),
    foreign key (fk_id_usuario) references usuario(id)
    on update cascade on delete cascade
);


/*

MODIFICACIÓN REALIZADA: 

Script utilizado para la creación de la tabla COMENTARIOS_VALORACIONES
con las columnas definidas en el modelo relacional.

CREATE TABLE comentario_valoracion
(
	id int auto_increment,
    fk_id_valoraciones int,
    fecha_comentario timestamp,
    comentario nvarchar(255) not null,
    primary key (id),
    foreign key (fk_id_valoraciones) references valoracion(id)
    on update cascade on delete cascade
);

*/

/*
Script utilizado para la creación de la tabla ENTREVISTA
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE entrevista
(
	id int auto_increment,
    fk_id_entrevistador int not null,
    fk_id_entrevistado int not null,
    fecha_entrevista datetime not null,
    duracion int not null,
    estado_entrevista_bol bit not null,
    primary key (id),
    foreign key (fk_id_entrevistador) references usuario(id)
    on update cascade on delete cascade,
	foreign key (fk_id_entrevistado) references usuario(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla MENSAJES
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE mensaje
(
	id int auto_increment,
    fk_id_emisor int not null,
    mensaje nvarchar(256) not null,
    fecha_mensaje timestamp not null,
    fk_id_receptor int not null,
    primary key (id),
    foreign key (fk_id_emisor) references usuario(id)
	on update cascade on delete cascade,
	foreign key (fk_id_receptor) references usuario(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla TRABAJO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE trabajo
(
	id int auto_increment,
    fk_id_asignador int,
    fk_id_asignado int,
    descripcion nvarchar(255) not null,
    fecha_ini date not null,
    fecha_fin date,
    estrellas int not null,
    presupuesto float,
    primary key (id),
    foreign key (fk_id_asignador) references usuario(id)
    on update cascade on delete cascade,
    foreign key (fk_id_asignado) references usuario(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla ASIGNA,
esta tabla es intermedia entre TRABAJO y USUARIOS
con las columnas definidas en el modelo relacional.

CREATE TABLE asigna
(
	fk_id_usuario int,
    fk_id_trabajo int,
    foreign key (fk_id_usuario) references usuario(id)
    on update cascade on delete cascade,
    foreign key (fk_id_trabajo) references trabajo(id)
    on update cascade on delete cascade
);
*/

/*
Script utilizado para la creación de la tabla COMENTARIOS_TRABAJO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE comentario_trabajo
(
	id int auto_increment,
    fk_id_usuario int,
    fk_id_trabajo int,
    comentario nvarchar(255) not null,
    fecha_comentario timestamp,
    primary key (id),
    foreign key (fk_id_usuario) references usuario(id)
    on update cascade on delete cascade,
    foreign key (fk_id_trabajo) references trabajo(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla BANDAGES_RECLUTADOR
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE bandage_reclutador
(
	id int auto_increment,
	nombre nvarchar(255) not null,
    tipo nvarchar(255) not null,
	descripcion nvarchar(255),
    cantidad_exp int not null,
    primary key (id)
);

/*
Script utilizado para la creación de la tabla OBTIENE_R,
esta tabla es intermedia entre RECLUTADOR y BANDAGES_RECLUTADOR
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE obtiene_r
(
	id int auto_increment,
	fk_id_reclutador int,
    fk_id_bandage_reclutador int,
    primary key (id),
    foreign key (fk_id_reclutador) references reclutador(id)
    on update cascade on delete cascade,
    foreign key (fk_id_bandage_reclutador) references bandage_reclutador(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla POST_USUARIO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE post_usuario
(
	id int auto_increment,
    fk_id_usuario int,
    retwit int,
    likes int,
    fecha_post timestamp not null,
    link nvarchar(255),
    uri_foto nvarchar(255),
    primary key (id),
    foreign key (fk_id_usuario) references usuario(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla BANDAGES_TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE bandage_tecnico
(
	id int auto_increment,
    nombre nvarchar(255) not null,
    tipo nvarchar(255) not null,
    descripcion nvarchar(255),
    cantidad_exp int not null,
    primary key (id)
);

/*
Script utilizado para la creación de la tabla OBTIENE_T,
esta tabla es intermedia entre TECNICO y BANDAGES_TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE obtiene_t
(
	id int auto_increment,
	fk_id_tecnico int,
    fk_id_bandage_tecnico int,
    primary key (id),
    foreign key (fk_id_tecnico) references tecnico(id)
    on update cascade on delete cascade,
    foreign key (fk_id_bandage_tecnico) references bandage_tecnico(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla SKILLS
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE skill
(
	id int auto_increment,
    tipo nvarchar(255) not null,
    validado bit default 0,
    descripcion nvarchar(255),
    cantidad_exp int not null,
    primary key (id)
);

/*
Script utilizado para la creación de la tabla POSEE,
esta tabla es intermedia entre SKILL y TECNICO
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE posee
(
	id int auto_increment,
	fk_id_skill int,
    fk_id_trabajo int,
    primary key(id),
    foreign key (fk_id_skill) references skill(id)
    on update cascade on delete cascade,
    foreign key (fk_id_trabajo) references trabajo(id)
    on update cascade on delete cascade
);

/*
Script utilizado para la creación de la tabla EXAMEN
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE examen
(
	id int auto_increment,
    fk_id_skill int,
    nombre nvarchar(255) not null,
    tipo nvarchar(255) not null,
    descripcion nvarchar(255),
    cantidad_exp int not null,
    primary key (id),
    foreign key (fk_id_skill) references skill(id)
    on update cascade on delete cascade
);