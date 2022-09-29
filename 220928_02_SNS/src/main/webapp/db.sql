create table information(
	m_id varchar2 (10 char) primary key,
	m_pw varchar2 (10 char) not null,
	m_phoneNum varchar2 (15 char) not null,
	m_bd date not null,
	m_picture varchar2 (200 char) not null
);

select * from information;
