REM   Script: Activity 04
REM   alter and update

create table salesman( 
        salesman_id   int, 
        salesman_name varchar(20), 
        salesman_city varchar(20), 
        commision  int);

select * From salesman;

desc salesman


select * From salesman;

alter table salesman add grade int;

UPDATE salesman SET grade=100;

select * From salesman;

