-- ������Ʈ���� �Խ��ǿ� ���� ���̺�� �̸� [�����ϴ�] ��� ���̺�
-- �Խ��� ���̺��� [�ۼ��� / �Խ��� �� ���� / �ۼ� �ð�]
-- ��� ���̺��� [�ۼ��� / ��۳��� / ��� �ۼ� �ð�]

-- 1. ���̺��� ������ �ľ��ؼ� �Խ��� ���̺� �����
-- 2. ���̺��� ������ �ľ��ؼ� ��� ���̺� �����
-- [���� : �����Ǵ� ���̺��� ������ �����Ǹ� �����ִ� ��۳��뵵 ����]

-- 3. ������ ���̺� �� 2���� �ֱ�
-- [date ���� ���� ��¥/ �ð�]
create table notice_board(
	n_no number(10) primary key,
	n_name varchar2(10 char) not null,
	-- �ۼ��ڰ� ���� �ϳ��� �ۼ��Ұ��� �ƴϱ� ������ PK�� �������� ����
	n_contents varchar2(500 char) not null,
	n_time date not null
);
create sequence notice_board_seq;
insert into notice_board values (notice_board_seq.nextval,'������','��������', sysdate);
insert into notice_board values (notice_board_seq.nextval,'����','�����û���ּ���', sysdate);

select * from NOTICE_BOARD;

create table reply(
	r_no number(10) primary key,
	r_n_no number(10) not null, -- �Ҽӵ� �Խñ��� ��ȣ / ���⿡ board ���̺� ����
	r_name varchar2(10 char) not null,
	r_contents varchar2(500 char) not null,
	r_time date not null,
	constraint FK_number foreign key (r_n_no)
		references notice_board(n_no)
		on delete cascade
);
create sequence reply_seq;

insert into reply values(reply_seq.nextval, 44, 'ȸ��1', '�ݰ����ϴ�', sysdate)
insert into reply values(reply_seq.nextval, 45,'ȸ��2', '�����û�մϴ�', sysdate)
select * from REPLY;

delete NOTICE_BOARD where n_no = 44;
delete REPLY;
drop table notice_board cascade constraint purge;
drop table reply cascade constraint purge;



