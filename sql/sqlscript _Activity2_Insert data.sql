REM   Script: Activity 02
REM   Insertion of data into salesman  table

create table salesman( 
        salesman_id   int, 
        salesman_name varchar(20), 
        salesman_city varchar(20), 
        commision  int);

select * From salesman;

desc salesman


INSERT INTO salesman 
VALUES (5001, James Hong, New york, 15);

INSERT INTO salesman 
VALUES (5001, 'James Hong', 'New york', 15);

INSERT INTO salesman VALUES (5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    -- With specific columns names 
    INTO salesman(salesman_id, salesman_name,salesman_city, commision) VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman(salesman_id, salesman_name,salesman_city, commision) VALUES(5006, 'McLyon', 'Paris', 14) 
    -- Without column names 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * From salesman;

