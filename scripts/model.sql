begin;

drop table customer;

CREATE TABLE customer(
    login VARCHAR(20) PRIMARY KEY NOT NULL,
    password VARCHAR(20) NOT NULL,
    email VARCHAR(60),
    account double precision
);

commit;