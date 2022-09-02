select * from bistro;
select * from owner;
select * from menu;
------------------------------------------------------------
-- �¼� �� ���� ���� �Ĵ� ��ϴ� ����� ����
select *
	from OWNER
	where o_no = (
		select b_owner
		from bistro
		where b_seat = (
			select max(b_seat)
			from bistro
		)
	);

-- ���������� �޴���ü�� �̸�, ������ ���ݿ�������
-- -> ������ ���ٸ� �޴����� ������ ����
-- ������ ������ �� �� => order by �÷���, �÷���
select m_name, m_price
	from MENU
	order by m_price, m_name desc;
	
-- ��� ������� �̸�, ����
select o_name, o_birth
	from owner;
	
-- �Ĵ� ���� ��
select distinct count(*)
	from bistro; 
	
-- �޴� ��ü�� ��հ�
select avg(m_price)
	from menu;
-------------------------------------------------
-- ���� ��� �޴��� �̸�, ����
select m_name �޴���, m_price ����
	from menu
	where m_price = (
		select max(m_price)
		from menu
	);

-- �ֿ����� ������� �̸�, ����
-- subquery�� ��¥���� ����� (�ֿ����� = �ּ� ���� ��)
select o_name �̸�, o_birth �������
	from owner
	where o_birth = (
		select min(o_birth)
		from owner
	);
	
-- �¼��� ���� ���� ���� �Ĵ��� �̸�, ������, �¼���
select b_name ������, b_location ������, b_seat �¼���
	from bistro
	where b_seat = (
		select min(b_seat)
		from bistro
	);

-- ȫ����� �Ǳ����� ��ϴ� ����� �̸��� ����
select o_name �̸�, o_birth �������
	from owner
	where o_no = (
		select b_owner
		from BISTRO
		where b_name = 'ȫ�����' and b_location = '�Ǳ�'
	);
	
-- '¥��'�� �� ������ ���� �� �ִ� �����̸��� ����
select b_name ������, b_location ������
	from bistro 
	where b_no in (
		select m_b_no
		from menu
		where m_name like '%¥��%'
	);
	
-- �¼����� ���� ���� �Ĵ��� ��ϴ� ����� ��� ����
select *
	from OWNER
	where o_no = (
		select b_owner
		from BISTRO
		where b_seat = (
			select max(b_seat)
			from bistro
		)
	);

---------------------------------------------------------
-- �ֿ��� ������� ���� �޴��� �̸��� ����
select m_name �޴���, m_price ����
	from MENU
	where m_b_no = (
		select b_no
		from BISTRO
		where b_owner = (
			select o_no
			from OWNER
			where o_birth = (
				select max(o_birth)
				from OWNER
			)
		)
	);
---------------------------------------------------------
-- ���� ���̺� 'JOIN'
--		: �������� ���̺��� ���� RAM�� ��� �����صδ� ��

-- ���̺��� �ٿ� ��� ����������
-- ���̺���� �������鼭 ��Ÿ�� �� �ִ� ��� ������ ��Ÿ���� ������
select * from BISTRO, OWNER; 

-- ���ǽ��� ����ؾ���.
select * from BISTRO, OWNER where o_no = b_owner;

-- ��ü�Ĵ� �̸�, ������, ������� �̸�, ����� ����
select b_name, b_location, o_name, o_birth
	from BISTRO, OWNER
	where o_no = b_owner;
	
-- ��ü �޴���, ����, �Ĵ��̸�, ������
select m_name, m_price, b_name, b_location
	from MENU, BISTRO
	where m_b_no = b_no;
	
-- �¼��� ���� 50�� �̻��� �Ĵ��� �޴���, ����, �Ĵ��̸�, ������, �¼���
select m_name, m_price, b_name, b_location, b_seat
	from MENU, BISTRO
	where m_b_no = b_no 
		and b_seat >= 50;

-- �Ը� ���� ū �Ĵ��� �޴���, ����, �Ĵ��̸�, ������, �¼���
select m_name, m_price, b_name, b_location, b_seat
	from MENU, BISTRO
	where m_b_no = b_no 
		and b_seat = (
			select max(b_seat)
			from BISTRO
		);

-- �ֿ����� ����Գ� ��ü �޴���, ����, �Ĵ��̸�, ������, ����� �̸�, ����
--		�޴����� ������ �� -> ���� �޴��� �Ĵ��̸� ������
select m_name, m_price, b_name, b_location, o_name, o_birth
	from MENU, BISTRO, OWNER
	where m_b_no = b_no 
		and b_owner = o_no
		and o_birth in (
			select min(o_birth)
			from OWNER
			)
	order by m_name, b_name;
---------------------------------------------------------------------
-- �޴� �������� ������ ������ �������� ����
-- �޴��� ���� ��ȣ (primary key)
--		Sequence�� ó��
-- 			-> insert�� �����ص� ���� �����̵�
--	�޴� �����͵� ���� ����
-- => �޴� ��ȣ�� ��Ȯ�� ������ ���� �� ����

-- Rownum(�����ʵ�) ****************
--		select �� �� ���� �ڵ����� �ο��� ��
--		'*'�ʹ� ���� ��� �Ұ�
--		order by ���� ���� �ο��� �� 
--		������ 1������ ��ȸ

-- �����ټ����� ����, MENU ��ü ���� ��ȸ
select rownum, m_no, m_name, m_price, m_b_no 
from MENU
order by m_name;

-- �޴����� ������ ������ �����Ͽ� menu ���̺� rownum 1~3���� ��ü������ ��ȸ
-- ���� �� rownum ��ȣ���� ������ 1~3������ ���� ��ȸ

select rownum, m_no, m_name, m_price
from( 
	select m_no, m_name, m_price
	from menu
	order by m_name
	)
where rownum between 1 and 3;
-- where rownum between 2 and 3; => ���� �ȳ��� (������ 1������ ��ȸ)

-- ������ ���� from�� �־� table ó�� ��� = Inline View
-- �����͸� ���� �� rownum �� �ο�
-- rownum 2~4���� �޴����̺� ������ �޴��� ������ ������ ����
-- select���� �ѹ� �� �����ָ� rn�� ���ڸ� �ο��س��� ����� �����

select * -- rownum, rn, m_no, m_name, m_price
from (
	select rownum rn, m_no, m_name, m_price
		from (
			select m_no, m_name, m_price
			from MENU
			order by m_name
			)
		)
where rn between 2 and 4;

-- ~�浿 �̸��� ���� ����Գ�
--		�޴���, ����, �Ĵ��, ������, ������̸�
-- 		���� �������� -> ������ ���ٸ� �޴��� ������ �� ����
--		3 ~ 8��° ���� ��ȸ
select *
from(
	select rownum rn, m_name �޴���, m_price ����, b_name ������, b_location ������, o_name ����
	from(	
		select m_name, m_price, b_name, b_location, o_name
		from MENU, BISTRO, OWNER
		where m_b_no = b_no 
			and b_owner = o_no
			and o_name like '%�浿'
		order by m_price desc, m_name
		)
	)
where rn between 3 and 8;

-- �达 ���� ���� ����� ������ �޴���, ����, ����� �̸�, ����� ����
-- ���� �������� -> 2~3������ ��ȸ
select *
from (
	select rownum rn, m_name, m_price, o_name, o_gender
	from(
		select m_name, m_price, o_name, o_gender
		from MENU, BISTRO, OWNER
		where m_b_no = b_no
			and b_owner = o_no
			and o_name like '��%'
		order by m_price)
		)
where rn between 2 and 3;



























