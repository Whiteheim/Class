create table student(
	s_no number (3) primary key,
	s_name varchar2 (5 char) not null,
	s_nickname varchar2 (5 char) not null
)

create sequence student_seq;
select * from student;
drop sequence student_seq;
drop table student cascade constraint purge; 

create table test(
	t_name varchar2 (10 char) primary key,
	t_date date not null
	)
select * from test;
