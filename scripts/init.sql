create table language
(
    id       bigserial not null,
    language varchar(255)
);

insert into language (language)
values ('English');
insert into language (language)
values ('Spanish');
insert into language (language)
values ('Russian');

create table language_level
(
    id       bigserial not null,
    level varchar(255)
);

insert into language_level (level) values ('A1');
insert into language_level (level) values ('A2');
insert into language_level (level) values ('B1');
insert into language_level (level) values ('B2');
insert into language_level (level) values ('C1');
insert into language_level (level) values ('C2');