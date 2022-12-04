create table language_level
(
    id       bigserial not null,
    level varchar(255),
    primary key (id)
);

insert into language_level (level) values ('A1');
insert into language_level (level) values ('A2');
insert into language_level (level) values ('B1');
insert into language_level (level) values ('B2');
insert into language_level (level) values ('C1');
insert into language_level (level) values ('C2');