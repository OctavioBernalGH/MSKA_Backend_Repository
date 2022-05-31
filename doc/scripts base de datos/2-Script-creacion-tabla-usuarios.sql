/*
@author: Josep Oriol LÃ³pez
@author: Ixabel Justo
@author: David Dalmau
@author: Octavio Bernal
@project: MSKA (My Skill Around)

Script utilizado para la creaciÃ³n de la tabla USUARIOS
con las columnas definidas en el modelo relacional.
*/
CREATE TABLE `usuario` 
(
	`id` int auto_increment,
    `nombre` nvarchar(255) not null,
    `apellidos` nvarchar(255) not null,
    `email` nvarchar(255) unique not null,
    `nombre_usuario` nvarchar(255) unique not null,
    `contraseÃ±a` nvarchar(255) not null,
    `poblacion` nvarchar(255) not null,
    `pais` nvarchar (255) not null,
    `cp` nvarchar(255) not null,
    `fecha_registro` timestamp,
    `fecha_nacimiento` date not null,
    `movil` int,
    `instagram` nvarchar(255) unique,
    `linkedin` nvarchar(255) unique,
    `num_entrevista` int,
    `num_mensajes` int,
    `num_trabajos` int,
    `num_valoraciones` int,
    `reclutador_bol` int,
    `tecnico_bol` int,
    `uri_foto` nvarchar(255),
    primary key (`id`)
);