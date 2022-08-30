-- DB 설치 / CMD기반의 SQLplus -> DBA 업무 약간 경험 (계정생성, 권한부여, tablespace)
-- 간단한 용어정리 - 테이블 / 행 / 열 / 스키마 / 인스턴스 / 도메인
-- SQL 명령문 중 정의어 (DDL)를 배우면서 테이블 만들어봄
-- 테이블 생성시 필요한 자료형 (자주 사용하는 것들 위주)
--	문자형 : varchar2 / 숫자형 : number / 날짜 : date
--		문자형 varvhar2에 용량 입력시, char를 넣어 글자단위로 넣을수 있게 하기
--		숫자형 number에 용량 입력시, 정밀도 / 번위 잘 조절해서 만들기
--		날짜 date 는 곧
-- 제약조건 - not null / primary key / foreign key
-- 테이블의 구조 수정, 삭제 까지 DDL 완료

-- 과자 테이블 생성
-- 과자 이름, 회사명, 가격
-- 테이블 하나에 PK 하나 필요 

-- 초코파이 -> 회사 : 오리온 / 롯데 => 과자이름 : 단일값 될 수 없음 (PK X)
-- 회사이름 : 한 회사에서 한가지 종류의 과자만 만들지 않음 (PK X)
-- 가격 : 동일한 가격의 과자가 있을 수 있음 (PK X)
-- 	=> 번호값을 만들어 PK를 주는것도 방법

create table snack (
	s_no number(4) primary key,
	s_name varchar2(10 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(5) not null
);
-----------------------------------------------------------------

-- DML 
--	: 데이터 조작어 (Data Manipulation Language)
--	  테이블에 데이터를 검색, 삽입, 수정, 삭제 하는데 사용되는 문장
--		select, insert, update, delete
--			=> CRUD라고 일컬음 (Create Read Update Delete)
-- 	C의 의미 (cerete table X) <- DBA의 작업
-- 		데이터를 생성한다 (insert O)
insert into 테이블명 (컬럼명, 컬럼명, ...) values(값, 값, ...);

insert into snack (s_no, s_name, s_company, s_price) values(1000, '초코파이', '오리온', 5000);
-- 컬럼의 순서를 바꾸어 입력 가능
insert into snack (s_no, s_price, s_company, s_name) values(1001, 3300 , '오리온', '홈런볼');

-- 컬럼에 값을 넣지 않으면 -> 에러발생, 'not null'로 인해 무조건 값이 필요
-- Not null이 없었다면, 실행 가능, 지정하지 않은 값에는 null이 들어감
-- 가급적 null이 없도록 테이블 짜기
insert into snack (s_name, s_no) values('화이트하임', 1002); 

-- 컬럼명 넣지 않고 값만 순서대로 입력해도 가능
insert into snack values(값, 값, ...);

-- 테이블의 순서대로 입력해야함
drop table snack cascade constraint purge;

insert into snack values (123, '과자1', '회사1', 1500);
insert into snack values (122, '과자2', '회사2', 2000);
insert into snack values (125, '과자3', '회사3', 3000);
insert into snack values (131, '과자4', '회사4', 2200);
insert into snack values (161, '과자5', '회사5', 4200);

-- 데이터를 만들 때 마다 과자 번호가 자동계산 되도록
-- factory pattern 
-- MySQL : Autoincrement 옵션 / OracleDB : Sequence
-- 번호를 순서에 맞게 자동생성하는 기능
-- 테이블과는 무관
-- insert에 실패하더라도 sequence는 정상작동되는 단점
-- 증가된 값은 다시 내릴 수 없음

-- sequence 생성
create sequence 시퀀스명; -- 간단한 시퀀스 생성
-- table 뒤에 _seq를 붙혀줌

-- 구체적으로 생성하는 방법
create sequence 시퀀스명
	increment by 1		-- 증가값 (1씩 증가)
	start with 1		-- 시작값
	minvalue 10			-- 최소값
	maxvalue 100		-- 최대값
	nocycle / cycle		-- 최대값에 도달하면 시작값부터 반복 유무
	nocache / cache		-- 시퀀스를 미리 만들어 두고 메모리에서 가져다 쓸지 말지
	noorder / order;	-- 요청 순서대로 값의 생성 유무
-- 간단생성 방법으로도 기본값은 들어가 있음
	
-- sequence 삭제
drop sequence 시퀀스명;

-- sequence 사용법 : 시퀀스명.nextval

drop table snack cascade constraint purge;

insert into snack values (snack_seq.nextval, '과자1', '회사1', 2000);
insert into snack values (snack_seq.nextval, '과자2', '회사2', 2000);
insert into snack values (snack_seq.nextval, '과자3', '회사3', 2000);
insert into snack values (snack_seq.nextval, '과자4', '회사4', 2000);
insert into snack values (snack_seq.nextval, '과자5', '회사5', 2000);
insert into snack values (snack_seq.nextval, '과자6', '회사6', 2000);


drop sequence snack_seq;
create table snack (
	s_no number(4) primary key,
	s_name varchar2(10 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(5) not null,
	s_bestbefore date not null
);

create sequence snack_seq;

select sysdate from dual; -- 현재 시간과 날짜를 알려주는 명령어
insert into snack values (snack_seq.nextval, '과자1', '회사 1', 1500, sysdate)

-- 특정 시간 / 날짜 지정
--		Oracle 내장함수 - to_date('값', '패턴')
--		패턴(대문자) - YYYY, MM, DD, AM/PM, HH(12시간), HH24(추천), MI, SS
insert into snack values (snack_seq.nextval, '녹차 파인트', '하겐다즈', 13900,
	to_date('2022-12-31 14', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '딸기 파인트', '하겐다즈', 13900,
	to_date('2022-09-15 16', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '다운타우너 감자칩', '오리온', 1500,
	to_date('2022-09-20 04', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '11가지찬많은도시락', 'GS25', 5200,
	to_date('2022-10-16 17', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '썬키스트 레몬에이드', '코카콜라', 1700,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '토레타 500ML', '코카콜라', 2000,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '딸기우유 300ml', '서울우유', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '바나나우유300ml', '서울우유', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '초코우유 300ml', '서울우유', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '커피우유 300ml', '서울우유', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '참기름 김치볶음면', '오뚜기', 2300,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '대구식쇠고기육개장', '오뚜기', 7200,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));

select * from snack;


------------------------------------------------------------------------------------
-- R(Read) 의 형태
select [distinct] [컬럼명], [컬럼명 as 별칭 || 컬럼명 별칭], [연산자사용], [통계함수], ...
	from [테이블명]
	where [조건식]
	group by [그룹대상]
	having [함수 포함 조건]
	order by [정렬대상 ASC/DESC(오름차순/내림차순)] -- 기본값은 오름차순

-- 과자테이블 전체 조회
-- '*' : 테이블 내의 모든 컬럼 불러오기
select * from snack;

-- 회사의 정보만 뽑아오기
-- distinct : 중복 제거 기능
select s_company from snack; -- 회사의 정보 불러오기
select distinct s_company from snack; -- 중복된 정보 제외하고 불러오기

-- 컬럼명 & 별칭
-- 컬럼명 : 그 컬럼을 지칭하는 컬럼명
-- 별칭 : 
-- select문에서는 연산이 가능
select s_price / 100 from snack;
-- 컬럼명이 s_price/100으로 출력됨
-- 프로그래밍 언어와 연동시 컬럼명을 이용해 값을 불러오는 경우가 많은데
-- 이 때 바뀐 컬럼명이 너무 길기 때문에 별칭을 지정해 혼란 방지
-- as 사용
select s_price / 100 as s_price from snack;
-- as 미사용
select s_price / 100 s_price from snack;


-- 연산자 (산술 연산자)
-- Dual 테이블
--	1. Oracle 자체제공 해주는 더미 테이블
-- 	2. 함수를 이용해 계산한 결과값을 간단하게 확인할때 사용
select 1 + '3' from dual;
-- 다른 언어의 경우 '문자 우선' => 13의 결과값
-- Oracle에서는 '숫자 우선' => 4의 결과값
-- Oracle 내에서는 연산자가 숫자만 연산을 해줌
select 1 + 'a' from dual; -- 에러 => 문자를 숫자로 변환불가 'invalid number'

-- 문자를 더해주기 위한 연산자 
-- '||' (shift + \)
select 1 || 'a' as plus from dual;
--------------------------------------------------------------------------------

















