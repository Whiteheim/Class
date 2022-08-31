-- R(Read) �� ����
-- �������� ������� �ۼ��ؾ� ��
select [distinct] [�÷���], [�÷��� as ��Ī || �÷��� ��Ī], [�����ڻ��], [����Լ�], ...
	from [���̺��]
	where [���ǽ�]
	group by [�׷���]
	having [�Լ� ���� ����]
	order by [���Ĵ�� ASC/DESC(��������/��������)] -- �⺻���� ��������


-- where�� (���ǽ�)
--	��ü ������ �� ������ ���ǿ� �´� �����͸� ã���ִ� ����
--	���ǽĿ� ����� ������ (�� ������)
--	=, !=, ^=, <>, >, <, >=, <=, ...
--	!=, ^=, <> ��� '�����ʴ�'�� ���̴� ������
--	!= �� <> �� ���� ǥ��ȭ �Ϸ��� �̷� �������� ���ϵǾ���
--	^= ��� DBMS�� ����ȭ�� �α����� ���

-- ��� ���� ���̺�
select * from snack; 
-- ������ 3õ���� ������ ��� ������ ��ȸ
select * from snack where s_price = 3000;
-- ��� ���� �̸�, ���� ��ȸ
select s_name, s_price from snack;
-- ��� ���� �̸�(����) ��ȸ (ex: ��Ĩ(2000��))
-- || ���ڿ� �÷��� // ��Ī�� Ư�����ڳ� ���⸦ ���� �� ū����ǥ ���
select s_name || '('|| s_price ||')' as "�̸�(����)" from snack;

-- 2000 �� ������ ���� �� �ּҰ���
select min(s_price) as �ּҰ��� from snack where s_price <= 2000;
-- ��� ������ ��հ�
select avg(s_price) as ��հ��� from snack;
-- ������ �̸��� ������ 30% ���ε� �ݾ�
select s_name as ��ǰ��, s_price * 0.7 ||'��' as "30% ���ΰ�"from snack; 
-- 3500���� ������ ����
select count(s_name) from snack where s_price = 3500;
-- 3000�� ������ ������ �̸�, ȸ�� �̸�
select s_name , s_company from snack where s_price <= 3000;

-------------------------------------------------------------------

-- ��� ������ �̸�, ����, �������
select s_name ��ǰ��, s_price ����, s_bestbefore ������� from snack;
-- ��� ������ �̸�, ����, �ΰ���(������ 10%)
select s_name ��ǰ��, s_price ����, s_price * 0.1 �ΰ��� from snack;
-- ��� ������ �̸�, ����, �ǸŰ�(20% ����)
select s_name ��ǰ��, s_price ����, s_price * 0.8 �ǸŰ� from snack;
-- 3000�� ���� ��� ���ڵ��� ��հ�
select avg(s_price) ��հ� from snack where s_price > 3000;
-- ��� ������ �ְ�, ������, �� ������ ��������
select max(s_price) �ְ�, min(s_price) ������, count(s_name) from snack;
-- 3000�� �̻��� ������ ��ü ����
select * from snack where s_price >= 3000;
-- 3000�� �̸��� ������ �̸�, ����, �ǸŰ�(20% ����)
select s_name ��ǰ��, s_price ����, s_price * 0.8 �ǸŰ� from snack where s_price < 3000;
-- �ٿ�Ÿ��� ����Ĩ ���� ��ȸ
select s_name ��ǰ��, s_price ���� from snack where s_name = '�ٿ�Ÿ��� ����Ĩ';
-- ���ѱ� ȸ���� ��ǰ ������ �� ��
select sum(s_price) "���� �� ��" from snack where s_company = '���ѱ�';
-- 9�� �̳��� ó���ؾ��ϴ� ���� �̸�, ����, �������
select s_name ��ǰ��, s_price ����, s_bestbefore ������� 
	from snack 
	where to_char(s_bestbefore, 'MM') < '10';
--------------------------------------------------------------------------------------
-- ���� ������
-- NOT, AND, OR, BETWEEN, IN
-- AND & BETWEEN
-- ������ 1000�� �̻�, 3000�� ������ ������ ��ü ���� ��ȸ
-- AND
select * from snack where s_price >=1000 and s_price <= 3000;
-- BETWEEN
select * from snack where s_price between 1000 and 3000;
-- BETWEEN 
--		�̻�/ ���Ϸ� ������ ������ ���� -> 1000�� �ʰ� 3000�� �̸� �� ������ ��ȸ�� ���� ��������

-- ������ 1000��, 20000��, 30000���� ������ ��ü ���� ��ȸ
select * from snack where s_price = 1000 or s_price = 2000 or s_price = 3000; 

-- IN ������
select * from snack where s_price in (1000, 2000, 3000);
-- ���ӵ��� ���� �� ���� �޾ƿ��� ���� �� ���

-- ������� �ݴ�Ǵ� ��
select * from snack where s_price not in (1000, 2000, 3000);
-- NOT IN ���� ����ϸ� �ȴ�

----------------------------------------------------------------
-- ���� ������
-- ���ڿ��� �����ϴ� �˻� : like '����' �� ����
-- ���Ͽ��� '%' ����
-- '%' : � ���� ��� �� �� ���ڿ�
-- like '%��'	: ������ ������ ���ڿ�
-- like '��%'	: ������ �����ϴ� ���ڿ� 
-- like '%��%'	: ���� ���Ե� ���ڿ�
-- like ��� ( = '��%')
-- 			=> ��ȣ�� ����Ͽ� ǥ���ϸ� �������� �ν� x
--				'��%'�� ���� �״�� �ν��ع���
--			=> like�� �̿��� '��%' �̷� ������ ���� ã�� ��� ǥ����

-- '��'�� ���� ȸ�翡�� ���� ��ǰ�� �̸� ��ȸ
select s_name from snack where s_company like '��%';
-- '��'�� ���� ��ǰ���� ��հ�
select round(avg(s_price), 1) from snack where s_name like '%��%';
-- ���ѱ� ��ǰ �̰ų�, ~���� �ΰ� �̸�, ������, ���� ��ȸ
select s_name ��ǰ��, s_company ������, s_price ���� 
	from snack
	where s_name like '%����%' or
	s_company like '���ѱ�'; 

-- ����Ʈ or ml�� �����ϴ� ��ǰ�� �̸�, ������, ����
select s_name ��ǰ��, s_company ������, s_price ����
	from snack
	where s_name like '%����Ʈ' or
	s_name like '%ml';

	
select s_name ��ǰ��, s_company ������, s_price ����
	from snack where s_name
	like in ('%����Ʈ%', '%ml%'); -- like ~ in�� ���� ��� �Ұ���
	
-- REGEXP_LIKE(�÷���, ����1|����2|...)
-- �������� ������ ã�� �ʹٸ� |(������)�� �־� ���� �߰�
-- ���Խ�(REGEX)�� �̿��Ͽ� ���ڸ� ã�� ���
-- '^X' : X������ �����ϴ� ���ڿ� ã��
-- 'X$' : ���ϰ����� ������ ���ڿ�
select s_name, s_company, s_price from snack
	where regexp_like(s_name, '^����|l$');
	

---------------------------------------------------------------------
-- ���� ������
-- ������ 
-- UNION	: �ߺ��� ���� �� ���
select 1 id, '����' subject, 90 score from dual
	union
select 1 id, '����' subject, 90 score from dual
	union
select 1 id, '����' subject, 90 score from dual;
-- UNION ALL: ���� �ߺ� �Ǵ��� ��� ���
select 1 id, '����' subject, 90 score from dual
	union all
select 1 id, '����' subject, 90 score from dual
	union all
select 1 id, '����' subject, 90 score from dual;

-- ������
-- INTERSECT : �� ���̺��� ���� �� �������� �޴� ��
	
select 1 id, '����' subject, 90 score from dual
	union
select 2 id, '����' subject, 80 score from dual
	intersect
select 1 id, '����' subject, 90 score from dual;

-- ������
-- MINUS : ù��° SELECT������ �ι�° SELECT���� ���� ���� ���

select 1 id, '����' subject, 90 score from dual
	minus
select 1 id, '����' subject, 80 score from dual 
	minus
select 1 id, '����' subject, 90 score from dual;

-- ȸ���̸� �������, ������ 1000�� ���� 3000���̻��� ��ǰ
-- ������ �켱���� (�������� �ֿ켱 ����)
-- OR > AND > NOT > �񱳿����� > ��ȣ
select * from snack 
	where s_company like '��%' and (s_price <= 1000 or s_price >= 3000);
	
---------------------------------------------------------------------
-- Group by : �׷����� ���� �����Ͽ� �ϳ��� ����� ��Ÿ��
-- ȸ�� �� ��ǰ�� ��� ����, �ּҰ���, �ְ���
-- Group by ��� �� : ������ ������ ���
select avg(s_price), min(s_price), max(s_price)
	from snack

-- ȸ�纰�� �׷��� ���� ���� ���
select s_company, avg(s_price), min(s_price), max(s_price)
	from snack
	group by s_company;

-- Rollup ������
-- group by rollup (�׷� ���)
-- �÷��� ���� �Ұ�(subtotal)�� �������
-- group by ���� �÷� ������ n�����, rollup �� ���� n+1 �� ��Ÿ��

-- ȸ���̸�, ȸ�纰 ��ǰ �� ���� �հ�� ��� ��ǰ���� ���� �հ�	
select s_company, sum(s_price)
	from snack
	group by rollup(s_company);

-- => NULL�� ���� ���� ��Ÿ���� ���� => DECODE �Լ� ���
-- DECODE(�÷���, ����, ���ǿ� �´� �����, ���ǿ� ���� ���� �� �����)
-- s_company �� null���̸� '��ü' or ������
-- ������ �����ϸ� �ٸ� ������ ���� �� ���� ����

select decode(s_company, null, '�հ�', s_company) s_company, sum(s_price)
	from snack
	group by rollup(s_company);

select nvl2(s_company, s_company, '�հ�') s_company, sum(s_price)
	from snack
	group by rollup(s_company);
-- DECODE ���� ������
--		: ���� �ڸ����� �񱳿����ڰ� �Ұ�����
--		  ��� �����ڴ� ����
--------------------------------------------------------------------
-- Having : Group by���� ���� ������ ��� �� ���ϴ� ���ǿ� �����ϴ� �ڷḸ ã���� �� �� ���
-- Having / Where 
--	: ��� ������ �̿��� ���ϴ� ���ǿ� �´� �����͸� ����
--	Having�� ��� Group�� ����� ����
--	Where�� ��� ������ ����Ͽ� ����� ����

-- ȸ�纰 ���� ��հ��� 2000�� �̻��� ȸ���� �̸��� ������ ��հ� ��ȸ
select s_company, avg(s_price)
	from snack
	group by s_company
	having avg(s_price) >= 2000;
--------------------------------------------------------------------
-- Order by : ����, �⺻���� �������� ASC / �������� DESC
-- where + group by + having + order by  ������ �ۼ��ؾ� ��
-- ���ѱ� or ������ ��ǰ�� ��հ����� 1800�� �̻��� �� �� ȸ���� ��� ���� �������� ����
select s_company, avg(s_price)
	from snack
	where s_company in ('���ѱ�','������')
	group by s_company
	having avg(s_price) >= 1800 -- �׷��� ����� ��հ� 1800�� �̻����� ������ ����
	order by avg(s_price) desc;
	
	























