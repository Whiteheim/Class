-- 음료 테이블 / 카페 테이블 만들기
-- 음료 테이블 : 음료 이름 / 가격 / 카페이름
create table beverage(
	b_name varchar2(10 char) primary key,
	b_price number(4) not null,
	b_cafe varchar2(10 char) not null
);

-- 카페 테이블 : 카페이름 / 지역 / 좌석수
create table cafe(
	c_name varchar2(10 char) primary key,
	c_location varchar2(10 char) not null,
	c_seat number(3) not null
	
);
-- [조건] 각 테이블에서 커피, 카페이름 고유값

-- 조건에 맞는 테이블 생성
-- 카페 A : 서울, 100석 
insert into cafe values('A카페', '서울', '100');
-- 아메리카노 2000 / 라떼 3000 / 녹차 2500
insert into beverage values('아메리카노', 2000, 'A카페');
insert into beverage values('라떼', 3000, 'A카페');
insert into beverage values('녹차', 2500, 'A카페');
-- 카페 B : 판교, 80석
insert into cafe values('B카페', '판교', '80');
--	홍차 2500 / 스무디 3000 / 에스프레소 4000
insert into beverage values('홍차', 2500, 'B카페');
insert into beverage values('스무디', 3000, 'B카페');
insert into beverage values('에스프레소', 4000, 'B카페');

drop table beverage cascade constraint purge;
-- 3. 쿼리문 작성
-- 평균가 보다 비싼 음료 종류의 가짓수
select count(b_name)
	from beverage
	where b_price > (
		select avg(b_price)
		from beverage
	);

-- 제일 싼 음료를 파는 카페의 이름
select c_name 
	from cafe
	where c_name = (
		select b_cafe
		from beverage
		where b_price = (
			select min(b_price)
			from beverage
		)
	);
	
--	서울에 있는 카페에서 만드는 음료의 평균가
select avg(b_price)
	from beverage
	where b_cafe = (
		select c_name
		from cafe
		where c_location = '서울'
	);
	
-- 좌석이 90석 이상인 카페에서 파는 음료의 이름
select b_name
	from beverage
	where b_cafe = (
		select c_name
		from cafe
		where c_seat >= 90
	);
	
-- 평균가 이하인 음료의 이름
select b_name 
	from beverage
	where b_price <= (
		select avg(b_price)
		from beverage
	);

-- 가장 비싼 음료를 파는 카페의 위치
select c_location
	from cafe
	where c_name = (
		select b_cafe
		from beverage
		where b_price = (
			select max(b_price)
			from beverage
		)
	);

















