create database ssafyditest;

use ssafyditest;

drop table if exists `board`;
create table board(
	`id` varchar(10) primary key,
    `title` varchar(200) not null,
    `content` varchar(4000) not null,
    `name` varchar(50) not null
);

insert into board (id, title, content, name) values ('1', 'java', '자바입니다.', '정보규');
insert into board (id, title, content, name) values ('2', 'spring', '스프링입니다.', '조창훈');

drop table if exists `users`;
create table users (
	`id` varchar(20) not null primary key,
	`pw` varchar(20) not null,
	`name` varchar(50) not null
);

insert into users (id, pw, name) values ('111', '111', '정보규');
insert into users (id, pw, name) values ('222', '222', '조창휸');

commit;

select * from board;
select * from users;
