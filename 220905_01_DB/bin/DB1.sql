-- ����, 3kg, 10000��, Ȩ�÷���, �Ǳ���, ��� 1000��, ������ 500��
-- ��, 500g , 5000��, Ȩ�÷���, ������, 500��, 300��
-- ����, 2kg, 5000��, �̸�Ʈ, ������, 800��, 800��
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
insert into mart values (mart_seq.nextval, 'Ȩ�÷���', '�Ǳ���', 1000, 500);
insert into mart values (mart_seq.nextval, 'Ȩ�÷���', '������', 500, 300);
insert into mart values (mart_seq.nextval, '�̸�Ʈ', '������', 800, 800);

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
insert into VEGETABLE values (vegetable_seq.nextval, '����', 10000, 3000, 1);
insert into VEGETABLE values (vegetable_seq.nextval, '��', 5000, 500, 2);
insert into VEGETABLE values (vegetable_seq.nextval, '����', 5000, 2000, 3);
drop table vegetable cascade constraint purge;
select * from VEGETABLE;
--------------------------------------------------------------------------------
-- create table - DBA
-- drop table - DBA
-- create sequence - DBA
-- ���� �ϳ��� ������ ��� ����
-- �Ի� �� ����� ����ڿ� ���� �˷��� -> ������ ���� ������ ����

-- ���� ������?
-- C - insert
--			sequence ���, ��¥ �Է� ���
-- R - select
--		�߿��ؼ� �ַ� �н�
-- U - update
 update ���̺��
 	set �÷��� = ��, �÷��� = ��, ... -- �ٲ� ����
 	where ����;
 	
 -- ���� ��¥��
 -- ���߸� �����Ư����߷� �̸� ����
 -- ��� ��Ʈ�� ������ 30% ����
 -- Ȩ�÷��� �Ǳ����� ��ǰ ���� 10% ����
 -- ���� ��� ��ǰ 10% ����	
 	
 update VEGETABLE
 	set v_cost = 0
 	where v_name = '��';
 
 update VEGETABLE
 	set v_name = '�����Ư�����'
 	where v_name = '����';
 	
 update MART
 	set m_parking = m_parking * 0.7;
 	
 update VEGETABLE
 	set v_cost = v_cost * 0.9
 	where v_m_no = (
 	    select m_no 
 		from mart
 		where m_name = 'Ȩ�÷���' and m_location = '�Ǳ���');
 	
 update vegetable
 	set v_cost = v_cost * 0.9
	where v_cost =(
		select max(v_cost)
		from vegetable
	);

----------------------------------------------------------------------
-- D - delete
delete from ���̺��
	where ���ǽ�;
	
-- �� ����
delete from VEGETABLE
	where v_name = '��';
-- ���� ���� ���� ��ǰ �� ����
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
-- Ȩ�÷��� ������ ����
delete from MART
	where m_name = 'Ȩ�÷���' and m_location = '����';

-- Ȩ�÷��� �������� �������µ�, �� �ȿ� �ִ� ��ǰ���� ��� ����?
-- ������ ���� ���� ������ ������Ʈ�� ������� ������ ����
---------------------------------------------------------
-- ������Ʈ > ���� > �α��� > �弳 �Խ�> Ż��
delete ����
	where id = 'xxx';
-- �� ���� ����?
-- xxx�� ���� ����� -> �� �� �ٸ������ ���� ���̵�� �����ϰԵǸ� ������ ����
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


















