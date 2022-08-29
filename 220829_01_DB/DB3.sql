create table aug29_coffee(
	c_name varchar2(10 char) primary key,
	c_price number(5) not null,
	c_kcal number(3) not null,
	c_start date not null
);

insert into aug29_coffee values('�Ƹ޸�ī��', 3000, 15, sysdate);
select * from aug29_coffee;

-- DDL�� alter / drop / truncate

-- ������ Ÿ�� ���� / �÷��� ũ��(�뷮) ����
alter table ���̺�� modify �÷��� ������Ÿ��(�뷮)];
-- ���� �ִ� ���¿��� ������Ÿ�� �����ϸ� ����
alter table aug29_coffee modify c_name number(3);
-- ���� �ִ� ���¿��� �뷮�� ���� �����ϸ� ����
alter table aug29_coffee modify c_name varchar2(2 char);

-- ���� ���� : ������Ÿ���� ������ ��, ���� ��� ������ ���氡�� -> �ƴϸ� ����
--				�÷��� �뷮�� ���� ��� �ش� �÷��� �뷮�� ��ȸ�ؼ� ������ ���� ����
--				ū ���� �ִ��� Ȯ�� �� ����

------------------------------------------------------------------------------

-- �÷��� ����
alter table ���̺�� rename column ���� �÷��� to �ٲ� �ɷ���
alter table aug29_coffee rename column c_name to c_name2;

-- �÷� �߰� 
alter table ���̺�� add �÷��� ������Ÿ�� �������� (��������);
-- ������ �����Ͱ� ����� notnull ����
alter table aug29_coffee add c_taste varchar2(20 char) not null; 

-- �÷� ����
alter table ���̺�� drop column �÷���;
alter table aug29_coffee drop column c_taste;
------------------------------------------------
-- ���̺� ���� ���� �����
truncate table ���̺��;
truncate table aug29_coffee;
-- ���̺� �ִ� �����͸� ����������, ���̺��� ���� ��ü�� ���� ���� ����

-- ���̺� ����(�ӽú���)
drop table ���̺�� cascade constraint;
drop table aug29_coffee cascade constraint;

-- ������ ���̺� ����
flashback table ���̺�� to before drop;
flashback table aug29_coffee to before drop;

-- ������ ����
purge recyclebin;

-- ���̺� ���� ����
drop table ���̺�� cascade constraint purge;
drop table aug29_coffee cascade constraint pure;

-----------------------------------------------------
-- DDL : ���� x
-- ����ִ� DBA���� ���̺��� ���� CRUD������ �ϰԲ� �� ��




























