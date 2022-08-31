-- R(Read) 의 형태
-- 내림차순 순서대로 작성해야 함
select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭], [연산자사용], [통계함수], ...
	from [테이블명]
	where [조건식]
	group by [그룹대상]
	having [함수 포함 조건]
	order by [정렬대상 ASC/DESC(오름차순/내림차순)] -- 기본값은 오름차순


-- where절 (조건식)
--	전체 데이터 중 지정한 조건에 맞는 데이터를 찾아주는 문장
--	조건식에 사용할 연산자 (비교 연산자)
--	=, !=, ^=, <>, >, <, >=, <=, ...
--	!=, ^=, <> 모두 '같지않다'로 쓰이는 연산자
--	!= 와 <> 는 각각 표준화 하려고 이런 형식으로 통일되어짐
--	^= 몇몇 DBMS과 차별화를 두기위해 사용

-- 모든 과자 테이블
select * from snack; 
-- 가격이 3천원인 과자의 모든 정보를 조회
select * from snack where s_price = 3000;
-- 모든 과자 이름, 가격 조회
select s_name, s_price from snack;
-- 모든 과자 이름(가격) 조회 (ex: 콘칩(2000원))
-- || 문자열 플러스 // 별칭에 특수문자나 띄어쓰기를 넣을 땐 큰따옴표 사용
select s_name || '('|| s_price ||')' as "이름(가격)" from snack;

-- 2000 원 이하의 과자 중 최소가격
select min(s_price) as 최소가격 from snack where s_price <= 2000;
-- 모든 과자의 평균가
select avg(s_price) as 평균가격 from snack;
-- 과자의 이름과 가격의 30% 할인된 금액
select s_name as 제품명, s_price * 0.7 ||'원' as "30% 할인가"from snack; 
-- 3500원인 과자의 개수
select count(s_name) from snack where s_price = 3500;
-- 3000원 이하인 과자의 이름, 회사 이름
select s_name , s_company from snack where s_price <= 3000;

-------------------------------------------------------------------

-- 모든 과자의 이름, 가격, 유통기한
select s_name 제품명, s_price 가격, s_bestbefore 유통기한 from snack;
-- 모든 과자의 이름, 가격, 부가세(가격의 10%)
select s_name 제품명, s_price 가격, s_price * 0.1 부가세 from snack;
-- 모든 과자의 이름, 가격, 판매가(20% 할인)
select s_name 제품명, s_price 가격, s_price * 0.8 판매가 from snack;
-- 3000원 보다 비싼 과자들의 평균가
select avg(s_price) 평균가 from snack where s_price > 3000;
-- 모든 과자의 최고가, 최저가, 총 과자의 종류갯수
select max(s_price) 최고가, min(s_price) 최저가, count(s_name) from snack;
-- 3000원 이상인 과자의 전체 정보
select * from snack where s_price >= 3000;
-- 3000원 미만인 과자의 이름, 가격, 판매가(20% 할인)
select s_name 제품명, s_price 가격, s_price * 0.8 판매가 from snack where s_price < 3000;
-- 다운타우너 감자칩 가격 조회
select s_name 제품명, s_price 가격 from snack where s_name = '다운타우너 감자칩';
-- 오뚜기 회사의 제품 가격의 총 합
select sum(s_price) "가격 총 합" from snack where s_company = '오뚜기';
-- 9월 이내에 처리해야하는 과자 이름, 가격, 유통기한
select s_name 제품명, s_price 가격, s_bestbefore 유통기한 
	from snack 
	where to_char(s_bestbefore, 'MM') < '10';
--------------------------------------------------------------------------------------
-- 관계 연산자
-- NOT, AND, OR, BETWEEN, IN
-- AND & BETWEEN
-- 가격이 1000원 이상, 3000원 이하인 과자의 전체 내용 조회
-- AND
select * from snack where s_price >=1000 and s_price <= 3000;
-- BETWEEN
select * from snack where s_price between 1000 and 3000;
-- BETWEEN 
--		이상/ 이하로 조건의 범위를 정함 -> 1000원 초과 3000원 미만 인 범위를 조회할 때는 부적절함

-- 가격이 1000원, 20000원, 30000원인 과자의 전체 정보 조회
select * from snack where s_price = 1000 or s_price = 2000 or s_price = 3000; 

-- IN 연산자
select * from snack where s_price in (1000, 2000, 3000);
-- 연속되지 않은 값 들을 받아오고 싶을 때 사용

-- 결과값에 반대되는 값
select * from snack where s_price not in (1000, 2000, 3000);
-- NOT IN 으로 사용하면 된다

----------------------------------------------------------------
-- 패턴 연산자
-- 문자열을 포함하는 검색 : like '패턴' 의 형태
-- 패턴에는 '%' 기입
-- '%' : 어떤 값이 들어 올 지 문자열
-- like '%ㅋ'	: ㅋ으로 끝나는 문자열
-- like 'ㅋ%'	: ㅋ으로 시작하는 문자열 
-- like '%ㅋ%'	: ㅋ이 포함된 문자열
-- like 대신 ( = 'ㅋ%')
-- 			=> 등호를 사용하여 표현하면 패턴으로 인식 x
--				'ㅋ%'를 문자 그대로 인식해버림
--			=> like를 이용해 'ㅋ%' 이런 패턴의 값을 찾아 라고 표현함

-- '하'가 들어가는 회사에서 만든 제품의 이름 조회
select s_name from snack where s_company like '하%';
-- '우'가 들어가는 제품들의 평균가
select round(avg(s_price), 1) from snack where s_name like '%우%';
-- 오뚜기 제품 이거나, ~우유 인것 이름, 제조사, 가격 조회
select s_name 제품명, s_company 제조사, s_price 가격 
	from snack
	where s_name like '%우유%' or
	s_company like '오뚜기'; 

-- 파인트 or ml를 포함하는 제품의 이름, 제조사, 가격
select s_name 제품명, s_company 제조사, s_price 가격
	from snack
	where s_name like '%파인트' or
	s_name like '%ml';

	
select s_name 제품명, s_company 제조사, s_price 가격
	from snack where s_name
	like in ('%파인트%', '%ml%'); -- like ~ in은 같이 사용 불가능
	
-- REGEXP_LIKE(컬럼명, 패턴1|패턴2|...)
-- 여러개의 패턴을 찾고 싶다면 |(파이프)를 넣어 패턴 추가
-- 정규식(REGEX)을 이용하여 문자를 찾는 방법
-- '^X' : X값으로 시작하는 문자열 찾기
-- 'X$' : 패턴값으로 끝나는 문자열
select s_name, s_company, s_price from snack
	where regexp_like(s_name, '^딸기|l$');
	

---------------------------------------------------------------------
-- 집합 연산자
-- 합집합 
-- UNION	: 중복값 제외 후 출력
select 1 id, '수학' subject, 90 score from dual
	union
select 1 id, '수학' subject, 90 score from dual
	union
select 1 id, '수학' subject, 90 score from dual;
-- UNION ALL: 값이 중복 되더라도 모두 출력
select 1 id, '수학' subject, 90 score from dual
	union all
select 1 id, '수학' subject, 90 score from dual
	union all
select 1 id, '수학' subject, 90 score from dual;

-- 교집합
-- INTERSECT : 두 테이블의 집합 중 공통으로 받는 값
	
select 1 id, '국어' subject, 90 score from dual
	union
select 2 id, '수학' subject, 80 score from dual
	intersect
select 1 id, '국어' subject, 90 score from dual;

-- 차집합
-- MINUS : 첫번째 SELECT문에서 두번째 SELECT문에 없는 값을 출력

select 1 id, '수학' subject, 90 score from dual
	minus
select 1 id, '수학' subject, 80 score from dual 
	minus
select 1 id, '수학' subject, 90 score from dual;

-- 회사이름 서울우유, 가격이 1000원 이하 3000원이상의 제품
-- 연산자 우선순위 (오른쪽이 최우선 순위)
-- OR > AND > NOT > 비교연산자 > 괄호
select * from snack 
	where s_company like '하%' and (s_price <= 1000 or s_price >= 3000);
	
---------------------------------------------------------------------
-- Group by : 그룹으로 묶어 연산하여 하나의 결과를 나타냄
-- 회사 별 제품의 평균 가격, 최소가격, 최고가격
-- Group by 사용 전 : 단일한 값으로 출력
select avg(s_price), min(s_price), max(s_price)
	from snack

-- 회사별로 그룹을 지어 값을 출력
select s_company, avg(s_price), min(s_price), max(s_price)
	from snack
	group by s_company;

-- Rollup 연산자
-- group by rollup (그룹 대상)
-- 컬럼에 대한 소계(subtotal)를 만들어줌
-- group by 절의 컬럼 갯수가 n개라면, rollup 을 쓰면 n+1 로 나타남

-- 회사이름, 회사별 제품 총 가격 합계와 모든 제품들의 가격 합계	
select s_company, sum(s_price)
	from snack
	group by rollup(s_company);

-- => NULL에 대한 값을 나타내고 싶음 => DECODE 함수 사용
-- DECODE(컬럼명, 조건, 조건에 맞는 결과값, 조건에 맞지 않을 때 결과값)
-- s_company 가 null값이면 '전체' or 기존값
-- 조건을 변경하면 다른 조건일 때도 값 변경 가능

select decode(s_company, null, '합계', s_company) s_company, sum(s_price)
	from snack
	group by rollup(s_company);

select nvl2(s_company, s_company, '합계') s_company, sum(s_price)
	from snack
	group by rollup(s_company);
-- DECODE 사용시 주의점
--		: 조건 자리에는 비교연산자가 불가능함
--		  산술 연산자는 가능
--------------------------------------------------------------------
-- Having : Group by절에 의해 생성된 결과 중 원하는 조건에 부합하는 자료만 찾고자 할 때 사용
-- Having / Where 
--	: 모두 조건을 이용해 원하는 조건에 맞는 데이터만 산출
--	Having의 경우 Group의 결과에 제한
--	Where의 경우 조건을 사용하여 결과를 제한

-- 회사별 과자 평균가가 2000원 이상인 회사의 이름과 과자의 평균값 조회
select s_company, avg(s_price)
	from snack
	group by s_company
	having avg(s_price) >= 2000;
--------------------------------------------------------------------
-- Order by : 정렬, 기본값은 오름차순 ASC / 내림차순 DESC
-- where + group by + having + order by  순서로 작성해야 함
-- 오뚜기 or 오리온 제품의 평균가격이 1800원 이상일 때 각 회사의 평균 가격 내림차순 정렬
select s_company, avg(s_price)
	from snack
	where s_company in ('오뚜기','오리온')
	group by s_company
	having avg(s_price) >= 1800 -- 그룹의 결과를 평균값 1800원 이상으로 제한한 상태
	order by avg(s_price) desc;
	
	























