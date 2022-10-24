create table member(
	m_name varchar2(10 char) not null,
	m_nickName varchar2(10 char) primary key,
	m_birth date not null,
	m_id varchar2(10 char) not null,
	m_pw varchar2(20 char) not null,
	m_pwck varchar2(20 char) not null,
	m_mail varchar2(30 char) not null
)