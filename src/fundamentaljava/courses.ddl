--USE courses;
--DROP TABLE courses;
CREATE TABLE courses(
    courseID_PK BIGSERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(35),
    numberofdays INTEGER,
    cost FLOAT,
    publicschedule BOOLEAN,
    lastupdated DATE
);
--INSERT INTO courses(name, numberofdays, cost, publicschedule, lastupdated) VALUES ('Introduction to Java', 3, 1000.00, true, '2020-08-11');
--INSERT INTO courses(name, numberofdays, cost, publicschedule, lastupdated) VALUES ('Agile Programming Technique', 2, 650.00, false, '2020-12-01');