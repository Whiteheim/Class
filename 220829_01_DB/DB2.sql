-- 옵션
-- 제약조건(Constraint)
-- 데이터의 무결성을 보장하기 위한 용도
-- 데이터 무결성 : 데이터베이스에 저장된 데이터의 일관성과 정확성을 지키는 것

-- 1. 도메인 무결성 제약조건
--		도메인 제약 (Domain Constraint) 
--		테이블 내의 튜플들이 각 속성의 도메인에 지정된 값만 가져야 한다는 조건
--		데이터 타입(type), 널(null / not null***), 기본값(default), 체크(check) 등을 활용해서 지정

-- 2. 개체 무결성 제약조건
--		기본키 제약(Primary key *** Constraint)
--		개체(Entity) : 사람, 장소, 사물, 사건 등과 같이 독립적으로 존재하며
--						고유하게 식별 가능한 단위
--		아무리 많은 개체가 있어도, 내가 원하는 '유일한' 개체를 발견할 수 있어야 한다
--		테이블은 기본키를 지정하고, Null값을 가져서는 안되며, 
--		테이블 내에 오직 하나의 값만 존재해야한다는 조건

-- 3. 참조 무결성 제약조건
--		외래키 제약(foreign key *** Constraint)
--		테이블 간의 참조관계를 선언하는 제약조건
--		참조받는 테이블의 외래키는 참조하는 테이블의 기본키(2번 조건)와 동일해야 하며,
--		참조받는 테이블의 값이 변경 될 때, 참조하는 테이블의 제약을 받는 것
------------------------------------------------------------------------------------
--	1. Not Null : Null = 빈 값
--					=> 0 이나 띄어쓰기도 아닌 값을 넣지 않은 상태
--				  Not Null = Null 허용 x
--					=> 필수적으로 입력해야 할 컬럼에 설정
--					=> 가장 많이 사용되는 제약 조건
--					: 테이블을 만들 때 가급적 값이 들어가도록 입력하기 ***

-- 제약조건명을 따로 부여하지 않는 경우(Oracle이 자동으로 이름 부여)
create table example1(
	col1 varchar2(10),
	col2 varchar2(10 char) not null
);

-- Constraint 키워드를 사용해서 제약조건명을 따로 부여하는 경우
create table example2(
	col1 varchar2(10 char),
	col2 varchar2(10 char),
	constraint col2_notnull not null
);

-- 2. Unique : 해당 컬럼에 들어가는 값이 전체 테이블에서 유일해야 한다는 조건
--		Not Null과 함께 사용 가능, 하지만 자주 사용되지 않음
create table example3(
	col1 varchar2(10 char) unique,
	col2 varchar2(10 char) unique not null,
	col3 varchar2(10 char),
	constraint clo3_unique unique(col3)
);

-- 3. Primary Key (기본 키) : NULL 과 중복 데이터를 둘 다 허용하지 않음
--		(Not Null + Unique => primary key)
--		데이터의 특정 조건을 검색하거나 수정 등의 작업을 할 때 기본키로 구분
--		ID, 주민등록번호, 회원번호, 글 번호 등이 기본 키에 해당됨
--		일반적으로 테이블에는 1개의 기본키를 필수 지정
create table example4(
	col1 varchar2(10 char) primary key,
	col2 varchar2(10 char) not null,
	col3 varchar2(10 char) not null
);

-- 여러 컬럼을 묶을 때, constraint 키워드를 사용
--		PK(primary key)는 가급적 하나만 사용
create table example5(
	col1 varchar2(10 char),
	col2 varchar2(10 char),
	col3 varchar2(10 char),
	constraint PK_example5 primary key (col1, col2)
);

-- *** 짱어렵
-- 4. Foreign Key(왜래 키) : 다른 테이블의 특정 컬럼을 조회해서 
--							동일한 데이터가 있는 경우에만 입력이 허용됨
--		참조하는 테이블은 PK or Unique로 지정된 컬럼만을 FK(foreign key)로 지정가능
--		외래키 설정을 위해 참조받는 컬럼이 먼저 생성되어야 함
--		외래키를 심을 테이블이 참조 컬럼 생성 이후에 생성되어야 함

-- 외래키를 심을 테이블의 형식
create table 테이블명(
	컬럼명 자료명, -- 쉼표 잊지않기
	constraint FK명 foreign key(컬럼명)
		references 대상테이블명(대상테이블의 기본키(or 고유키) 컬럼명)
		on delete set null || on delete cascade 선택사항 2중 택1
		-- 참조받는 테이블에서 행 부분을 지웠을 때 
		-- 이 테이블에 연결이 되어있는 행에 대해서
		-- Null값을 줄 지 or 행을 같이 지울지에 대한 옵션 
);

create table example6(
	ex6_id varchar2(10 char) primary key
);
insert into example6 values('10');
insert into example6 values('20');
insert into example6 values('30');
select * from example6;

create table example7(
	ex7_id varchar2(10 char),
	constraint fk_ex7 foreign key (ex7_id)
		references example6(ex6_id)
		on delete cascade
);

insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40');
select * from example7;
-- ex6_id가 10인 컬럼을 지우면?
delete from example6 where ex6_id = '10';

-- 학과 테이블과 이것을 참조하는 학생 테이블
-- 학과 테이블 : 학과코드 (4자리 숫자), 학과이름 (10글자 이내)
-- 학생 테이블 : 학생번호 (3자리 숫자), 학생이름, 학생이 소속되어있는 학과의 코드
-- 학과가 없어지면 이 학생 정보도 지워지도록
create table department(
	d_cod1 number(4) primary key,
	d_name varchar2(10 char) not null
);
insert into department values(1234, '조리학과');
insert into department values(1235, '경찰행정학과');
insert into department values(1236, '체육학과');
insert into department values(1237, '국어국문학과');

delete from department where d_cod1 = 1234;
-- 1234 코드를 지우면 학생 테이블에서 1234 코드를 가진 학생들의 내용이 지워짐
select * from department;

drop table department -- 참조된 테이블이 있을 땐 테이블을 삭제할 수 없음
drop table department cascade constraint purge; -- 강제삭제

create table student(
	s_numb number(3) primary key,
	s_name varchar2(3 char) not null,
	s_d_cod number(4) not null, 
	constraint FK_cod foreign key (s_d_cod)
		references department(d_cod1)
		on delete cascade 
);
insert into student values(111, '김김김', 1236);
insert into student values(112, '이이이', 1234);
insert into student values(113, '박박박', 1235);
insert into student values(114, '최최최', 1237);
select * from student;
drop table student cascade constraint purge;

------------------------------------------------

-- 5. Check : 데이터의 값의 범위 or 조건 설정 후 해당하는 데이터만 허용
create table example8(
	col1 number(3) constraint ex8_check check (col1 between 1 and 9)
);

insert into example8 values(8);
insert into example8 values(11); -- 1~9사이의 숫자가 아니어서 에러발생
select * from example8;
drop table example8;

-- 6. Default : 어떤 데이터도 입력하지 않은 상태, 지정한 데이터가 자동으로 입력
create table example9(
	col1 number(4) default 999
);

insert into example9 values(default);
insert into example9 values(null);
insert into example9 values(0);
insert into example9 values(11);
select * from example9;













































