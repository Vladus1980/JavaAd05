drop database if exists magshop;
create database magshop character set utf8;
use magshop;

create table user(
id int not null primary key auto_increment,
user_firstname varchar(30) not null,
user_lastname varchar(30) not null,
user_email varchar(50) not null unique,
user_pass varchar(50) not null,
user_level varchar(5) not null
);

create table magazine(
id int primary key auto_increment not null,
magazine_name varchar(30) not null,
magazine_pages int not null,
magazine_price decimal (6,2) not null
);

create table subscription(
id int primary key auto_increment not null,
magazine_id int not null,
user_id int not null,
purchase_date timestamp not null 
);

alter table subscription add foreign key (user_id) references user (id);
alter table subscription add foreign key (magazine_id) references magazine (id);


select * from user;
-- select * from magazine;