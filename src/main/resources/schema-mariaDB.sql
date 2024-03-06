drop table if exists libro;

create table libro (
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);
