create table nov18_loc(
	lNo number(10) primary key,
	lName varchar2(30 char)	not null,
	lPhone varchar2(15 char) default '-',
	lLongitude number(11, 6) not null,
	lLatitude number(11, 6) not null
);
create sequence nov18_loc_seq;
select * from NOV18_LOC;
--drop table nov18_loc cascade constraint purge;
--drop sequence nov18_loc_seq;

-- NVL 함수 : null일때 지정값으로 대치하는 함수
-- NVL(값, 값이 null일때 대체값)
select nvl(null, '-'), nvl('null', '-') from dual -- dual = 더미 테이블

-- NVL2 함수 : null의 여부에 따라 지정한 값으로 대치하는 함수
-- NVL2(값, 값이 있을 때 대체값, 값이 없을때 대체값)
select nvl2(null, 'A', 'B'), nvl2('null', 'A', 'B') from dual;




















