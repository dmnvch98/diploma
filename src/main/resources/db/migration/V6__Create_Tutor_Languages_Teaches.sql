create table Tutor_languagesTeaches
(
    tutor_id    int8 not null,
    languageId int8 not null,
    levelId    int8 not null,
    constraint fk_user foreign key (tutor_id) references tutors(id),
    constraint fk_languages foreign key (languageId) references language(id),
    constraint fk_language_level foreign key (levelId) references language_level(id),
    primary key (tutor_id, languageId, levelId)
)

