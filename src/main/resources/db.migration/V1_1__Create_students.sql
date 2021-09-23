drop table if exists students;
CREATE TABLE students
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) not null,
    mark INTEGER      not null
);

INSERT INTO students (name, mark)
VALUES ('Jhon', 8),
       ('Nick', 10),
       ('Ann', 7),
       ('Student1', 3),
       ('Student2', 6),
       ('Student3', 8),
       ('Student4', 9),
       ('Student5', 10),
       ('Student6', 7),
       ('Student7', 4),
       ('Student8', 2),
       ('Student9', 1),
       ('Student10', 10),
       ('Student11', 8),
       ('Student12', 7),
       ('Student13', 5),
       ('Student14', 9),
       ('Student15', 6),
       ('Student16', 8),
       ('Student17', 7),
       ('Student18', 4),
       ('Student19', 7),
       ('Student20', 7);
