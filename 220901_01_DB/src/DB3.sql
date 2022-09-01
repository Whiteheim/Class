-- select distinct, �÷���, �÷��� as ��Ī | �÷��� ��Ī, ������, ����Լ�
--	from ���̺��
--	where ���ǽ�
-- 	group by �׷� ��� �÷� 
-- 	having �Լ� ���� ���ǽ�
-- order by ���� ��� �÷��� asc / desc
--------------------------------------------------------------------------
-- ��ľ� ���������� ���̺�

-- ȫ����� �Ǳ��� - ȫ�浿���� �, 100�� 
-- ȫ����� ������ - ��浿���� �, 80��
-- �ѽ����� ������ - ȫ�浿���� �, 150��
-- ��õ���� ��õ�� - �ֱ浿���� �, 130��

-- ȫ�浿, 1990-03-01 , ��
-- ��浿, 1992-02-01 , ��
-- ȫ�浿, 1991-12-12 , ��
-- �ֱ浿, 1989-09-01 , ��

create table bistro(

	b_no number(3) primary key,
	b_name varchar2(10 char) not null,
	b_location varchar2(10 char) not null,
	b_owner number(4) not null,				-- ����� ���� ��ȣ
	b_seat number(4) not null
);

create table owner(
	o_no number(3) primary key,
	o_name varchar2(10 char) not null,
	o_birth date not null,
	o_gender varchar2(2 char) not null
);

create sequence bistro_seq;
create sequence owner_seq;

--drop sequence owner_seq;
--drop sequence bistro_seq;
--drop table bistro cascade constraint purge;
--drop table owner cascade constraint purge;

insert into bistro values(bistro_seq.nextval, 'ȫ�����', '�Ǳ�', 1, 100);
insert into bistro values(bistro_seq.nextval, 'ȫ�����', '����', 2, 80);
insert into bistro values(bistro_seq.nextval, '�ѽ�����', '����', 3, 150);
insert into bistro values(bistro_seq.nextval, '��õ����', '��õ', 4, 130);

select * from bistro;

insert into owner values(owner_seq.nextval, 'ȫ�浿', 
	to_date('1990-03-01', 'YYYY-MM-DD'), '����');
insert into owner values(owner_seq.nextval, '��浿', 
	to_date('1992-02-01', 'YYYY-MM-DD'), '����');
insert into owner values(owner_seq.nextval, 'ȫ�浿', 
	to_date('1991-12-12', 'YYYY-MM-DD'), '����');
insert into owner values(owner_seq.nextval, '�ֱ浿', 
	to_date('1989-09-01', 'YYYY-MM-DD'), '����');

select * from owner;

----------------------------------------------------------------------
create table menu(
	m_no number(2) primary key,
	m_name varchar2(10 char) not null,
	m_price number(5) not null,
	m_b_no number(3) not null
);

create sequence menu_seq;

-- ¥��� 5000�� , ȫ����� �Ǳ������� �Ǹ�
-- «�� 6000��
-- ��ٷο� 16000��
-- �ຸ�� 8000��
-- �������� 18000��
insert into menu values(menu_seq.nextval, '¥���', 5000, 1);
insert into menu values(menu_seq.nextval, '«��', 6000, 1);
insert into menu values(menu_seq.nextval, '��ٷο�', 16000, 1);
insert into menu values(menu_seq.nextval, '�ຸ��', 8000, 1);
insert into menu values(menu_seq.nextval, '��������', 18000, 1);
-- �Ҵ߹� 12000��, �ѽ����� ���������� �Ǹ�
-- ������� 8000��
-- ���Ͼ��� 6000��
-- ����� 12000��
-- ���� 18000��
insert into menu values(menu_seq.nextval, '�Ҵ߹�', 12000, 2);
insert into menu values(menu_seq.nextval, '�������', 8000, 2);
insert into menu values(menu_seq.nextval, '���Ͼ���', 6000, 2);
insert into menu values(menu_seq.nextval, '�����', 12000, 2);
insert into menu values(menu_seq.nextval, '����', 18000, 2);
-- ¥��� 5000�� , ȫ����� ����
-- ������ 8000��
-- ������ 16000��
-- �粿ġ 3000��
-- ������ 18000��
insert into menu values(menu_seq.nextval, '¥���', 5000, 3);
insert into menu values(menu_seq.nextval, '������', 8000, 3);
insert into menu values(menu_seq.nextval, '������', 16000, 3);
insert into menu values(menu_seq.nextval, '�粿ġ', 3000, 3);
insert into menu values(menu_seq.nextval, '������', 18000, 3);
-- ������ 8000��,��õ���� ��õ��
-- ��ȸ 12000��	
-- ��ä��â 16000��
-- ������� 7500��
-- ġŲ 21500��
insert into menu values(menu_seq.nextval, '������', 8000, 4);
insert into menu values(menu_seq.nextval, '��ȸ', 12000, 4);
insert into menu values(menu_seq.nextval, '��ä��â', 16000, 4);
insert into menu values(menu_seq.nextval, '�������', 7500, 4);
insert into menu values(menu_seq.nextval, 'ġŲ', 21500, 4);

select * from menu;



























