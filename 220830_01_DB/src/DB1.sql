-- 1. ��Ʈ�Ͽ� ���� ���̺� ����
-- �Ӽ� : ��Ʈ���� �̸�, ����, CPU, RAM, HDD, �����Ⱓ
-- ���̺��� �ۼ�
-- �ϳ��� �⺻Ű, ��� ���� ä���־����
create table laptop(
	l_name varchar2(10 char) primary key,
	l_price number(10) not null,
	l_cpu varchar2(10 char) not null,
	l_ram number(10) not null,
	l_hdd number(10) not null,
	l_warranty date not null
	
);

-- 2. ��Ʈ�Ͽ� 128�Ⱑ �� ��� 
-- �� �÷��� �뷮���� ���� �ۼ� (modify)
alter table laptop modify l_ram number(3);

-- 3. ��Ʈ�� ���÷��� ũ�⿡ ���� �÷��� �߰��ϴ� ����
-- ���� : cm /  �Ҽ��� �ι�°�ڸ����� ��Ÿ����
-- �� ���� ���� �� ����
alter table laptop add l_monitor number(5, 2) not null;

-- 4. ��Ʈ�Ͽ��� ������ HDD ��� SSD ����
-- HDD �÷��� �̸��� SSD�� �÷����� �����ϴ� ����
alter table laptop rename column l_hdd to l_ssd;

-- 5. �����Ⱓ �÷� �����ϴ� ���� �ۼ�
alter table laptop drop column l_warranty;

-- 6. ��Ʈ�� ���� ������ 80��~230������ �����ϴ� ���� �ۼ�
-- constraint laptop check (l_price between 800000 and 2300000)
alter table laptop modify l_price number(7)
	constraint l_check check(l_price between 800000 and 2300000);

-- 7. ���̺��� ������ �����ϴ� ���� �ۼ�
drop table laptop cascade constraint purge;

















































































