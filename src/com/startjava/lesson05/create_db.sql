CREATE DATABASE Jaegers;

CREATE TABLE robots (
    id SERIAL PRIMARY KEY,
    modelName VARCHAR(40),
    mark VARCHAR(40),
    height NUMERIC,
    weight NUMERIC,
    status VARCHAR(40),
    origin VARCHAR(40),
    launch DATE,
    kaijuKill INT
);