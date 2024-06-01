create table emp(
    id INT(3),
    name CHAR(20),
    age INT(3),
    address VARCHAR(20),
    salary INT(6),
    dept_id VARCHAR(5)
);
insert into emp values(1,"Rahul",32,"Delhi",2000,"500");
insert into emp values(2,"Komal",25,"Pune",1500,"500");
insert into emp values(3,"Karan",23,"Pune",2000,"500");
insert into emp values(4,"Chirag",25,"Mumbai",6500,"501");
insert into emp values(5,"Harsh",32,"Mumbai",8500,"501");
insert into emp values(6,"Kajal",22,"Bilaspur",4500,"502");
insert into emp values(7,"Mahi",24,"Patna",10000,"502");
Select * from emp;