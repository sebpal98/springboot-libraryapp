drop table if exists book;

create table book (
    id int primary key auto_increment,
    name varchar(200) not null,
    description varchar(3000),
    imagenUrl varchar(500)
);

insert into
    book (name, description, imagen_url)
values
    (
        'El ritmo y la palabra o para una poética de la música salsa',
        'La salsa se ha desarrollado ampliamente como estilo musical del Caribe  hispánico. El propósito principal de este libro consiste en indagar la poética  de las canciones de salsa y presalsa. ',
        'https://simehbucket.s3.amazonaws.com/images/eb99f18bd6fd3173a377c82e1265fff4-medium.jpg'
    ),
    (
        'Tesoros fósiles de Firavitoba.',
        'En esta obra de divulgación científica converge la ciencia y el arte en la interpretación paleoambiental del miembro superior calcáreo de la Formación Tibasosa. ',
        'https://simehbucket.s3.amazonaws.com/images/7a665c7977e7b9df2eee119f35ce13f2-medium.jpg'
    ),
    (
        'Análisis de la velocidad en la interceptación del balón en porteros de fútbol de salón, basado en detección de movimiento.',
        'La tecnología constituye un apoyo al entrenamiento deportivo que influye en la preparación del jugador. Este libro informa sobre el análisis de la velocidad de intercepción del balón en porteros de fútbol de salón.',
        'https://simehbucket.s3.amazonaws.com/images/7a665c7977e7b9df2eee119f35916563-medium.jpg'
    ),
    (
        'Simulación basada en dinámica de sistemas y agentes inteligentes, aplicada a un sistema complejo',
        'Esta investigación propone una forma de integrar dos técnicas de simulación, una basada en agentes inteligentes y la segunda en dinámica de sistemas, aplicado a un caso de estudio real, en el cual se busca evaluar la calidad del servicio prestado en la operación de un sistema de transporte público colectivo urbano en ciudades intermedias, teniendo en cuenta el comportamiento de las variables complejas:  comodidad y rapidez.',
        'https://simehbucket.s3.amazonaws.com/images/a43a8974b98583f5163181f5fd7de661-medium.jpg'
    ),
    (
        'Metamodelo de medición de esfuerzo en proyectos de desarrollo de software',
        'En este libro se propone un metamodelo basado en las características generales de los procesos de estimación de esfuerzo y los modelos de calidad y mejora de procesos, de esta forma pretende contribuir en la predicción del esfuerzo al interior de las organizaciones y ayudar a mejorar la planificación de los proyectos software. ',
        'https://simehbucket.s3.amazonaws.com/images/a43a8974b98583f5163181f5fd7db64d-medium.jpg'
    ),
    (
        'Prácticas de laboratorio en química general',
        'En el proceso de formación en ciencias naturales la práctica en el laboratorio es fundamental para comprender los conceptos a través del ejercicio experimental. ',
        'https://simehbucket.s3.amazonaws.com/images/523c1d5ee7c38c0eb8aac7b18cc8ebdb-medium.jpg'
    ),
    (
        'Mujeres en la investigación matemática, escenarios de visibilización',
        'Esta investigación muestra formas de participación de las mujeres en avance del desarrollo científico desde sus aportes en matemática, especialmente destaca la trayectoria de tres matemáticas colombianas. ',
        'https://simehbucket.s3.amazonaws.com/images/ecbf39cc05c48884b1f7d533b116b9dc-medium.jpg'
    ),
    (
        'Métodos para la caracterización de la cerámica arqueológica',
        'Esta obra reúne un conjunto de técnicas para la caracterización de la cerámica arqueológica en laboratorio.',
        'https://simehbucket.s3.amazonaws.com/images/523c1d5ee7c38c0eb8aac7b18c6fa0fe-medium.jpg'
    );

create table editorial (
    id int primary key auto_increment,
    name varchar(200) not null,
    website varchar(500)
);

insert into
    editorial (id, name, website)
values
    (
        1,
        'Planeta',
        'https://www.planetadelibros.com/'
    ),
    (
        2,
        'Mirahadas',
        'https://www.mirahadas.com/'
    ),
    (
        3,
        'Pre-Textos',
        'https://www.pre-textos.com/'
    ),
    (
        4,
        'Sexto Piso',
        'https://sextopiso.es/'
    ),
    (
        5,
        'Nordica',
        'https://www.nordicalibros.com/'
    ),
    (
        6,
        'Acantilado',
        'https://www.acantilado.es/'
    ),
    (
        7,
        'La Huerta Grande',
        'https://www.lahuertagrande.com/'
    );

alter table
    book
add
    column editorial_id int,
add
    foreign key (editorial_id) references editorial(id);

update
    book
set
    editorial_id = 1
where
    id in (1, 5);

update
    book
set
    editorial_id = 2
where
    id in (2);

update
    book
set
    editorial_id = 3
where
    id in (3);

update
    book
set
    editorial_id = 4
where
    id in (4);

update
    book
set
    editorial_id = 5
where
    id in (6);

update
    book
set
    editorial_id = 6
where
    id in (7);

update
    book
set
    editorial_id = 7
where
    id in (8);

alter table
    book
modify
    editorial_id int not null;