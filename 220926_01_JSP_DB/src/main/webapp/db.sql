create table sep26_apple(
	a_location varchar2(10 char) primary key,
	a_name varchar2(10 char) not null,
	a_color varchar2(10 char) not null,
	a_price number(8) not null,
	a_flavor varchar2(100 char) not null
);

insert into sep26_apple values('���', 'ȫ��', '����', '4000', '�ƻ��ϰ� ����');
insert into sep26_apple values('����', '�λ�', '��ȫ', '5000', '���� ����');
insert into sep26_apple values('����', 'ǲ���', '�ʷ�', '4500', '�̱׷���');
select * from sep26_apple;



