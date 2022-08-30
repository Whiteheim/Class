-- 1. 노트북에 대한 테이블 생성
-- 속성 : 노트북의 이름, 가격, CPU, RAM, HDD, 보증기간
-- 테이블을 작성
-- 하나의 기본키, 모든 값을 채워넣어야함
create table laptop(
	l_name varchar2(10 char) primary key,
	l_price number(10) not null,
	l_cpu varchar2(10 char) not null,
	l_ram number(10) not null,
	l_hdd number(10) not null,
	l_warranty date not null
	
);

-- 2. 노트북에 128기가 램 사용 
-- 램 컬럼에 용량변경 문장 작성 (modify)
alter table laptop modify l_ram number(3);

-- 3. 노트북 디스플레이 크기에 대한 컬럼을 추가하는 문장
-- 단위 : cm /  소수점 두번째자리까지 나타내기
-- 빈 값을 넣을 수 없음
alter table laptop add l_monitor number(5, 2) not null;

-- 4. 노트북에는 앞으로 HDD 대신 SSD 장착
-- HDD 컬럼의 이름을 SSD로 컬럼명을 변경하는 문장
alter table laptop rename column l_hdd to l_ssd;

-- 5. 보증기간 컬럼 삭제하는 문장 작성
alter table laptop drop column l_warranty;

-- 6. 노트북 가격 범위는 80만~230만으로 변경하는 문장 작성
-- constraint laptop check (l_price between 800000 and 2300000)
alter table laptop modify l_price number(7)
	constraint l_check check(l_price between 800000 and 2300000);

-- 7. 테이블을 완전히 삭제하는 문장 작성
drop table laptop cascade constraint purge;

















































































