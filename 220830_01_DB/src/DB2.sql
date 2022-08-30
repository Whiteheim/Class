-- DB ��ġ / CMD����� SQLplus -> DBA ���� �ణ ���� (��������, ���Ѻο�, tablespace)
-- ������ ������� - ���̺� / �� / �� / ��Ű�� / �ν��Ͻ� / ������
-- SQL ��ɹ� �� ���Ǿ� (DDL)�� ���鼭 ���̺� ����
-- ���̺� ������ �ʿ��� �ڷ��� (���� ����ϴ� �͵� ����)
--	������ : varchar2 / ������ : number / ��¥ : date
--		������ varvhar2�� �뷮 �Է½�, char�� �־� ���ڴ����� ������ �ְ� �ϱ�
--		������ number�� �뷮 �Է½�, ���е� / ���� �� �����ؼ� �����
--		��¥ date �� ��
-- �������� - not null / primary key / foreign key
-- ���̺��� ���� ����, ���� ���� DDL �Ϸ�

-- ���� ���̺� ����
-- ���� �̸�, ȸ���, ����
-- ���̺� �ϳ��� PK �ϳ� �ʿ� 

-- �������� -> ȸ�� : ������ / �Ե� => �����̸� : ���ϰ� �� �� ���� (PK X)
-- ȸ���̸� : �� ȸ�翡�� �Ѱ��� ������ ���ڸ� ������ ���� (PK X)
-- ���� : ������ ������ ���ڰ� ���� �� ���� (PK X)
-- 	=> ��ȣ���� ����� PK�� �ִ°͵� ���

create table snack (
	s_no number(4) primary key,
	s_name varchar2(10 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(5) not null
);
-----------------------------------------------------------------

-- DML 
--	: ������ ���۾� (Data Manipulation Language)
--	  ���̺� �����͸� �˻�, ����, ����, ���� �ϴµ� ���Ǵ� ����
--		select, insert, update, delete
--			=> CRUD��� ������ (Create Read Update Delete)
-- 	C�� �ǹ� (cerete table X) <- DBA�� �۾�
-- 		�����͸� �����Ѵ� (insert O)
insert into ���̺�� (�÷���, �÷���, ...) values(��, ��, ...);

insert into snack (s_no, s_name, s_company, s_price) values(1000, '��������', '������', 5000);
-- �÷��� ������ �ٲپ� �Է� ����
insert into snack (s_no, s_price, s_company, s_name) values(1001, 3300 , '������', 'Ȩ����');

-- �÷��� ���� ���� ������ -> �����߻�, 'not null'�� ���� ������ ���� �ʿ�
-- Not null�� �����ٸ�, ���� ����, �������� ���� ������ null�� ��
-- ������ null�� ������ ���̺� ¥��
insert into snack (s_name, s_no) values('ȭ��Ʈ����', 1002); 

-- �÷��� ���� �ʰ� ���� ������� �Է��ص� ����
insert into snack values(��, ��, ...);

-- ���̺��� ������� �Է��ؾ���
drop table snack cascade constraint purge;

insert into snack values (123, '����1', 'ȸ��1', 1500);
insert into snack values (122, '����2', 'ȸ��2', 2000);
insert into snack values (125, '����3', 'ȸ��3', 3000);
insert into snack values (131, '����4', 'ȸ��4', 2200);
insert into snack values (161, '����5', 'ȸ��5', 4200);

-- �����͸� ���� �� ���� ���� ��ȣ�� �ڵ���� �ǵ���
-- factory pattern 
-- MySQL : Autoincrement �ɼ� / OracleDB : Sequence
-- ��ȣ�� ������ �°� �ڵ������ϴ� ���
-- ���̺���� ����
-- insert�� �����ϴ��� sequence�� �����۵��Ǵ� ����
-- ������ ���� �ٽ� ���� �� ����

-- sequence ����
create sequence ��������; -- ������ ������ ����
-- table �ڿ� _seq�� ������

-- ��ü������ �����ϴ� ���
create sequence ��������
	increment by 1		-- ������ (1�� ����)
	start with 1		-- ���۰�
	minvalue 10			-- �ּҰ�
	maxvalue 100		-- �ִ밪
	nocycle / cycle		-- �ִ밪�� �����ϸ� ���۰����� �ݺ� ����
	nocache / cache		-- �������� �̸� ����� �ΰ� �޸𸮿��� ������ ���� ����
	noorder / order;	-- ��û ������� ���� ���� ����
-- ���ܻ��� ������ε� �⺻���� �� ����
	
-- sequence ����
drop sequence ��������;

-- sequence ���� : ��������.nextval

drop table snack cascade constraint purge;

insert into snack values (snack_seq.nextval, '����1', 'ȸ��1', 2000);
insert into snack values (snack_seq.nextval, '����2', 'ȸ��2', 2000);
insert into snack values (snack_seq.nextval, '����3', 'ȸ��3', 2000);
insert into snack values (snack_seq.nextval, '����4', 'ȸ��4', 2000);
insert into snack values (snack_seq.nextval, '����5', 'ȸ��5', 2000);
insert into snack values (snack_seq.nextval, '����6', 'ȸ��6', 2000);


drop sequence snack_seq;
create table snack (
	s_no number(4) primary key,
	s_name varchar2(10 char) not null,
	s_company varchar2(10 char) not null,
	s_price number(5) not null,
	s_bestbefore date not null
);

create sequence snack_seq;

select sysdate from dual; -- ���� �ð��� ��¥�� �˷��ִ� ��ɾ�
insert into snack values (snack_seq.nextval, '����1', 'ȸ�� 1', 1500, sysdate)

-- Ư�� �ð� / ��¥ ����
--		Oracle �����Լ� - to_date('��', '����')
--		����(�빮��) - YYYY, MM, DD, AM/PM, HH(12�ð�), HH24(��õ), MI, SS
insert into snack values (snack_seq.nextval, '���� ����Ʈ', '�ϰմ���', 13900,
	to_date('2022-12-31 14', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���� ����Ʈ', '�ϰմ���', 13900,
	to_date('2022-09-15 16', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '�ٿ�Ÿ��� ����Ĩ', '������', 1500,
	to_date('2022-09-20 04', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '11�������������ö�', 'GS25', 5200,
	to_date('2022-10-16 17', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '��Ű��Ʈ �����̵�', '��ī�ݶ�', 1700,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '�䷹Ÿ 500ML', '��ī�ݶ�', 2000,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '������� 300ml', '�������', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '�ٳ�������300ml', '�������', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���ڿ��� 300ml', '�������', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, 'Ŀ�ǿ��� 300ml', '�������', 1650,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '���⸧ ��ġ������', '���ѱ�', 2300,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));
insert into snack values (snack_seq.nextval, '�뱸�ļ���������', '���ѱ�', 7200,
	to_date('2022-10-31 08', 'YYYY-MM-DD HH24'));

select * from snack;


------------------------------------------------------------------------------------
-- R(Read) �� ����
select [distinct] [�÷���], [�÷��� as ��Ī || �÷��� ��Ī], [�����ڻ��], [����Լ�], ...
	from [���̺��]
	where [���ǽ�]
	group by [�׷���]
	having [�Լ� ���� ����]
	order by [���Ĵ�� ASC/DESC(��������/��������)] -- �⺻���� ��������

-- �������̺� ��ü ��ȸ
-- '*' : ���̺� ���� ��� �÷� �ҷ�����
select * from snack;

-- ȸ���� ������ �̾ƿ���
-- distinct : �ߺ� ���� ���
select s_company from snack; -- ȸ���� ���� �ҷ�����
select distinct s_company from snack; -- �ߺ��� ���� �����ϰ� �ҷ�����

-- �÷��� & ��Ī
-- �÷��� : �� �÷��� ��Ī�ϴ� �÷���
-- ��Ī : 
-- select�������� ������ ����
select s_price / 100 from snack;
-- �÷����� s_price/100���� ��µ�
-- ���α׷��� ���� ������ �÷����� �̿��� ���� �ҷ����� ��찡 ������
-- �� �� �ٲ� �÷����� �ʹ� ��� ������ ��Ī�� ������ ȥ�� ����
-- as ���
select s_price / 100 as s_price from snack;
-- as �̻��
select s_price / 100 s_price from snack;


-- ������ (��� ������)
-- Dual ���̺�
--	1. Oracle ��ü���� ���ִ� ���� ���̺�
-- 	2. �Լ��� �̿��� ����� ������� �����ϰ� Ȯ���Ҷ� ���
select 1 + '3' from dual;
-- �ٸ� ����� ��� '���� �켱' => 13�� �����
-- Oracle������ '���� �켱' => 4�� �����
-- Oracle �������� �����ڰ� ���ڸ� ������ ����
select 1 + 'a' from dual; -- ���� => ���ڸ� ���ڷ� ��ȯ�Ұ� 'invalid number'

-- ���ڸ� �����ֱ� ���� ������ 
-- '||' (shift + \)
select 1 || 'a' as plus from dual;
--------------------------------------------------------------------------------

















