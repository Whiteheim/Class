-- JOIN
-- 하나의 명령문에 의해 여러 테이블에 저장되어있는 데이터를 한번에 조회 가능한 기능
-- 여러 테이블을 하나의 테이블인것 처럼 출력
create table tb1(name varchar2(10 char), age number (3));
create table tb2(name varchar2(10 char), age number (3));

insert into tb1 values('김개똥', 30);
insert into tb1 values('이개똥', 35);
insert into tb1 values('박개똥', 40);
insert into tb1 values('신개똥', 40);

insert into tb2 values('이개똥', 30);
insert into tb2 values('정개똥', 50);
insert into tb2 values('배개똥', 55);
-------------------------------------------------------
-- Cross Join : 별도의 조건 없이 여러 테이블간의 가능한 모든 결과를 조회할 때 사용 (모든 경우의 수)
-- 사용 빈도 낮음
select * from tb1, tb2;
select * from tb1 cross join tb2;

-- Inner Join : 조건에 해당하는 값만 조회
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where A.name = B.name;		-- EQUI JOIN (동등 조인)
select * from tb1 join tb2 using (name);				-- EQUI JOIN ~ USING(조인대상컬럼명)
select * from tb1 natural join tb2;						-- NATURAL JOIN (자연조인)
														-- 조건절 없이 양쪽에 동명의 컬럼만을 조회
														
-- Outer Join : 기준 테이블의 데이터를 누락없이 모두 조회 가능
--				대상 테이블의 데이터가 있는 경우, 해당 컬럼의 값을 가져오기 위해 사용
-- (+)를 이용한 outer join : null값이 출력 될 테이블의 컬럼에 (+) 기호 추가
-- 							 주로 left outer join 을 더 많이 씀

-- Left Outer Join : 왼쪽 테이블에 값이 있을 때, 오른쪽 테이블이 그 조건에 맞지 않아도 결과가 출력
--						(조건에 맞지 않으면 Null값으로 채움)
select * from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

-- Right Outer Join : 오른쪽 테이블에 값이 있을 때, 왼쪽 테이블이 그 조건에 맞지 않아도 결과가 출력
--						(조건에 맞지 않으면 Null값으로 채움)
select * from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name(+) = tb2.name;

-- Full Outer Join : 한쪽 테이블에 값이 있을 때, 다른 테이블의 조건이 맞지 않아도 결과가 출력
select * from tb1 full outer join tb2 on tb1.name = tb2.name; 

-- Self Join ********
-- 하나의 테이블 내에 있는 컬럼끼리 연결하는 조인이 필요한 경우
-- 단어 그대로 스스로 JOIN함

-- 한 웹사이트에 회원이 5명, 관리자 2명
-- 회원의 이름은 각각 회원 1 ~ 5, 관리자명 관리자 1, 2
-- 회원의 아이디는 각각 member 1 ~ member 3, 관리자 아이디는 manager1,2
-- 회원 1~3은 관리자 1이 관리, 나머지는 관리자 2가 관리

create table member(
	m_id varchar2(10 char) primary key,
	m_name varchar2(10 char) not null,
	m_manager varchar2(10 char)			--관리자 들은 관리를 받지 않아 제약조건 x
);

insert into member values ('member1', '회원1', 'manager1');
insert into member values ('member2', '회원2', 'manager1');
insert into member values ('member3', '회원3', 'manager1');
insert into member values ('member4', '회원4', 'manager2');
insert into member values ('member5', '회원5', 'manager2');
insert into member values ('manager1', '관리자1', null);
insert into member values ('manager2', '관리자2', null);

select * from member;

select *
	from member A join member B on A.m_id = b.m_id;

select A.m_id, A.m_name, B.m_id
	from member A join member B -- 같은 테이블이지만 셀프조인을 위해
								-- 각각 별칭을 지어 구분
	on A.m_id = b.m_manager;	-- 계정 ID와 관리자 계정이 같은 
								-- 값들을 연결해서
								-- 관리하는 회원의 ID값을 가져올 수 있게 됨
	
select A.m_id, A.m_name, B.m_id
	from member A join member B on A.m_id = B.m_manager;













