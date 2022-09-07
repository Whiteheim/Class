-- 어떤 특정한 식당에 대한 테이블 구성
-- 식당 지점(지역) / 식당 주인 / 좌석 수
create table franchise(
	f_location varchar2(10 char) primary key,
	f_owner varchar2(5 char) not null,
	f_seat number(4) not null
);
insert into franchise values ('강남', '강길동', 150);
insert into franchise values ('을지로', '을길동', 250);
insert into franchise values ('홍대', '홍길동', 200);

drop table franchise cascade constraint purge;

-- 예약에 대한 테이블
-- 예약자 이름, 예약 시간, 예약자의 전화번호, 예약 지점
create table reservation(
	r_no number(4) primary key,
	r_name varchar2(10 char) not null,
	r_time date not null,
	r_phone varchar2(15 char) not null,
	r_location varchar2(20 char) not null
);
create sequence reservation_seq;
insert into reservation values (reservation_seq.nextval, '강철수', to_date('2022-09-25 17:00','YYYY-MM-DD HH24:MI'),
								'010-1234-5678', '강남');
insert into reservation values (reservation_seq.nextval, '을철수', to_date('2022-10-08 18:30','YYYY-MM-DD HH24:MI'),
								'010-9876-5432', '을지로');
insert into reservation values (reservation_seq.nextval, '홍철수', to_date('2022-11-01 19:00','YYYY-MM-DD HH24:MI'),
								'010-1478-5236', '홍대');

select * from reservation;
								
delete reservation
where r_name like '%dd%';

drop table reservation cascade constraint purge;
drop sequence reservation_seq;

select *
from franchise
where f_seat >= 200;


update reservation 
set in r_name = ? and r_time = ? and r_phone = ? 
where r_no = ?












