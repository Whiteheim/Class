select * from bistro;
select * from owner;
select * from menu;
------------------------------------------------------------
-- 좌석 수 제일 많은 식당 운영하는 사람의 정보
select *
	from OWNER
	where o_no = (
		select b_owner
		from bistro
		where b_seat = (
			select max(b_seat)
			from bistro
		)
	);

-- 프랜차이즈 메뉴전체의 이름, 가격을 가격오름차순
-- -> 가격이 같다면 메뉴명을 가나다 역순
-- 정렬을 여러번 할 때 => order by 컬럼명, 컬럼명
select m_name, m_price
	from MENU
	order by m_price, m_name desc;
	
-- 모든 사장들의 이름, 생일
select o_name, o_birth
	from owner;
	
-- 식당 종류 수
select distinct count(*)
	from bistro; 
	
-- 메뉴 전체의 평균가
select avg(m_price)
	from menu;
-------------------------------------------------
-- 제일 비싼 메뉴의 이름, 가격
select m_name 메뉴명, m_price 가격
	from menu
	where m_price = (
		select max(m_price)
		from menu
	);

-- 최연장자 사장님의 이름, 생일
-- subquery가 날짜에도 적용됨 (최연장자 = 최소 생일 값)
select o_name 이름, o_birth 생년월일
	from owner
	where o_birth = (
		select min(o_birth)
		from owner
	);
	
-- 좌석의 수가 제일 적은 식당의 이름, 지점명, 좌석수
select b_name 점포명, b_location 지점명, b_seat 좌석수
	from bistro
	where b_seat = (
		select min(b_seat)
		from bistro
	);

-- 홍콩반점 판교점을 운영하는 사람의 이름과 생일
select o_name 이름, o_birth 생년월일
	from owner
	where o_no = (
		select b_owner
		from BISTRO
		where b_name = '홍콩반점' and b_location = '판교'
	);
	
-- '짜장'이 들어간 음식을 먹을 수 있는 가게이름과 지점
select b_name 점포명, b_location 지점명
	from bistro 
	where b_no in (
		select m_b_no
		from menu
		where m_name like '%짜장%'
	);
	
-- 좌석수가 제일 많은 식당을 운영하는 사람의 모든 정보
select *
	from OWNER
	where o_no = (
		select b_owner
		from BISTRO
		where b_seat = (
			select max(b_seat)
			from bistro
		)
	);

---------------------------------------------------------
-- 최연소 사장님의 가게 메뉴의 이름과 가격
select m_name 메뉴명, m_price 가격
	from MENU
	where m_b_no = (
		select b_no
		from BISTRO
		where b_owner = (
			select o_no
			from OWNER
			where o_birth = (
				select max(o_birth)
				from OWNER
			)
		)
	);
---------------------------------------------------------
-- 여러 테이블 'JOIN'
--		: 여러개의 테이블을 붙혀 RAM에 잠시 저장해두는 것

-- 테이블을 붙여 사용 가능하지만
-- 테이블들이 합쳐지면서 나타낼 수 있는 모든 값들을 나타내기 때문에
select * from BISTRO, OWNER; 

-- 조건식을 사용해야함.
select * from BISTRO, OWNER where o_no = b_owner;

-- 전체식당 이름, 지점명, 사장님의 이름, 사장님 생일
select b_name, b_location, o_name, o_birth
	from BISTRO, OWNER
	where o_no = b_owner;
	
-- 전체 메뉴명, 가격, 식당이름, 지점명
select m_name, m_price, b_name, b_location
	from MENU, BISTRO
	where m_b_no = b_no;
	
-- 좌석의 수가 50개 이상인 식당의 메뉴명, 가격, 식당이름, 지점명, 좌석수
select m_name, m_price, b_name, b_location, b_seat
	from MENU, BISTRO
	where m_b_no = b_no 
		and b_seat >= 50;

-- 규모가 제일 큰 식당의 메뉴명, 가격, 식당이름, 지점명, 좌석수
select m_name, m_price, b_name, b_location, b_seat
	from MENU, BISTRO
	where m_b_no = b_no 
		and b_seat = (
			select max(b_seat)
			from BISTRO
		);

-- 최연장자 사장님네 전체 메뉴명, 가격, 식당이름, 지점명, 사장님 이름, 생일
--		메뉴명은 가나다 순 -> 같은 메뉴면 식당이름 가나다
select m_name, m_price, b_name, b_location, o_name, o_birth
	from MENU, BISTRO, OWNER
	where m_b_no = b_no 
		and b_owner = o_no
		and o_birth in (
			select min(o_birth)
			from OWNER
			)
	order by m_name, b_name;
---------------------------------------------------------------------
-- 메뉴 데이터의 개수를 나누어 페이지로 설정
-- 메뉴에 대한 번호 (primary key)
--		Sequence로 처리
-- 			-> insert에 실패해도 값이 설정이됨
--	메뉴 데이터도 삭제 가능
-- => 메뉴 번호가 정확한 순서로 나올 수 없음

-- Rownum(가상필드) ****************
--		select 할 때 마다 자동으로 부여가 됨
--		'*'와는 같이 사용 불가
--		order by 보다 먼저 부여가 됨 
--		무조건 1번부터 조회

-- 가나다순으로 정렬, MENU 전체 정보 조회
select rownum, m_no, m_name, m_price, m_b_no 
from MENU
order by m_name;

-- 메뉴명을 가나다 순으로 정렬하여 menu 테이블 rownum 1~3까지 전체정보를 조회
-- 정렬 후 rownum 번호값을 지정해 1~3까지의 정보 조회

select rownum, m_no, m_name, m_price
from( 
	select m_no, m_name, m_price
	from menu
	order by m_name
	)
where rownum between 1 and 3;
-- where rownum between 2 and 3; => 값이 안나옴 (무조건 1번부터 조회)

-- 정렬한 식을 from에 넣어 table 처럼 사용 = Inline View
-- 데이터를 정렬 후 rownum 값 부여
-- rownum 2~4까지 메뉴테이블 정보를 메뉴명 가나다 순으로 정렬
-- select문을 한번 더 씌워주면 rn이 숫자만 부여해놓고 기능을 상실함

select * -- rownum, rn, m_no, m_name, m_price
from (
	select rownum rn, m_no, m_name, m_price
		from (
			select m_no, m_name, m_price
			from MENU
			order by m_name
			)
		)
where rn between 2 and 4;

-- ~길동 이름을 가진 사장님네
--		메뉴명, 가격, 식당명, 지점명, 사장님이름
-- 		가격 내림차순 -> 가격이 같다면 메뉴명 가나다 순 정렬
--		3 ~ 8번째 까지 조회
select *
from(
	select rownum rn, m_name 메뉴명, m_price 가격, b_name 점포명, b_location 지점명, o_name 사장
	from(	
		select m_name, m_price, b_name, b_location, o_name
		from MENU, BISTRO, OWNER
		where m_b_no = b_no 
			and b_owner = o_no
			and o_name like '%길동'
		order by m_price desc, m_name
		)
	)
where rn between 3 and 8;

-- 김씨 성을 가진 사장님 가게의 메뉴명, 가격, 사장님 이름, 사장님 성별
-- 가격 오름차순 -> 2~3번까지 조회
select *
from (
	select rownum rn, m_name, m_price, o_name, o_gender
	from(
		select m_name, m_price, o_name, o_gender
		from MENU, BISTRO, OWNER
		where m_b_no = b_no
			and b_owner = o_no
			and o_name like '김%'
		order by m_price)
		)
where rn between 2 and 3;



























