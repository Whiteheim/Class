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
	b_img varchar2(200) not null,
	constraint FK_writer foreign key (b_author)
		references db_siteMember(s_nickName)
		on delete cascade
);

select * from siteBoard;
create sequence seq_siteboard;
drop sequence seq_siteboard;
drop table siteBoard cascade constraint purge;

insert into SITEBOARD values (seq_siteboard.nextval ,'test1', 'test1', 'test1', default , default, 'test1');

select * from (
	select rownum rn, b_num, b_title, b_content, b_author, b_date, b_thumb, b_img 
	from siteboard
	order by b_num DESC);

-----------------------------------------------------------------------------------------------------

create table postReply (
	r_num number(30) primary key,
	r_writer varchar2(10 char) not null,
	r_comment varchar2(300 char) not null,
	r_date date default sysdate,
	constraint FK_comment foreign key (r_writer)
		references db_siteMember(s_nickName)
		on delete cascade
	);


select * from POSTREPLY;
create sequence seq_postReply;
drop sequence seq_postReply;
drop table postReply cascade constraint purge;

















































