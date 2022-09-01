-- ���� ���̺� / ī�� ���̺� �����
-- ���� ���̺� : ���� �̸� / ���� / ī���̸�
create table beverage(
	b_name varchar2(10 char) primary key,
	b_price number(4) not null,
	b_cafe varchar2(10 char) not null
);

-- ī�� ���̺� : ī���̸� / ���� / �¼���
create table cafe(
	c_name varchar2(10 char) primary key,
	c_location varchar2(10 char) not null,
	c_seat number(3) not null
	
);
-- [����] �� ���̺��� Ŀ��, ī���̸� ������

-- ���ǿ� �´� ���̺� ����
-- ī�� A : ����, 100�� 
insert into cafe values('Aī��', '����', '100');
-- �Ƹ޸�ī�� 2000 / �� 3000 / ���� 2500
insert into beverage values('�Ƹ޸�ī��', 2000, 'Aī��');
insert into beverage values('��', 3000, 'Aī��');
insert into beverage values('����', 2500, 'Aī��');
-- ī�� B : �Ǳ�, 80��
insert into cafe values('Bī��', '�Ǳ�', '80');
--	ȫ�� 2500 / ������ 3000 / ���������� 4000
insert into beverage values('ȫ��', 2500, 'Bī��');
insert into beverage values('������', 3000, 'Bī��');
insert into beverage values('����������', 4000, 'Bī��');

drop table beverage cascade constraint purge;
-- 3. ������ �ۼ�
-- ��հ� ���� ��� ���� ������ ������
select count(b_name)
	from beverage
	where b_price > (
		select avg(b_price)
		from beverage
	);

-- ���� �� ���Ḧ �Ĵ� ī���� �̸�
select c_name 
	from cafe
	where c_name = (
		select b_cafe
		from beverage
		where b_price = (
			select min(b_price)
			from beverage
		)
	);
	
--	���￡ �ִ� ī�信�� ����� ������ ��հ�
select avg(b_price)
	from beverage
	where b_cafe = (
		select c_name
		from cafe
		where c_location = '����'
	);
	
-- �¼��� 90�� �̻��� ī�信�� �Ĵ� ������ �̸�
select b_name
	from beverage
	where b_cafe = (
		select c_name
		from cafe
		where c_seat >= 90
	);
	
-- ��հ� ������ ������ �̸�
select b_name 
	from beverage
	where b_price <= (
		select avg(b_price)
		from beverage
	);

-- ���� ��� ���Ḧ �Ĵ� ī���� ��ġ
select c_location
	from cafe
	where c_name = (
		select b_cafe
		from beverage
		where b_price = (
			select max(b_price)
			from beverage
		)
	);

















