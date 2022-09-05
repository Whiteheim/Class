-- 배추, 3kg, 10000원, 홈플러스, 판교점, 평수 1000평, 주차장 500대
-- 무, 500g , 5000원, 홈플러스, 강남점, 500평, 300대
-- 배추, 2kg, 5000원, 이마트, 서초점, 800평, 800대
create table mart(
	m_no number(3) primary key,
	m_name varchar2(10 char) not null,
	m_location varchar2(10 char) not null,
	m_space number(7) not null,
	m_parking number(7) not null
);
drop table mart cascade constraint purge;
create sequence mart_seq;
drop sequence mart_seq;
insert into mart values (mart_seq.nextval, '홈플러스', '판교점', 1000, 500);
insert into mart values (mart_seq.nextval, '홈플러스', '강남점', 500, 300);
insert into mart values (mart_seq.nextval, '이마트', '서초점', 800, 800);

select * from mart;

create table vegetable(
	v_no number(3) primary key,
	v_name varchar2(10 char) not null,
	v_cost number(7) not null,
	v_weight number(7) not null,
	v_m_no number(7) not null,
	constraint FK_vegetable foreign key (v_m_no)
		references mart(m_no)
		on delete cascade
);

create sequence vegetable_seq;
drop sequence vegetable_seq;
drop table vegetable cascade constraint purge;
insert into VEGETABLE values (vegetable_seq.nextval, '배추', 10000, 3000, 1);
insert into VEGETABLE values (vegetable_seq.nextval, '무', 5000, 500, 2);
insert into VEGETABLE values (vegetable_seq.nextval, '배추', 5000, 2000, 3);
drop table vegetable cascade constraint purge;
select * from VEGETABLE;
--------------------------------------------------------------------------------
-- create table - DBA
-- drop table - DBA
-- create sequence - DBA
-- 계정 하나로 여러명 사용 가능
-- 입사 후 사수가 계발자용 계정 알려줌 -> 하지만 위의 권한은 없음

-- 가진 권한은?
-- C - insert
--			sequence 사용, 날짜 입력 등등
-- R - select
--		중요해서 주로 학습
-- U - update
 update 테이블명
 	set 컬럼명 = 값, 컬럼명 = 값, ... -- 바꿀 내용
 	where 조건;
 	
 -- 무를 공짜로
 -- 배추를 김장용특대배추로 이름 수정
 -- 모든 마트의 주차장 30% 감소
 -- 홈플러스 판교점의 상품 가격 10% 할인
 -- 제일 비싼 상품 10% 할인	
 	
 update VEGETABLE
 	set v_cost = 0
 	where v_name = '무';
 
 update VEGETABLE
 	set v_name = '김장용특대배추'
 	where v_name = '배추';
 	
 update MART
 	set m_parking = m_parking * 0.7;
 	
 update VEGETABLE
 	set v_cost = v_cost * 0.9
 	where v_m_no = (
 	    select m_no 
 		from mart
 		where m_name = '홈플러스' and m_location = '판교점');
 	
 update vegetable
 	set v_cost = v_cost * 0.9
	where v_cost =(
		select max(v_cost)
		from vegetable
	);

----------------------------------------------------------------------
-- D - delete
delete from 테이블명
	where 조건식;
	
-- 무 삭제
delete from VEGETABLE
	where v_name = '무';
-- 가장 좁은 매장 상품 다 삭제
delete from VEGETABLE
	where v_m_no in (
		select m_no
		from mart
		where m_space = (
			select min(m_space)
			from mart
			)
	);
-------------------------------------------------------------
-- 홈플러스 강남점 폐점
delete from MART
	where m_name = '홈플러스' and m_location = '강남';

-- 홈플러스 강남점이 없어지는데, 그 안에 있던 상품들은 어떻게 할지?
-- 정해진 답은 없기 때문에 프로젝트시 팀원들과 상의후 결정
---------------------------------------------------------
-- 웹사이트 > 가입 > 로그인 > 욕설 게시> 탈퇴
delete 계정
	where id = 'xxx';
-- 글 완전 삭제?
-- xxx의 글은 남기기 -> 추 후 다른사람이 같은 아이디로 가입하게되면 문제가 생김
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















