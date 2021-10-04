drop table if exists roles cascade;
create table roles
(
    id   bigserial primary key,
    name varchar(255) not null unique
);

insert into roles (name)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

drop table if exists user_role cascade;
create table user_role
(
    role_id bigserial references roles (id) on delete cascade,
    user_id bigserial references users (id)
);

insert into user_role (role_id, user_id)
values (2, 1);