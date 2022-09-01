-- 데이터 조작어 (DML) 중 데이터를 입력하는 명령어 INSERT
-- 데이터 검색 or 조회 명령어 SELECT

-- insert into 테이블명 values(값, 값, ...) 의 형태
-- insert 사용 중 primary key를 줄 수 없을 때
-- 강제적으로 고유 번호값을 만드는 방법으로 primary key 부여
-- 그 고유한 번호값을 하나하나 지정해줄 수 없기 때문에 sequence 기능 활용
-- sequence 는 insert가 실패해도 sequence의 값은 진행이 되는것이 단점


-- 데이터 검색 가능한 SELECT ***
-- select distinct 컬럼명 , 컬럼명 as 별칭 || 컬럼명 별칭, 연산자, 통계함수
-- from 테이블명
-- where 조건식
-- group by 그룹대상
-- having 함수 포함 조건 // group에 대한 조건 설정
-- order by 정렬대상 ASC/DESC

-- distinct 는 중복 제거 역할
-- 컬럼명에 별칭 부여 방법 : as를 앞에 붙히기 (as 생략 가능)
-- 연산자 시리즈 첫번째 산술연산자 (+ , - , * , /)
-- 문자를 이어 붙혀주는 연산자 '||'
-- DUAL (더미 테이블)을 이용해 오라클 내의 유용한 내장함수(숫자함수, 문자함수, 날짜함수, 통계함수, NULL관련 함수)

-- 전체 데이터 중 조건에 맞는 데이터를 찾아주는 WHERE절(조건식)  
-- 연산자 시리즈 두번째 비교연산자(=, != , <>, <, >, <=, >=)

-- 연산자 시리즈 세번째 관계연산자 'AND'(초과 미만 이상 이하)와 'BETWEEN'(이상 이하)의 차이
-- 연속되지 않은 값들을 받아올 때 사용하는 'IN', 'OR'
-- 반대되는 값을 받아올 때 사용하는 'NOT'
-- NOT의 위치는 IN 앞에 위치해야함 // NOT IN

-- 연산자 시리즈 네번째 패턴연산자 : 문자열을 포함하는 검색
-- LIKE '%패턴%'의 형태 / LIKE 대신 '='(등호) 사용 불가능
--							=> 패턴을 문자 그대로 인식해버리기 때문

-- 연산자 시리즈 다섯번째 집합 연산자
-- 		UNION / UNION ALL (합집합)
--			: 중복되는 값을 제외하고 출력 / 중복 되더라도 모두 출력
--		INTERSECT (교집합)
--			: 집합들 중 공통되는 값들을 출력
--		MINUS (차집합)
--			: 앞에 있는 SELECT문 중에서 뒤에있는 SELECT문에는 없는 값 출력

-- 연산자를 마무리 하며 연산자의 우선순위 (왼쪽부터 우선순위)
-- 괄호 > 비교연산자 > NOT > AND > OR  	

-- WHERE 조건식 끝

-- GROUP BY : 특정 컬럼을 그룹으로 묶어 연산, 하나의 결과로 출력
--		ROLL UP : 컬럼에 대한 소계(SUBTOTAL)을 만들어 줌 

-- HAVING 절 VS WHERE 절
--	HAVING : GROUP BY로 GROUP화 시킨 그룹의 결과를 제한
-- 	WHERE  : 조건을 사용해서 결과를 제한

-- ORDER BY : 오름차순 ASC (기본값, 생략가능)
--			  내림차순 DESC 

----------------------------------------------------------------------
-- SUBQUERY(서브 쿼리) ***
-- SELECT문 안에 SELECT문 사용하기
-- 하나의 SQL문 안에 다른 SQL문이 중첩되어있는 질의문
-- 다른 테이블에서 가져온 데이터로 현재 테이블에 있는 정보를 찾거나 가공 할 때 사용
-- 데이터가 대량일 때 데이터를 모두 합쳐서 연산하는 'JOIN' 
-- 필요한 데이터만 찾아서 공급해주는 'SUBQUERY'

-- 주 질의문 (main query, 외부질의)와 부속질의 (sub query, 내부질의)로 구성

select s_name, s_price
	from snack
					where s_price < (
									select avg(s_price)
									from snack
									);
									
--	주 질의 						부속 질의
-- 평균가 보다 가격이 낮은 제품의 이름과 가격 정보를 조회한 것
-- 부분적으로 나누어 구성하면 가독성이 좀 더 좋아지고 조건에 맞게 잘 찾을 수 있음
-- 부속질의에 괄호는 필수

-- 메인 쿼리의 Where 절에서 서브쿼리의 결과와 비교할 때는 반드시 '비교 연산자' 사용 

-- 제품 중 최고가
select max(s_price) from snack;

-- 제일 비싼 제품 이름, 제조사, 가격
select distinct s_name, s_company, s_price 
	from snack
	where s_price = (
		select max(s_price)
		from snack
		);
-- 제일 싼 제품 제조사
select s_company 
	from snack 				
	where s_price = (
		select min(s_price) 
		from snack
		);
-- 평균가 보다 비싼 과자 종류
select count(s_name)
	from snack
	where s_price > (
		select avg(s_price)
		from snack
		);
-- 유통기한이 가장 오래 남은 과자의 전체정보
select * 
	from snack
	where s_bestbefore = ( 
		select max(s_bestbefore)
		from snack
		);
---------------------------------------------------
-- 과자 회사에 대한 테이블
select * from snack;
-- 회사이름, 주소, 직원수 
create table company(
	c_name varchar2(10 char) primary key,
	c_address varchar2(100 char) not null,
	c_employee number(3) not null
);						
insert into company values('오리온', '수원', 100);
insert into company values('하겐다즈', '프랑스', 500);
insert into company values('코카콜라', '미국', 700);
insert into company values('서울우유', '서울', 300);
insert into company values('오뚜기', '부천', 400);

select * from company;
drop table company cascade constraint purge; 
------------------------------------------------------------------
-- 직원수가 제일 적은 회사에서만드는 과자이름, 가격
select s_name, s_price
	from snack
	where s_company = (
		select c_name 
		from company
		where c_employee = (
			select min(c_employee)
			from company
		)
	);

-- 제일 비싼 과자를 만드는 회사는 어디에 있는지
select c_address
	from company 
	where c_name in (
		select s_company
		from snack
		where s_price = (
			select max(s_price)
			from snack
		)
	);
-- 서울에 있는 회사에서 만드는 제품의 평균가
select avg(s_price)
	from snack
	where s_company = (
		select c_name
		from company
		where c_address = '서울'
	);
-- 평균가 이상의 과자를 만드는 회사의 이름, 위치
select c_name, c_address
	from company
	where c_name in (
		select s_company
		from snack
		where s_price >= (
			select avg(s_price)
			from snack
		)
	);

-- '=' 등호 를 쓰면 단일한 값만 출력 함
-- 다중의 값을 출력하기 위해서는 'IN'을 사용






















