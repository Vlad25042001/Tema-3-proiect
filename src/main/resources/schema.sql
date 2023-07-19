create table t_echipe
(
    id   integer auto_increment,
    team varchar(50),
    ranking integer,
    liga varchar(50),
    primary key (id)
);

create table t_fotbalisti
(
    id             integer auto_increment,
    number integer,
    name           varchar(50),
    team           varchar(50),
    id_echipe  integer,
    primary key (id),
    foreign key (id_echipe) references t_echipe (id)
);