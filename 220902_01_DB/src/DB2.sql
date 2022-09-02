-- JOIN
-- �ϳ��� ��ɹ��� ���� ���� ���̺� ����Ǿ��ִ� �����͸� �ѹ��� ��ȸ ������ ���
-- ���� ���̺��� �ϳ��� ���̺��ΰ� ó�� ���
create table tb1(name varchar2(10 char), age number (3));
create table tb2(name varchar2(10 char), age number (3));

insert into tb1 values('�谳��', 30);
insert into tb1 values('�̰���', 35);
insert into tb1 values('�ڰ���', 40);
insert into tb1 values('�Ű���', 40);

insert into tb2 values('�̰���', 30);
insert into tb2 values('������', 50);
insert into tb2 values('�谳��', 55);
-------------------------------------------------------
-- Cross Join : ������ ���� ���� ���� ���̺��� ������ ��� ����� ��ȸ�� �� ��� (��� ����� ��)
-- ��� �� ����
select * from tb1, tb2;
select * from tb1 cross join tb2;

-- Inner Join : ���ǿ� �ش��ϴ� ���� ��ȸ
select * from tb1 inner join tb2 on tb1.name = tb2.name;
select * from tb1 A, tb2 B where A.name = B.name;		-- EQUI JOIN (���� ����)
select * from tb1 join tb2 using (name);				-- EQUI JOIN ~ USING(���δ���÷���)
select * from tb1 natural join tb2;						-- NATURAL JOIN (�ڿ�����)
														-- ������ ���� ���ʿ� ������ �÷����� ��ȸ
														
-- Outer Join : ���� ���̺��� �����͸� �������� ��� ��ȸ ����
--				��� ���̺��� �����Ͱ� �ִ� ���, �ش� �÷��� ���� �������� ���� ���
-- (+)�� �̿��� outer join : null���� ��� �� ���̺��� �÷��� (+) ��ȣ �߰�
-- 							 �ַ� left outer join �� �� ���� ��

-- Left Outer Join : ���� ���̺� ���� ���� ��, ������ ���̺��� �� ���ǿ� ���� �ʾƵ� ����� ���
--						(���ǿ� ���� ������ Null������ ä��)
select * from tb1 left outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name = tb2.name(+);

-- Right Outer Join : ������ ���̺� ���� ���� ��, ���� ���̺��� �� ���ǿ� ���� �ʾƵ� ����� ���
--						(���ǿ� ���� ������ Null������ ä��)
select * from tb1 right outer join tb2 on tb1.name = tb2.name;
select * from tb1, tb2 where tb1.name(+) = tb2.name;

-- Full Outer Join : ���� ���̺� ���� ���� ��, �ٸ� ���̺��� ������ ���� �ʾƵ� ����� ���
select * from tb1 full outer join tb2 on tb1.name = tb2.name; 

-- Self Join ********
-- �ϳ��� ���̺� ���� �ִ� �÷����� �����ϴ� ������ �ʿ��� ���
-- �ܾ� �״�� ������ JOIN��

-- �� ������Ʈ�� ȸ���� 5��, ������ 2��
-- ȸ���� �̸��� ���� ȸ�� 1 ~ 5, �����ڸ� ������ 1, 2
-- ȸ���� ���̵�� ���� member 1 ~ member 3, ������ ���̵�� manager1,2
-- ȸ�� 1~3�� ������ 1�� ����, �������� ������ 2�� ����

create table member(
	m_id varchar2(10 char) primary key,
	m_name varchar2(10 char) not null,
	m_manager varchar2(10 char)			--������ ���� ������ ���� �ʾ� �������� x
);

insert into member values ('member1', 'ȸ��1', 'manager1');
insert into member values ('member2', 'ȸ��2', 'manager1');
insert into member values ('member3', 'ȸ��3', 'manager1');
insert into member values ('member4', 'ȸ��4', 'manager2');
insert into member values ('member5', 'ȸ��5', 'manager2');
insert into member values ('manager1', '������1', null);
insert into member values ('manager2', '������2', null);

select * from member;

select *
	from member A join member B on A.m_id = b.m_id;

select A.m_id, A.m_name, B.m_id
	from member A join member B -- ���� ���̺������� ���������� ����
								-- ���� ��Ī�� ���� ����
	on A.m_id = b.m_manager;	-- ���� ID�� ������ ������ ���� 
								-- ������ �����ؼ�
								-- �����ϴ� ȸ���� ID���� ������ �� �ְ� ��
	
select A.m_id, A.m_name, B.m_id
	from member A join member B on A.m_id = B.m_manager;













