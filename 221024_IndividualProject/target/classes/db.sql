create table db_siteMember(
	s_name varchar2(10 char) not null,
	s_nickName varchar2(10 char) primary key,
	s_birth varchar2(20 char) not null,
	s_id varchar2(10 char) not null,
	s_pw varchar2(20 char) not null,
	s_mail varchar2(30 char) not null,
	s_phoneNumber number(15) not null
);

-- alter table siteMember add s_phoneNumber number(15) not null; 컬럼 추가 명령어

select * from db_siteMember;
drop table db_siteMember cascade constraint purge;

---------------------------------------------------------------------------

create table siteBoard(
	b_num number(30) primary key,
	b_title varchar2(30 char) not null,
	b_content varchar2(300 char) not null,
	b_author varchar2(10 char) not null,
	b_date varchar2(20 char) default sysdate,
	b_thumb number default 0,
	b_img varchar2(200) not null
);


select * from siteBoard;
create sequence seq_siteboard;
drop table siteBoard cascade constraint purge;

insert into SITEBOARD values (seq_siteboard.nextval ,'test1', 'test1', 'test1', default , default, 'test1');





















































