CREATE DATABASE test;

CREATE TABLE test (
	id int primary key,
	firstName varchar(30) not null,
	lastName varchar(50)
);

INSERT INTO test (id, firstName, lastName) VALUES
(1, 'Unai', 'Perez'),
(2, 'Gorka', 'Ramirez'),
(3, 'Iker', 'Berecibar');