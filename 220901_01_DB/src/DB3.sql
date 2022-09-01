-- select distinct, 컬럼명, 컬럼명 as 별칭 | 컬럼명 별칭, 연산자, 통계함수
--	from 테이블명
--	where 조건식
-- 	group by 그룹 대상 컬럼 
-- 	having 함수 포함 조건식
-- order by 정렬 대상 컬럼명 asc / desc
--------------------------------------------------------------------------
-- 요식업 프랜차이즈 테이블

-- 홍콩반점 판교점 - 홍길동씨가 운영, 100석 
-- 홍콩반점 종로점 - 김길동씨가 운영, 80석
-- 한신포차 강남점 - 홍길동씨가 운영, 150석
-- 부천포차 부천점 - 최길동씨가 운영, 130석

-- 홍길동, 1990-03-01 , 남
-- 김길동, 1992-02-01 , 여
-- 홍길동, 1991-12-12 , 여
-- 최길동, 1989-09-01 , 남

create table bistro(

	b_no number(3) primary key,
	b_name varchar2(10 char) not null,
	b_location varchar2(10 char) not null,
	b_owner number(4) not null,				-- 상장님 고유 번호
	b_seat number(4) not null
);

create table owner(
	o_no number(3) primary key,
	o_name varchar2(10 char) not null,
	o_birth date not null,
	o_gender varchar2(2 char) not null
);

create sequence bistro_seq;
create sequence owner_seq;

--drop sequence owner_seq;
--drop sequence bistro_seq;
--drop table bistro cascade constraint purge;
--drop table owner cascade constraint purge;

insert into bistro values(bistro_seq.nextval, '홍콩반점', '판교', 1, 100);
insert into bistro values(bistro_seq.nextval, '홍콩반점', '종로', 2, 80);
insert into bistro values(bistro_seq.nextval, '한신포차', '강남', 3, 150);
insert into bistro values(bistro_seq.nextval, '부천포차', '부천', 4, 130);

select * from bistro;

insert into owner values(owner_seq.nextval, '홍길동', 
	to_date('1990-03-01', 'YYYY-MM-DD'), '남자');
insert into owner values(owner_seq.nextval, '김길동', 
	to_date('1992-02-01', 'YYYY-MM-DD'), '여자');
insert into owner values(owner_seq.nextval, '홍길동', 
	to_date('1991-12-12', 'YYYY-MM-DD'), '여자');
insert into owner values(owner_seq.nextval, '최길동', 
	to_date('1989-09-01', 'YYYY-MM-DD'), '남자');

select * from owner;

----------------------------------------------------------------------
create table menu(
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_b_no number(3) not null
);

create sequence menu_seq;

-- 짜장면 5000원 , 홍콩반점 판교점에서 판매
-- 짬뽕 6000원
-- 꿔바로우 16000원
-- 멘보샤 8000원
-- 경장육사 18000원
insert into menu values(menu_seq.nextval, '짜장면', 5000, 1);
insert into menu values(menu_seq.nextval, '짬뽕', 6000, 1);
insert into menu values(menu_seq.nextval, '꿔바로우', 16000, 1);
insert into menu values(menu_seq.nextval, '멘보샤', 8000, 1);
insert into menu values(menu_seq.nextval, '경장육사', 18000, 1);
-- 불닭발 12000원, 한신포차 강남점에서 판매
-- 계란말이 8000원
-- 과일안주 6000원
-- 모듬전 12000원
-- 알탕 18000원
insert into menu values(menu_seq.nextval, '불닭발', 12000, 2);
insert into menu values(menu_seq.nextval, '계란말이', 8000, 2);
insert into menu values(menu_seq.nextval, '과일안주', 6000, 2);
insert into menu values(menu_seq.nextval, '모듬전', 12000, 2);
insert into menu values(menu_seq.nextval, '알탕', 18000, 2);
-- 짜장면 5000원 , 홍콩반점 종로
-- 마라탕 8000원
-- 마라룽샤 16000원
-- 양꼬치 3000원
-- 라조기 18000원
insert into menu values(menu_seq.nextval, '짜장면', 5000, 3);
insert into menu values(menu_seq.nextval, '마라탕', 8000, 3);
insert into menu values(menu_seq.nextval, '마라룽샤', 16000, 3);
insert into menu values(menu_seq.nextval, '양꼬치', 3000, 3);
insert into menu values(menu_seq.nextval, '라조기', 18000, 3);
-- 오뎅탕 8000원,부천포차 부천점
-- 육회 12000원	
-- 야채곱창 16000원
-- 계란말이 7500원
-- 치킨 21500원
insert into menu values(menu_seq.nextval, '오뎅탕', 8000, 4);
insert into menu values(menu_seq.nextval, '육회', 12000, 4);
insert into menu values(menu_seq.nextval, '야채곱창', 16000, 4);
insert into menu values(menu_seq.nextval, '계란말이', 7500, 4);
insert into menu values(menu_seq.nextval, '치킨', 21500, 4);

select * from menu;



























