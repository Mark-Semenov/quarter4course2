drop table
    if exists users cascade;
create table users
(
    id       bigserial primary key,
    login    VARCHAR(255) not null,
    password VARCHAR(255) not null
);
