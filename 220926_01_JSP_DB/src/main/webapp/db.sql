create table sep26_apple(
	a_location varchar2(10 char) primary key,
	a_name varchar2(10 char) not null,
	a_color varchar2(10 char) not null,
	a_price number(8) not null,
	a_flavor varchar2(100 char) not null
);

insert into sep26_apple values('경산', '홍옥', '빨강', '4000', '아삭하고 달콤');
insert into sep26_apple values('충주', '부사', '다홍', '5000', '조금 무름');
insert into sep26_apple values('서산', '풋사과', '초록', '4500', '싱그러움');
select * from sep26_apple;



