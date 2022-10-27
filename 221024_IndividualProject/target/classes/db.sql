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