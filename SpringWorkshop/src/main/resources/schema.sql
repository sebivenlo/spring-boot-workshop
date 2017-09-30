-- recreate

DROP TABLE IF EXISTS PROGRAM_COURSES;
DROP TABLE IF EXISTS ACCOUNT;
DROP TABLE IF EXISTS STUDENT;
DROP TABLE IF EXISTS DEGREE ;
DROP TABLE IF EXISTS COURSE;
DROP TABLE IF EXISTS STUDY_PROGRAM;

-- schema

CREATE TABLE DEGREE(
ID serial primary key,
DEGREE varchar(80)
);

CREATE TABLE COURSE(
ID serial primary key,
COURSE varchar(100),
CREDIT int,
SEMESTER int
);

CREATE TABLE STUDY_PROGRAM(
ID serial primary key,
STUDY_PROGRAM varchar(100)
);

CREATE TABLE STUDENT(
ID serial primary key,
NAME varchar(20),
SURNAME varchar(20),
FULL_TIME bool,
ENROL_YEAR int,
SEMESTER int,
DEGREE_ID int,
STUDY_PROG_ID int,
foreign key (DEGREE_ID) references DEGREE(ID),
foreign key (STUDY_PROG_ID) references STUDY_PROGRAM(ID)
);

CREATE TABLE PROGRAM_COURSES(
ID serial primary key,
PROGRAM_ID int, 
COURSE_ID int,
foreign key (PROGRAM_ID) references STUDY_PROGRAM(ID),
foreign key (COURSE_ID) references COURSE(ID)
);

CREATE TABLE ACCOUNT(
ID serial primary key,
STUDENT_ID int,
MAIL varchar(70),
PASSWORD varchar(50),
foreign key (STUDENT_ID) references STUDENT(ID)
);