INSERT INTO persona(`id_persona`, `apellido_persona`, `cedula`, `correo_persona`, `direccion_persona`, `nombre_persona`, `telefono_persona`) VALUES (1,'final','9999999999','##########','##########','consumidor','0000000000')

INSERT INTO rol(id_rol, nombre_rol) VALUES (1,'Administrador');
INSERT INTO rol(id_rol, nombre_rol) VALUES (2,'Vendedor');

INSERT INTO usuario(id_usuario, password, user,id_rol) VALUES (1,'Admin1234','Admin',1);
