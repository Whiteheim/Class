-- < Oracle ���� ���� �Լ� >
-- 1. �����Լ�
--	- ABS(����) : ���밪 ���									ex) ABS(-4.05)
-- 	- ROUND(����, m) : ���ڸ� �ݿø�, m�� �ݿø��� �ϴ� �ڸ���	ex) ROUND(5.36, 1)
--	- POWER(����, n) : ���� n���� ���� ��� 					ex) POWER(2, 3)
--	- TRUNC(����, m) : ������ m��° �ڸ����� ����� ����		ex) TRUNC(123.456, 2)
--																	TRUNC(123.456, -1)
--																	TRUNC(123.456, 0)
--	- MOD(m, n) 	 : ���� m�� n���� ���� ������					ex) MOD(12, 10)
--	- SQRT(����) 	 : ������ ������ ���� ��� (�����)				ex) SQRT(9.0)

select ABS(-4.05) from dual;
select ROUND(5.36, -1) from dual;
select POWER(2, 3) from dual;
select TRUNC(123.456, 2) from dual;
select TRUNC(123.456, -1)from dual;
select TRUNC(123.456, 0) from dual;
select MOD(12, 10) from dual;
select SQRT(9.0) from dual;
----------------------------------------------------------------------
-- 2. �����Լ�
--	- CONCAT(s1, s2) : �� ���ڿ��� ����							ex) CONCAT('ABCD', 'EFG')
--	- SUBSTR(s1, n, k) : ���ڿ��� n��°���� k��ŭ�� ���̸� ��ȯ ex) SUBSTR('ABCDEFG', 3, 4)
--	- INSTR(s1, s2, n, k) : s1�� n����, 
--			ã�����ϴ� s2�� k��° ��Ÿ���� ���ڿ��� ��ġ�� ��ȯ ex) INSTR('Hello', 'l', 1, 2)
--	- LPAD(s, n, c) : ���ڿ� s�� ���ʺ��� ������ �ڸ� �� n���� 
--			������ ���� c�� ä����								ex) LPAD('ABC', 5, '*')
--	- RPAD(s, n, c) : ���ڿ� s�� �����ʺ��� ������ �ڸ� �� n����
--			������ ���� c�� ä����								ex) RPAD('ABC', 5, '*')
--	- LTRIM(s1, s2) : ���ڿ� s1�������� ���ʿ� �ִ� ������ ���� s2 ����
--																ex) LTRIM('*ABC', '*')
-- 	- RTRIM(s1, s2)	: ���ڿ� s1�������� �����ʿ� �ִ� ������ ���� s2 ����
--																ex) RTRIM('ABC*', '*')
--	- REPLACE(s1, s2, s3) : s1�� ������ ���� s2�� ���� s3�� ����
--														ex) REPLACE('JACK and JUE', 'J', "BL")
--	- LENGTH(s1) : ���� ���� �����ִ� �Լ� 						ex) LENGTH('������')
--	- LENGTHB(s1) : ������ �뷮(byte)�� �����ִ� �Լ�			ex) LENGTHB('������')

select CONCAT('ABCD', 'EFG') from dual;
select SUBSTR('ABCDEFG', 3, 4) from dual;
select INSTR('Hello', 'l', 1, 2) from dual;
select LPAD('ABC', 5, '*') from dual;
select RPAD('ABC', 5, '*') from dual;
select LTRIM('*ABC', '*') from dual;
select RTRIM('ABC*', '*') from dual;
select REPLACE('JACK and JUE', 'J', 'BL') from dual;
select LENGTH('������') from dual;
select LENGTHB('������') from dual;
----------------------------------------------------------------------
-- 3. ��¥/ �ð� �Լ�
--	[��¥ ����]
--		YYYY 		: 4�ڸ� ����
--		YYY, YY, Y 	: �� 4�ڸ� ������ ������ 3, 2, 1 �ڸ�
--		MM 			: ��
--		DD 			: 1�� �� ��¥(����)
--		DAY 		: ���� (������ ~ �Ͽ���)
--		DY 			: ���� (�� ~ ��)
--		AM / PM		: ���� / ����
--		HH, HH12 	: 12�ð� ������ �ð�
--		HH24		: 24�ð� ������ �ð�
-- 		MI			: ��
--		SS			: ��

--		SYSDAYE 	: ���糯¥ / �ð�


--		TO_DATE(s1, dateime����): ������ �����͸� ��¥������ ��ȯ
select to_date ('2022-09-01 ���� 06:00', 'YYYY-MM-DD PM HH:MI') from dual;

-- 		TO_CHAR(date, datetime ����): ��¥�� �����͸� ���������� ��ȯ
select to_char(sysdate, 'YYYY-MM-DD') from dual;
-- Ư�� ��¥���� �޾ƿ��� �ʹٸ� sysdate �ڸ��� to_date�Լ��� �־ ����� ����
--	=> ��ȯ�Ǵ� ������ Ÿ���� �ٸ���

-- TO_DATE�� ��¥�� / TO_CHAR�� ������ ���� ��ȯ

--		ADD_MONTHS(date, ����) : ��¥���� ������ �� ��ŭ ���� (1 : ������, -1 : ������)
select add_months(sysdate, -1) from dual;

--		LAST_DAY(date) : �� ���� ������ ���� ��ȯ
select last_day(sysdate) from dual;
-------------------------------------------------

-- ���� ��¥ �������� �⵵ ��ȸ (���̺� ��� '����' / �÷� '2022��'���� ���)
select to_char(sysdate, 'YYYY')||'��' as ���� from dual;

-- ���� ��¥ ���� �� ��ȸ (���̺� ��� '��'/ �÷� '08��')
select to_char(sysdate, 'MM')||'��' as �� from dual;

-- 				  �� ��ȸ (���̺� ��� '��'/ �÷� '30��')
select to_char(sysdate, 'DD')||'��' as �� from dual;

--				  ��/�� ��ȸ (���̺� ����� ���� '��', '��'/ �÷� '?��','?��')
-- select to_char(sysdate, 'HH')||'��' as �� from dual;
-- select to_char(sysdate, 'MI')||'��' as �� from dual;
select to_char(sysdate, 'HH')||'��' as ��, to_char(sysdate, 'MI')||'��' as �� from dual;

-- ������ �������� ��������
select to_char(sysdate, 'PM') "���� / ����" from dual;
-- ��Ī�� Ư�����ڸ� �������� ū ����ǥ ���

-- ���ڿ� 2022-09-09 ���� 07:23�� 2022.09.09�� ��ȸ
select to_char(to_date('2022-09-09 ���� 07:23', 'YYYY-MM-DD AM HH:MI'), 'YYYY.MM.DD') from dual;

-- ���� ��¥ ���� 3���� ������ ���� ���� ��
-- select to_char(last_day(add_months(sysdate, -3)), 'MM') from dual;
-- select to_char(last_day(add_months(sysdate, -3)), 'DD') from dual;
select to_char(last_day(add_months(sysdate, -3)), 'MM-DD') from dual;

--------------------------------------------------------------------
-- 4. ���� / �м� �Լ� - 'select �÷���' or 'having��'���� ���
--		- AVG(�÷���) 	: ���
--		- COUNT(�÷���) : �˻��Ǵ� �������� ��
-- 		- MAX(�÷���)	: �ִ밪
--		- MIN(�÷���)	: �ּҰ�
--		- SUM(�÷���)	: ����
--		- RANK 			: �ߺ� ������ŭ ���� �������� ���� ��Ŵ					���� 1/2/2/2/5
--		- DENSE_RANK	: �ߺ� ������ �����ص� ���������� ���� �������� ǥ�� 	���� 1/2/2/2/3
--------------------------------------------------------------------
-- 5. NULL ���� �Լ� 
--	�������ǿ��� NOT NULL�� �̿��� ������ �����͸� �Է��ϵ��� �ص�
--	NULL : ��Ȯ��/ ������ �� 
--			0 �̳� ������ �ƴ� ���� �������� �ʴ� ��
--			null ���� �ٸ� ǥ��� ��ġ�ϱ� ���� �Լ��� ����
--		NVL�Լ�	: NULL�� ��쿡�� ������ ������ ��ġ�ϴ� �Լ�
--		NVL(��, null�϶� ��ü��) 
select nvl(null, 'B') from dual;
select nvl('A', 'B') from dual;

--		NVL2�Լ� : NULL�� ������ ���� ������ ������ ��ġ�ϴ� �Լ�
--			NVL2(��, ���� ���� �� ��ü��, null�϶� ��ü��)
select nvl2(null, 'A', 'B') from dual;
select nvl2('C', 'A', 'B') from dual;




















