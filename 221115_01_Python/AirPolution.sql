create table airPollution(
	aNo number(10) primary key,
	aName varchar2(5 char) not null,
	PM10 number(4, 1) not null,
	PM25 number(4, 1) not null
);

select * from airPollution;
create sequence airPollution_seq;


drop table airPollution cascade constraint purge;
-----------------------------------------------
-- 학생 table
-- 이름 / 생일 / 강의장 번호 / 중간고사 점수 / 기말고사 점수
create table nov15_student(
	sNo number(10) primary key,
	sName varchar(5 char) not null,
	sBirth date not null,
	sClassroom number(3) not null,
	sMidtermExam number(4, 1) not null,
	sFinalExam number(4, 1) not null
);

select sName, to_char(sbirth, 'yyyy-mm-dd (day)'), sClassroom,
	sMidtermExam, sFinalExam, ((sMidtermExam + sFinalExam) / 2)
from NOV15_STUDENT;

select sbirth from nov15_student;

create sequence nov15_student_seq;
select * from NOV15_STUDENT;


-- drop table nov15_student cascade constraint purge;
-- drop sequence nov15_student_seq;

-----------------------------------------------
-- 강의장 table
-- 강의장 번호 / 강의장 위치
-- 1강의장 : 7층 복도 오른쪽 / 2강의장 : 7층 복도 왼쪽 끝
-- 3강의장 : 7층 복도 왼쪽 첫번째 / 4강의장 : 8층 왼쪽 / 5강의장 : 6층 오른쪽

create table nov15_classRoom(
	cNo number(3) primary key,
	cLoca varchar2(20 char) not null
);

insert into nov15_classRoom values('1', '7층 복도 오른쪽');
insert into nov15_classRoom values('2', '7층 복도 왼쪽 끝');
insert into nov15_classRoom values('3', '7층 복도 왼쪽 첫번째');
insert into nov15_classRoom values('4', '8층 왼쪽');
insert into nov15_classRoom values('5', '6층 복도 오른쪽');






























