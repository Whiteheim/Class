create table error(
	e_what varchar2(30 char) primary key,
	e_where varchar2(30 char) not null
);

insert into error values('not exist @', 'DAO');
insert into error values('not exist mapper', 'servlet-context.xml');
insert into error values('exist ;', 'mapper.xml');
insert into error values('not exist Package Class', 'mapper.xml');
insert into error values('not exist Package File', 'Project');

select * from error;
