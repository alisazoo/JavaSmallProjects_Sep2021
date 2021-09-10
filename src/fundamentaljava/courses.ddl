USE courses;
DROP TABLE course;
CREATE TABLE course(
    courseID_PK INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(35),
    numberofdays INTEGER,
    cost FLOAT,
    publicschedule BOOLEAN,
    lastupdated DATE
);
-- INSERT INTO course(name, numberofdays, costperperson, publicschedule, lastupdated) VALUES ('Introduction to Java', 3, 1000.00, true, '2020-08-11');
-- INSERT INTO course(name, numberofdays, costperperson, publicschedule, lastupdated) VALUES ('Agile Programming Technique', 2, 650.00, false, '2020-12-01');