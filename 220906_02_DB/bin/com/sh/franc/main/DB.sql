-- � Ư���� �Ĵ翡 ���� ���̺� ����
-- �Ĵ� ����(����) / �Ĵ� ���� / �¼� ��
create table franchise(
	f_location varchar2(10 char) primary key,
	f_owner varchar2(5 char) not null,
	f_seat number(4) not null
);
insert into franchise values ('����', '���浿', 150);
insert into franchise values ('������', '���浿', 250);
insert into franchise values ('ȫ��', 'ȫ�浿', 200);

drop table franchise cascade constraint purge;

-- ���࿡ ���� ���̺�
-- ������ �̸�, ���� �ð�, �������� ��ȭ��ȣ, ���� ����
create table reservation(
	r_no number(4) primary key,
	r_name varchar2(10 char) not null,
	r_time date not null,
	r_phone varchar2(15 char) not null,
	r_location varchar2(20 char) not null
);
create sequence reservation_seq;
insert into reservation values (reservation_seq.nextval, '��ö��', to_date('2022-09-25 17:00','YYYY-MM-DD HH24:MI'),
								'010-1234-5678', '����');
insert into reservation values (reservation_seq.nextval, '��ö��', to_date('2022-10-08 18:30','YYYY-MM-DD HH24:MI'),
								'010-9876-5432', '������');
insert into reservation values (reservation_seq.nextval, 'ȫö��', to_date('2022-11-01 19:00','YYYY-MM-DD HH24:MI'),
								'010-1478-5236', 'ȫ��');

select * from reservation;
								
delete reservation
where r_name like '%dd%';

drop table reservation cascade constraint purge;
drop sequence reservation_seq;

select *
from franchise
where f_seat >= 200;


update reservation 
set in r_name = ? and r_time = ? and r_phone = ? 
where r_no = ?












