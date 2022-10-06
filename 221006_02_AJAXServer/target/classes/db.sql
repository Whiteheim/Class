create table fruit(
	f_name varchar2 (10 char) primary key,
	f_price number(5) not null
)

insert into fruit values('사과', 5000);
insert into fruit values('바나나', 3000);
insert into fruit values('딸기', 6000);
insert into fruit values('거봉', 6000);
insert into fruit values('멜론', 8000);
insert into fruit values('수박', 1300);

select * from fruit;
