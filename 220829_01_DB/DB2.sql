-- �ɼ�
-- ��������(Constraint)
-- �������� ���Ἲ�� �����ϱ� ���� �뵵
-- ������ ���Ἲ : �����ͺ��̽��� ����� �������� �ϰ����� ��Ȯ���� ��Ű�� ��

-- 1. ������ ���Ἲ ��������
--		������ ���� (Domain Constraint) 
--		���̺� ���� Ʃ�õ��� �� �Ӽ��� �����ο� ������ ���� ������ �Ѵٴ� ����
--		������ Ÿ��(type), ��(null / not null***), �⺻��(default), üũ(check) ���� Ȱ���ؼ� ����

-- 2. ��ü ���Ἲ ��������
--		�⺻Ű ����(Primary key *** Constraint)
--		��ü(Entity) : ���, ���, �繰, ��� ��� ���� ���������� �����ϸ�
--						�����ϰ� �ĺ� ������ ����
--		�ƹ��� ���� ��ü�� �־, ���� ���ϴ� '������' ��ü�� �߰��� �� �־�� �Ѵ�
--		���̺��� �⺻Ű�� �����ϰ�, Null���� �������� �ȵǸ�, 
--		���̺� ���� ���� �ϳ��� ���� �����ؾ��Ѵٴ� ����

-- 3. ���� ���Ἲ ��������
--		�ܷ�Ű ����(foreign key *** Constraint)
--		���̺� ���� �������踦 �����ϴ� ��������
--		�����޴� ���̺��� �ܷ�Ű�� �����ϴ� ���̺��� �⺻Ű(2�� ����)�� �����ؾ� �ϸ�,
--		�����޴� ���̺��� ���� ���� �� ��, �����ϴ� ���̺��� ������ �޴� ��
------------------------------------------------------------------------------------
--	1. Not Null : Null = �� ��
--					=> 0 �̳� ���⵵ �ƴ� ���� ���� ���� ����
--				  Not Null = Null ��� x
--					=> �ʼ������� �Է��ؾ� �� �÷��� ����
--					=> ���� ���� ���Ǵ� ���� ����
--					: ���̺��� ���� �� ������ ���� ������ �Է��ϱ� ***

-- �������Ǹ��� ���� �ο����� �ʴ� ���(Oracle�� �ڵ����� �̸� �ο�)
create table example1(
	col1 varchar2(10),
	col2 varchar2(10 char) not null
);

-- Constraint Ű���带 ����ؼ� �������Ǹ��� ���� �ο��ϴ� ���
create table example2(
	col1 varchar2(10 char),
	col2 varchar2(10 char),
	constraint col2_notnull not null
);

-- 2. Unique : �ش� �÷��� ���� ���� ��ü ���̺��� �����ؾ� �Ѵٴ� ����
--		Not Null�� �Բ� ��� ����, ������ ���� ������ ����
create table example3(
	col1 varchar2(10 char) unique,
	col2 varchar2(10 char) unique not null,
	col3 varchar2(10 char),
	constraint clo3_unique unique(col3)
);

-- 3. Primary Key (�⺻ Ű) : NULL �� �ߺ� �����͸� �� �� ������� ����
--		(Not Null + Unique => primary key)
--		�������� Ư�� ������ �˻��ϰų� ���� ���� �۾��� �� �� �⺻Ű�� ����
--		ID, �ֹε�Ϲ�ȣ, ȸ����ȣ, �� ��ȣ ���� �⺻ Ű�� �ش��
--		�Ϲ������� ���̺��� 1���� �⺻Ű�� �ʼ� ����
create table example4(
	col1 varchar2(10 char) primary key,
	col2 varchar2(10 char) not null,
	col3 varchar2(10 char) not null
);

-- ���� �÷��� ���� ��, constraint Ű���带 ���
--		PK(primary key)�� ������ �ϳ��� ���
create table example5(
	col1 varchar2(10 char),
	col2 varchar2(10 char),
	col3 varchar2(10 char),
	constraint PK_example5 primary key (col1, col2)
);

-- *** ¯���
-- 4. Foreign Key(�ַ� Ű) : �ٸ� ���̺��� Ư�� �÷��� ��ȸ�ؼ� 
--							������ �����Ͱ� �ִ� ��쿡�� �Է��� ����
--		�����ϴ� ���̺��� PK or Unique�� ������ �÷����� FK(foreign key)�� ��������
--		�ܷ�Ű ������ ���� �����޴� �÷��� ���� �����Ǿ�� ��
--		�ܷ�Ű�� ���� ���̺��� ���� �÷� ���� ���Ŀ� �����Ǿ�� ��

-- �ܷ�Ű�� ���� ���̺��� ����
create table ���̺��(
	�÷��� �ڷ��, -- ��ǥ �����ʱ�
	constraint FK�� foreign key(�÷���)
		references ������̺��(������̺��� �⺻Ű(or ����Ű) �÷���)
		on delete set null || on delete cascade ���û��� 2�� ��1
		-- �����޴� ���̺��� �� �κ��� ������ �� 
		-- �� ���̺� ������ �Ǿ��ִ� �࿡ ���ؼ�
		-- Null���� �� �� or ���� ���� �������� ���� �ɼ� 
);

create table example6(
	ex6_id varchar2(10 char) primary key
);
insert into example6 values('10');
insert into example6 values('20');
insert into example6 values('30');
select * from example6;

create table example7(
	ex7_id varchar2(10 char),
	constraint fk_ex7 foreign key (ex7_id)
		references example6(ex6_id)
		on delete cascade
);

insert into example7 values('10');
insert into example7 values('20');
insert into example7 values('30');
insert into example7 values('40');
select * from example7;
-- ex6_id�� 10�� �÷��� �����?
delete from example6 where ex6_id = '10';

-- �а� ���̺�� �̰��� �����ϴ� �л� ���̺�
-- �а� ���̺� : �а��ڵ� (4�ڸ� ����), �а��̸� (10���� �̳�)
-- �л� ���̺� : �л���ȣ (3�ڸ� ����), �л��̸�, �л��� �ҼӵǾ��ִ� �а��� �ڵ�
-- �а��� �������� �� �л� ������ ����������
create table department(
	d_cod1 number(4) primary key,
	d_name varchar2(10 char) not null
);
insert into department values(1234, '�����а�');
insert into department values(1235, '���������а�');
insert into department values(1236, 'ü���а�');
insert into department values(1237, '������а�');

delete from department where d_cod1 = 1234;
-- 1234 �ڵ带 ����� �л� ���̺��� 1234 �ڵ带 ���� �л����� ������ ������
select * from department;

drop table department -- ������ ���̺��� ���� �� ���̺��� ������ �� ����
drop table department cascade constraint purge; -- ��������

create table student(
	s_numb number(3) primary key,
	s_name varchar2(3 char) not null,
	s_d_cod number(4) not null, 
	constraint FK_cod foreign key (s_d_cod)
		references department(d_cod1)
		on delete cascade 
);
insert into student values(111, '����', 1236);
insert into student values(112, '������', 1234);
insert into student values(113, '�ڹڹ�', 1235);
insert into student values(114, '������', 1237);
select * from student;
drop table student cascade constraint purge;

------------------------------------------------

-- 5. Check : �������� ���� ���� or ���� ���� �� �ش��ϴ� �����͸� ���
create table example8(
	col1 number(3) constraint ex8_check check (col1 between 1 and 9)
);

insert into example8 values(8);
insert into example8 values(11); -- 1~9������ ���ڰ� �ƴϾ �����߻�
select * from example8;
drop table example8;

-- 6. Default : � �����͵� �Է����� ���� ����, ������ �����Ͱ� �ڵ����� �Է�
create table example9(
	col1 number(4) default 999
);

insert into example9 values(default);
insert into example9 values(null);
insert into example9 values(0);
insert into example9 values(11);
select * from example9;













































