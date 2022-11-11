-- coffee table
-- 커피 이름 / 가격 / 원두
create table coffee(
	cNo number(10) primary key,
	cName varchar2(20 char) not null,
	cPrice number(10) not null,
	cBean varchar2(10 char) not null
);

create sequence coffee_seq;

select * from coffee;

