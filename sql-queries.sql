create database hm_db;
use hm_db;
create table employee(emp_id numeric(5), emp_name varchar(50), 
				salary numeric(8,2), join_date date, dept_id numeric(3));
                
show tables;
desc employee;

alter table employee add mgr numeric(5);

drop table employee;

create table employee(emp_id numeric(5) primary key, 
			emp_name varchar(50) not null, 
			mgr numeric(5), salary numeric(8,2) not null, 
            join_date date, dept_id numeric(3) not null);
            
INSERT into employee values(1001,'Harsh Sharma',5001, 35000, '2021-10-25',101);

INSERT into employee values(1002,'Kunal Dutta',5002, 
									45000, '2020-11-25',201);
                                    
INSERT into employee values(5001,'Suraj Reddy',null, 
									65000, '2018-05-10',101);
                                    
INSERT into employee values(5002,'Priyanka Sharma',null, 
									68000, '2018-01-25',201);
                                    
INSERT into employee values(2003,'Yash Sharma',5001, 
									57200, '2019-10-15',101,'Developer');
                                    
INSERT into employee values(2004,'Sreya Dutta',5002, 
									47500, '2020-10-12',102,'Analyst');  
                                    
INSERT into employee values(1005,'Vamsi Mohan',5001, 
									38500, '2021-12-10',101,'Analyst');   
                                    
INSERT into employee values(1006,'Harish Reddy',5002, 
									48500, '2020-12-10',401,'Analyst'); 
                                    
                                    
SELECT * from employee;

UPDATE employee set salary = 46000 where emp_id = 1002;

DELETE from employee where emp_id = 5002;

truncate table employee;

delete from emplyee;

set autocommit=0;

savepoint p1;

delete from employee where salary>40000;

select * from employee;

rollback to p1;

set autocommit=1;

set sql_safe_updates = 0;
            
-- find the employees who have salary more than 50000 --
select * from employee where salary>50000;

-- find the employees who have salary in between 40k and 50k --

select * from employee where salary between 40000 AND 50000;

-- Find the employees belonging to dept 101 --

-- find the employees who joined on 2020-10-10, 2018-01-25 and 2020-11-25 --

select * from employee where join_date = '2020-10-10' OR join_date = '2018-01-25' OR join_date = '2020-11-25' ;
SELECT * FROM employee where join_date IN('2020-10-10', '2018-01-25','2020-11-25');


-- find employees who are not reporting to any manager --

select * from employee where mgr IS NULL;


-- find the employees where the salary is not in the range of 30k-40k

select * from employee where salary NOT between 30000 AND 40000;

-- find the employees who joined in the year 2021

SELECT * FROM employee where extract(year from join_date)=2021;
SELECT * FROM employee where join_date LIKE '2021-%';
SELECT * from employee where join_date between '2021-01-01' AND '2021-12-31';


-- Find the employees where namers starts with P --

select * from employee where emp_name LIKE 'P%';

-- Find the people who joined in the month of october


-- Find the employees along with their Annual Salary --

select emp_id, emp_name, salary*12 as "Annual Salary" from employee;

-- Find the employees along with their total experience --

select emp_id, emp_name, join_date , datediff(now(),join_date)/365 as 'Experience' from employee;

-- ORDERING --
SELECT * FROM employee order by salary desc;


-- Find the employees sort by experience --

select emp_id, emp_name, join_date , mgr, datediff(now(),join_date)/365 as 'Experience' from employee order by join_date desc;

-- ADD A Coulmn role to our employee table --

-- 1001 - Developer
-- 1002 - Technical Assistant
-- 1003 - Developer
-- 1004 - Project Manager
-- 1005 - Manager


-- Display unique jobs from the table --

select distinct role from employee;

alter table employee add role varchar(30);

update employee set role='Project Manager' where emp_id = 5001; 

select * from employee;

-- find the total employees from the table --

select count(*) as "total employees" from employee;

-- find the total employees in each dept --

select dept_id, count(*) as "total employees" from employee group by dept_id;

-- find average salary of dept 201 --

select dept_id, avg(salary) as 'average salary' from employee 
						where dept_id=201 group by dept_id;
                        
select dept_id, avg(salary) as 'average salary' from employee 
						 group by dept_id HAVING dept_id=201;

-- find the min, max, average salaries and total employees dept wise

-- find the average salaries of the dept where total no of employees is more than 1

select dept_id, avg(salary) as "Average Salary", count(*) as "Total Employees"
								from employee group by dept_id having count(*)>1;


-- DISPLAY the dept_ids and total employees in ascending order--
 

-- Query from Multiple Tables --

create table dept(dept_id numeric(3) primary key, dept_name varchar(30), location varchar(30));


insert into dept values(101, 'IT', 'E-City');
insert into dept values(102, 'HR', 'HSR');
insert into dept values(201, 'Accounts', 'BTM');
insert into dept values(301, 'Sales', 'Kormangala');

select * from dept;


select e.emp_id, e.emp_name, e.dept_id, d.dept_name, d.location from employee e left join dept d on e.dept_id=d.dept_id; 


create table emp(EMPNO numeric(04),ENAME varchar(30),JOB varchar(30),HIREDATE date,MGR int,SAL int,COMM int,DEPTNO int);
desc emp;
insert into emp values(7369,'SMITH','CLERK','1980-12-17',7902,800,NULL,20);
insert into emp values(7499,'ALLEN','SALESMAN','1981-02-20',7698,1600,300,30);
insert into emp values(7521,'WARD','SALESMAN','1981-02,22',7698,1250,500,30);
insert into emp values(7566,'JONES','MANAGER','1981-04-02',7839,2975,NULL,20);
insert into emp values(7654,'MARTIN','SALESMAN','1981-09-28',7698,1250,1400,30);
insert into emp values(7698,'BLAKE','MANAGER','1981-05-01',7839,2850,NULL,30);
insert into emp values(7782,'CLARK','MANAGER','1981-06-09',7839,2450,NULL,10);
insert into emp values(7788,'SCOTT','ANALYST','1987-04-19',7566,3000,NULL,20);
insert into emp values(7839,'KING','PRESIDENT','1981-11-17',NULL,5000,NULL,20);
insert into emp values(7844,'TURNER','SALESMAN','1981-09-08',7698,1500,0,30);
insert into emp values(7876,'ADAMS','CLERK','1987-05-23',7788,1100,NULL,20);
insert into emp values(7900,'JAMES','CLERK','1981-12-03',7698,950,NULL,30);
insert into emp values(7902,'FORD','ANALYST','1981-12-03',7566,3000,NULL,20);
insert into emp values(7934,'MILLER','CLERK','1982-01-23',7782,1300,NULL,10);


drop table dept;


create table dept(deptno numeric(4) primary key, dname varchar(20) not null, location varchar(30));

insert into dept values(10,'IT', 'Bangalore');
insert into dept values(20,'SALES', 'Mumbai');
insert into dept values(30,'Accounts', 'Kolkata');
insert into dept values(40,'HR', 'Delhi');


select * from emp;


select * from dept;

select empno, ename, e.deptno, dname, location from emp e right join dept d using(deptno); 

-- find the employees who are working in 'Kolkata' --

-- find all the employees working in IT dept --

select deptno from dept where dname='IT';

SELECT * from emp where deptno = 
				(select deptno from dept where dname='IT');

-- find the dept details with the no of employees working there--

use hm_db;

select d.*, count(*) as "No of Employees" from emp e join dept d 
										using(deptno) group by d.deptno; 
                                        
select d.*,(select count(*) from emp e where e.deptno=d.deptno) 
											as "No of Employees" from dept d;




-- Find the details of the mgrs --

select distinct e.* from emp e join emp m on e.empno=m.mgr;

-- Find the no. of employees under each manager --

select e.empno,e.ename, count(*) as "Employees working under them" 
			from emp e join emp m on e.empno=m.mgr group by e.empno,e.ename;

-- Subqueries --

select distinct mgr from emp;

select * from emp where empno in(select distinct mgr from emp);


-- Find the employees not working in Kolkata --

select * from emp where deptno <> (select deptno from dept where location = 'Kolkata');



create table emp_dept_30 as(select * from emp where deptno = 100);

select * from emp_dept_30;







            