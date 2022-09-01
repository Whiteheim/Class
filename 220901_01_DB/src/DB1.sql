-- ������ ���۾� (DML) �� �����͸� �Է��ϴ� ��ɾ� INSERT
-- ������ �˻� or ��ȸ ��ɾ� SELECT

-- insert into ���̺�� values(��, ��, ...) �� ����
-- insert ��� �� primary key�� �� �� ���� ��
-- ���������� ���� ��ȣ���� ����� ������� primary key �ο�
-- �� ������ ��ȣ���� �ϳ��ϳ� �������� �� ���� ������ sequence ��� Ȱ��
-- sequence �� insert�� �����ص� sequence�� ���� ������ �Ǵ°��� ����


-- ������ �˻� ������ SELECT ***
-- select distinct �÷��� , �÷��� as ��Ī || �÷��� ��Ī, ������, ����Լ�
-- from ���̺��
-- where ���ǽ�
-- group by �׷���
-- having �Լ� ���� ���� // group�� ���� ���� ����
-- order by ���Ĵ�� ASC/DESC

-- distinct �� �ߺ� ���� ����
-- �÷��� ��Ī �ο� ��� : as�� �տ� ������ (as ���� ����)
-- ������ �ø��� ù��° ��������� (+ , - , * , /)
-- ���ڸ� �̾� �����ִ� ������ '||'
-- DUAL (���� ���̺�)�� �̿��� ����Ŭ ���� ������ �����Լ�(�����Լ�, �����Լ�, ��¥�Լ�, ����Լ�, NULL���� �Լ�)

-- ��ü ������ �� ���ǿ� �´� �����͸� ã���ִ� WHERE��(���ǽ�)  
-- ������ �ø��� �ι�° �񱳿�����(=, != , <>, <, >, <=, >=)

-- ������ �ø��� ����° ���迬���� 'AND'(�ʰ� �̸� �̻� ����)�� 'BETWEEN'(�̻� ����)�� ����
-- ���ӵ��� ���� ������ �޾ƿ� �� ����ϴ� 'IN', 'OR'
-- �ݴ�Ǵ� ���� �޾ƿ� �� ����ϴ� 'NOT'
-- NOT�� ��ġ�� IN �տ� ��ġ�ؾ��� // NOT IN

-- ������ �ø��� �׹�° ���Ͽ����� : ���ڿ��� �����ϴ� �˻�
-- LIKE '%����%'�� ���� / LIKE ��� '='(��ȣ) ��� �Ұ���
--							=> ������ ���� �״�� �ν��ع����� ����

-- ������ �ø��� �ټ���° ���� ������
-- 		UNION / UNION ALL (������)
--			: �ߺ��Ǵ� ���� �����ϰ� ��� / �ߺ� �Ǵ��� ��� ���
--		INTERSECT (������)
--			: ���յ� �� ����Ǵ� ������ ���
--		MINUS (������)
--			: �տ� �ִ� SELECT�� �߿��� �ڿ��ִ� SELECT������ ���� �� ���

-- �����ڸ� ������ �ϸ� �������� �켱���� (���ʺ��� �켱����)
-- ��ȣ > �񱳿����� > NOT > AND > OR  	

-- WHERE ���ǽ� ��

-- GROUP BY : Ư�� �÷��� �׷����� ���� ����, �ϳ��� ����� ���
--		ROLL UP : �÷��� ���� �Ұ�(SUBTOTAL)�� ����� �� 

-- HAVING �� VS WHERE ��
--	HAVING : GROUP BY�� GROUPȭ ��Ų �׷��� ����� ����
-- 	WHERE  : ������ ����ؼ� ����� ����

-- ORDER BY : �������� ASC (�⺻��, ��������)
--			  �������� DESC 

----------------------------------------------------------------------
-- SUBQUERY(���� ����) ***
-- SELECT�� �ȿ� SELECT�� ����ϱ�
-- �ϳ��� SQL�� �ȿ� �ٸ� SQL���� ��ø�Ǿ��ִ� ���ǹ�
-- �ٸ� ���̺��� ������ �����ͷ� ���� ���̺� �ִ� ������ ã�ų� ���� �� �� ���
-- �����Ͱ� �뷮�� �� �����͸� ��� ���ļ� �����ϴ� 'JOIN' 
-- �ʿ��� �����͸� ã�Ƽ� �������ִ� 'SUBQUERY'

-- �� ���ǹ� (main query, �ܺ�����)�� �μ����� (sub query, ��������)�� ����

select s_name, s_price
	from snack
					where s_price < (
									select avg(s_price)
									from snack
									);
									
--	�� ���� 						�μ� ����
-- ��հ� ���� ������ ���� ��ǰ�� �̸��� ���� ������ ��ȸ�� ��
-- �κ������� ������ �����ϸ� �������� �� �� �������� ���ǿ� �°� �� ã�� �� ����
-- �μ����ǿ� ��ȣ�� �ʼ�

-- ���� ������ Where ������ ���������� ����� ���� ���� �ݵ�� '�� ������' ��� 

-- ��ǰ �� �ְ�
select max(s_price) from snack;

-- ���� ��� ��ǰ �̸�, ������, ����
select distinct s_name, s_company, s_price 
	from snack
	where s_price = (
		select max(s_price)
		from snack
		);
-- ���� �� ��ǰ ������
select s_company 
	from snack 				
	where s_price = (
		select min(s_price) 
		from snack
		);
-- ��հ� ���� ��� ���� ����
select count(s_name)
	from snack
	where s_price > (
		select avg(s_price)
		from snack
		);
-- ��������� ���� ���� ���� ������ ��ü����
select * 
	from snack
	where s_bestbefore = ( 
		select max(s_bestbefore)
		from snack
		);
---------------------------------------------------
-- ���� ȸ�翡 ���� ���̺�
select * from snack;
-- ȸ���̸�, �ּ�, ������ 
create table company(
	c_name varchar2(10 char) primary key,
	c_address varchar2(100 char) not null,
	c_employee number(3) not null
);						
insert into company values('������', '����', 100);
insert into company values('�ϰմ���', '������', 500);
insert into company values('��ī�ݶ�', '�̱�', 700);
insert into company values('�������', '����', 300);
insert into company values('���ѱ�', '��õ', 400);

select * from company;
drop table company cascade constraint purge; 
------------------------------------------------------------------
-- �������� ���� ���� ȸ�翡������� �����̸�, ����
select s_name, s_price
	from snack
	where s_company = (
		select c_name 
		from company
		where c_employee = (
			select min(c_employee)
			from company
		)
	);

-- ���� ��� ���ڸ� ����� ȸ��� ��� �ִ���
select c_address
	from company 
	where c_name in (
		select s_company
		from snack
		where s_price = (
			select max(s_price)
			from snack
		)
	);
-- ���￡ �ִ� ȸ�翡�� ����� ��ǰ�� ��հ�
select avg(s_price)
	from snack
	where s_company = (
		select c_name
		from company
		where c_address = '����'
	);
-- ��հ� �̻��� ���ڸ� ����� ȸ���� �̸�, ��ġ
select c_name, c_address
	from company
	where c_name in (
		select s_company
		from snack
		where s_price >= (
			select avg(s_price)
			from snack
		)
	);

-- '=' ��ȣ �� ���� ������ ���� ��� ��
-- ������ ���� ����ϱ� ���ؼ��� 'IN'�� ���






















