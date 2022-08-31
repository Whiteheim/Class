-- 웹사이트에서 게시판에 대한 테이블과 이를 [참조하는] 댓글 테이블
-- 게시판 테이블에는 [작성자 / 게시판 글 내용 / 작성 시간]
-- 댓글 테이블에는 [작성자 / 댓글내용 / 댓글 작성 시간]

-- 1. 테이블의 구조를 파악해서 게시판 테이블 만들기
-- 2. 테이블의 구조를 파악해서 댓글 테이블 만들기
-- [조건 : 참조되는 테이블의 내용이 삭제되면 관련있는 댓글내용도 삭제]

-- 3. 각각의 테이블에 값 2개씩 넣기
-- [date 값은 현재 날짜/ 시간]
create table notice_board(
	n_no number(10) primary key,
	n_name varchar2(10 char) not null,
	-- 작성자가 글을 하나만 작성할것이 아니기 때문에 PK에 적합하지 않음
	n_contents varchar2(500 char) not null,
	n_time date not null
);
create sequence notice_board_seq;
insert into notice_board values (notice_board_seq.nextval,'관리자','공지사항', sysdate);
insert into notice_board values (notice_board_seq.nextval,'스탭','등업신청해주세요', sysdate);

select * from NOTICE_BOARD;

create table reply(
	r_no number(10) primary key,
	r_n_no number(10) not null, -- 소속된 게시글의 번호 / 여기에 board 테이블 참조
	r_name varchar2(10 char) not null,
	r_contents varchar2(500 char) not null,
	r_time date not null,
	constraint FK_number foreign key (r_n_no)
		references notice_board(n_no)
		on delete cascade
);
create sequence reply_seq;

insert into reply values(reply_seq.nextval, 44, '회원1', '반갑습니다', sysdate)
insert into reply values(reply_seq.nextval, 45,'회원2', '등업신청합니다', sysdate)
select * from REPLY;

delete NOTICE_BOARD where n_no = 44;
delete REPLY;
drop table notice_board cascade constraint purge;
drop table reply cascade constraint purge;



