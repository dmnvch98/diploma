create table tutors
(
    id      int8 not null,
    user_id int8 not null,
    constraint fk_student foreign key (user_id) references users(id),
    primary key (id)
)
