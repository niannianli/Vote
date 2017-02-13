
drop table users;
create table users(
       userid number(10) primary key,
       name varchar2(50),
       pwd varchar2(50),
       school varchar2(50),
       major varchar2(50),
       grade varchar2(50),
       classno number(10),
       identity varchar2(50)
);
insert into users values(1001,'tom','111111','washington','math','gradeone',1,'student');
insert into users values(1002,'lucy','111111','washington','math','gradeone',1,'faculty');
insert into users values(1003,'tom','111111','washington','physics','gradeone',1,'administrator');


drop table vote;
create table vote(
       voteid number(10) primary key,
       userid number(10),
       title varchar2(100),
       question varchar2(500),
       classification varchar2(50),
       publishDate varchar2(50),
       finishDate varchar2(50),
       avaliable number(10)    
);
insert into vote values(5001,1001,'biggest','who is biggest','commonsense','2012-12-11','2012-12-15',1);
insert into vote values(5002,1001,'largest','who is largest','commonsense','2012-12-11','2012-12-15',1);
insert into vote values(5003,1001,'fastest','who is fastest','commonsense','2012-12-11','2012-12-15',1);


drop table authority;
create table authority(
       voteid number(10) primary key,
       school varchar2(50),
       major varchar2(50),
       grade varchar2(50),
       classno number(10),
       identity varchar2(50)
);
insert into authority values(5001,'washington','math','gradeone',1,'student');
insert into authority values(5002,'washington','math','gradeone',1,'faculty');
insert into authority values(5003,'washington','physics','gradeone',1,'administrator');

drop table item;
create table item(
       itemid number(10) primary key,
       voteid number(10) ,
       label  varchar2(10),
       content varchar2(500),
       count number(10)
);
insert into item values(9001,5001,'sence','biggest is me',10);
insert into item values(9002,5001,'sence','largest is me',12);
insert into item values(9003,5001,'sence','fastest is me',20);

commit;
