
## Employee Table

```sql

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

```

## Dept Table

```sql

create table dept(deptno numeric(4) primary key, dname varchar(20) not null, location varchar(30));

insert into dept values(10,'IT', 'Bangalore');
insert into dept values(20,'SALES', 'Mumbai');
insert into dept values(30,'Accounts', 'Kolkata');
insert into dept values(40,'HR', 'Delhi');



```

