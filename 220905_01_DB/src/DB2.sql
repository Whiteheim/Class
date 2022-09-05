create table computer(
	c_no number(4) primary key,
	c_name varchar2(10 char) not null,
	c_os varchar2(20 char) not null,
	c_format date not null,
	c_weight number(10) not null, -- number 3,2
	c_cpu varchar2(10 char) not null
);
drop table computer cascade constraint purge;

create sequence computer_seq;
drop sequence computer_seq;
insert into computer values 
	(computer_seq.nextval, 'µ≈¡ˆ ∫ª√º', 'Windows 10 Pro', 
		to_date('2022-09-01', 'YYYY-MM-DD'), 51200, 'i5-1234');
insert into computer values 
	(computer_seq.nextval, 'µ≈¡ˆ ∫ª√º', 'Windows 10 Pro', 
		to_date('2022-08-23', 'YYYY-MM-DD'), 52300, 'i7-5678');
		
select * from computer;

insert into computer values 
	(computer_seq.nextval, '≈ ∞Ì', 'Windows 10 Pro', 
		to_date('2022-09-04', 'YYYY-MM-DD'), 32200, 'i7-1234');
		

select min(c_format), count(c_no)
from computer;

select c_name
from computer
where c_format = (
	select max(c_format)
	from computer
);

select * 
from (select rownum rn, c_no, c_name, c_os, c_format, c_weight, c_cpu
	  from (select c_no, c_name, c_os, c_format, c_weight, c_cpu
	  		from computer
	  		order by c_weight
	  		)
	  )
where rn between 3 and 5;

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
