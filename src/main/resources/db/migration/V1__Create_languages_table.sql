create table language
(
    id       bigserial not null,
    language varchar(255),
    primary key (id)
);

insert into language (language)
values ('English');
insert into language (language)
values ('Spanish');
insert into language (language)
values ('Russian');