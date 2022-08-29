create table aug29_coffee(
	c_name varchar2(10 char) primary key,
	c_price number(5) not null,
	c_kcal number(3) not null,
	c_start date not null
);

insert into aug29_coffee values('아메리카노', 3000, 15, sysdate);
select * from aug29_coffee;

-- DDL의 alter / drop / truncate

-- 데이터 타입 변경 / 컬럼의 크기(용량) 변경
alter table 테이블명 modify 컬럼명 데이터타입(용량)];
-- 값이 있는 상태에서 데이터타입 변경하면 에러
alter table aug29_coffee modify c_name number(3);
-- 값이 있는 상태에서 용량을 적게 변경하면 에러
alter table aug29_coffee modify c_name varchar2(2 char);

-- 주의 사항 : 데이터타입을 변경할 때, 값을 모두 지워야 변경가능 -> 아니면 오류
--				컬럼의 용량을 줄일 경우 해달 컬럼의 용량을 조회해서 변결할 길이 보다
--				큰 값이 있는지 확인 후 변경

------------------------------------------------------------------------------

-- 컬럼명 변경
alter table 테이블명 rename column 기존 컬럼명 to 바꿀 걸럼명
alter table aug29_coffee rename column c_name to c_name2;

-- 컬럼 추가 
alter table 테이블명 add 컬럼명 데이터타입 제약조건 (생략가능);
-- 기존의 데이터가 없어야 notnull 가능
alter table aug29_coffee add c_taste varchar2(20 char) not null; 

-- 컬럼 삭제
alter table 테이블명 drop column 컬럼명;
alter table aug29_coffee drop column c_taste;
------------------------------------------------
-- 테이블 내의 내용 지우기
truncate table 테이블명;
truncate table aug29_coffee;
-- 테이블에 있는 데이터를 삭자해지만, 테이블의 구조 자체는 삭제 하지 않음

-- 테이블 삭제(임시보관)
drop table 테이블명 cascade constraint;
drop table aug29_coffee cascade constraint;

-- 삭제한 테이블 복원
flashback table 테이블명 to before drop;
flashback table aug29_coffee to before drop;

-- 휴지통 비우기
purge recyclebin;

-- 테이블 완전 삭제
drop table 테이블명 cascade constraint purge;
drop table aug29_coffee cascade constraint pure;

-----------------------------------------------------
-- DDL : 신입 x
-- 경력있는 DBA들이 테이블을 만들어서 CRUD정도만 하게끔 할 것




























