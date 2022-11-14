create table nov14_weather(
	wNo number(20) primary key,
	wTime varchar2(100 char) not null,
	wTemp varchar2(100 char) not null,
	wMaxTemp varchar2(100 char) not null,
	wMinTemp varchar2(100 char) not null
);

create sequence weather_seq;
select * from nov14_weather;
drop table nov14_weather cascade constraint purge;
drop sequence weather_seq;