USE Demo;
DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
                       id integer not null primary key,
                       name varchar(80) not null
);

INSERT INTO USERS (id, name) values(1, 'Test User1');
INSERT INTO USERS (id, name) values(2, 'Test User2');
INSERT INTO USERS (id, name) values(3, 'Test User3');
