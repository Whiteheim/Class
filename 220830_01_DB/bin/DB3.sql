-- < Oracle 내의 만한 함수 >
-- 1. 숫자함수
--	- ABS(숫자) : 절대값 계산									ex) ABS(-4.05)
-- 	- ROUND(숫자, m) : 숫자를 반올림, m은 반올림을 하는 자릿수	ex) ROUND(5.36, 1)
--	- POWER(숫자, n) : 숫자 n제곱 값을 계산 					ex) POWER(2, 3)
--	- TRUNC(숫자, m) : 숫자의 m번째 자리까지 남기고 버림		ex) TRUNC(123.456, 2)
--																	TRUNC(123.456, -1)
--																	TRUNC(123.456, 0)
--	- MOD(m, n) 	 : 숫자 m을 n으로 나눈 나머지					ex) MOD(12, 10)
--	- SQRT(숫자) 	 : 숫자의 제곱근 값을 계산 (양수만)				ex) SQRT(9.0)

select ABS(-4.05) from dual;
select ROUND(5.36, -1) from dual;
select POWER(2, 3) from dual;
select TRUNC(123.456, 2) from dual;
select TRUNC(123.456, -1)from dual;
select TRUNC(123.456, 0) from dual;
select MOD(12, 10) from dual;
select SQRT(9.0) from dual;
----------------------------------------------------------------------
-- 2. 문자함수
--	- CONCAT(s1, s2) : 두 문자열을 연결							ex) CONCAT('ABCD', 'EFG')
--	- SUBSTR(s1, n, k) : 문자열의 n번째부터 k만큼의 길이를 반환 ex) SUBSTR('ABCDEFG', 3, 4)
--	- INSTR(s1, s2, n, k) : s1의 n부터, 
--			찾고자하는 s2가 k번째 나타내는 문자열의 위치를 반환 ex) INSTR('Hello', 'l', 1, 2)
--	- LPAD(s, n, c) : 문자열 s의 왼쪽부터 지정한 자리 수 n까지 
--			지정한 문자 c로 채워줌								ex) LPAD('ABC', 5, '*')
--	- RPAD(s, n, c) : 문자열 s의 오른쪽부터 지정한 자리 수 n까지
--			지정한 문자 c로 채워줌								ex) RPAD('ABC', 5, '*')
--	- LTRIM(s1, s2) : 문자열 s1기준으로 왼쪽에 있는 지정한 문자 s2 제거
--																ex) LTRIM('*ABC', '*')
-- 	- RTRIM(s1, s2)	: 문자열 s1기준으로 오른쪽에 있는 지정한 문자 s2 제거
--																ex) RTRIM('ABC*', '*')
--	- REPLACE(s1, s2, s3) : s1의 지정한 문자 s2를 문자 s3로 변경
--														ex) REPLACE('JACK and JUE', 'J', "BL")
--	- LENGTH(s1) : 글자 수를 세어주는 함수 						ex) LENGTH('ㅋㅋㅋ')
--	- LENGTHB(s1) : 글자의 용량(byte)을 세어주는 함수			ex) LENGTHB('ㅋㅋㅋ')

select CONCAT('ABCD', 'EFG') from dual;
select SUBSTR('ABCDEFG', 3, 4) from dual;
select INSTR('Hello', 'l', 1, 2) from dual;
select LPAD('ABC', 5, '*') from dual;
select RPAD('ABC', 5, '*') from dual;
select LTRIM('*ABC', '*') from dual;
select RTRIM('ABC*', '*') from dual;
select REPLACE('JACK and JUE', 'J', 'BL') from dual;
select LENGTH('ㅋㅋㅋ') from dual;
select LENGTHB('ㅋㅋㅋ') from dual;
----------------------------------------------------------------------
-- 3. 날짜/ 시간 함수
--	[날짜 형식]
--		YYYY 		: 4자리 연도
--		YYY, YY, Y 	: 각 4자리 연도의 마지막 3, 2, 1 자리
--		MM 			: 월
--		DD 			: 1달 중 날짜(일자)
--		DAY 		: 요일 (월요일 ~ 일요일)
--		DY 			: 요일 (월 ~ 일)
--		AM / PM		: 오전 / 오후
--		HH, HH12 	: 12시간 단위의 시간
--		HH24		: 24시간 단위의 시간
-- 		MI			: 분
--		SS			: 초

--		SYSDAYE 	: 현재날짜 / 시간


--		TO_DATE(s1, dateime형식): 문자형 데이터를 날짜형으로 반환
select to_date ('2022-09-01 오전 06:00', 'YYYY-MM-DD PM HH:MI') from dual;

-- 		TO_CHAR(date, datetime 형식): 날짜형 데이터를 문자형으로 반환
select to_char(sysdate, 'YYYY-MM-DD') from dual;
-- 특정 날짜값을 받아오고 싶다면 sysdate 자리에 to_date함수를 넣어서 만들면 가능
--	=> 반환되는 데이터 타입이 다르다

-- TO_DATE는 날짜형 / TO_CHAR는 문자형 으로 반환

--		ADD_MONTHS(date, 숫자) : 날짜에서 지정한 달 만큼 더함 (1 : 다음달, -1 : 이전달)
select add_months(sysdate, -1) from dual;

--		LAST_DAY(date) : 그 달의 마지막 날을 반환
select last_day(sysdate) from dual;
-------------------------------------------------

-- 오늘 날짜 기준으로 년도 조회 (테이블 헤더 '연도' / 컬럼 '2022년'으로 출력)
select to_char(sysdate, 'YYYY')||'년' as 연도 from dual;

-- 오늘 날짜 기준 월 조회 (테이블 헤더 '월'/ 컬럼 '08월')
select to_char(sysdate, 'MM')||'월' as 월 from dual;

-- 				  일 조회 (테이블 헤더 '일'/ 컬럼 '30일')
select to_char(sysdate, 'DD')||'일' as 일 from dual;

--				  시/분 조회 (테이블 헤더에 각각 '시', '분'/ 컬럼 '?시','?분')
-- select to_char(sysdate, 'HH')||'시' as 시 from dual;
-- select to_char(sysdate, 'MI')||'분' as 분 from dual;
select to_char(sysdate, 'HH')||'시' as 시, to_char(sysdate, 'MI')||'분' as 분 from dual;

-- 지금이 오전인지 오후인지
select to_char(sysdate, 'PM') "오전 / 오후" from dual;
-- 별칭에 특수문자를 넣으려면 큰 따옴표 사용

-- 문자열 2022-09-09 오전 07:23을 2022.09.09로 조회
select to_char(to_date('2022-09-09 오전 07:23', 'YYYY-MM-DD AM HH:MI'), 'YYYY.MM.DD') from dual;

-- 오늘 날짜 기준 3달전 마지막 날의 월과 일
-- select to_char(last_day(add_months(sysdate, -3)), 'MM') from dual;
-- select to_char(last_day(add_months(sysdate, -3)), 'DD') from dual;
select to_char(last_day(add_months(sysdate, -3)), 'MM-DD') from dual;

--------------------------------------------------------------------
-- 4. 집계 / 분석 함수 - 'select 컬럼명' or 'having절'에서 사용
--		- AVG(컬럼명) 	: 평균
--		- COUNT(컬럼명) : 검색되는 데이터의 수
-- 		- MAX(컬럼명)	: 최대값
--		- MIN(컬럼명)	: 최소값
--		- SUM(컬럼명)	: 총합
--		- RANK 			: 중복 순위만큼 다음 순위값을 증가 시킴					순위 1/2/2/2/5
--		- DENSE_RANK	: 중복 순위가 존재해도 순차적으로 다음 순위값을 표시 	순위 1/2/2/2/3
--------------------------------------------------------------------
-- 5. NULL 관련 함수 
--	제약조건에서 NOT NULL을 이용해 무조건 데이터를 입력하도록 해둠
--	NULL : 미확인/ 미적용 값 
--			0 이나 공란도 아닌 값이 존재하지 않는 것
--			null 말고 다른 표기로 대치하기 위해 함수를 만듬
--		NVL함수	: NULL인 경우에만 지정된 값으로 대치하는 함수
--		NVL(값, null일때 대체값) 
select nvl(null, 'B') from dual;
select nvl('A', 'B') from dual;

--		NVL2함수 : NULL의 유무에 따라 지정한 값으로 대치하는 함수
--			NVL2(값, 값이 있을 때 대체값, null일때 대체값)
select nvl2(null, 'A', 'B') from dual;
select nvl2('C', 'A', 'B') from dual;




















