--counting the number of employees in each department
Select dept_id, count(dept_id) from emp group by dept_id;
Select dept_id, count(*) from emp group by dept_id;
--this gives total salary for each department 
select dept_id, sum(salary) from emp group by dept_id;
--total employees in dept address wise;
Select address,count(address) from emp group by address;
Select address,count(address) from emp group by address;
--Select dept_id,address,count(address) group by address;error
Select dept_id,address,count(address) from emp group by address,dept_id;
--here address is also grouped by department so dept is necessary 