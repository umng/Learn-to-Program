
drop table if exists player;

create table player(
player_id int(11) not null AUTO_INCREMENT,
name varchar(100) not null,
username varchar(100) not null,
password varchar(100) not null,
country varchar(100) not null,
skill varchar(100) not null,
team varchar(100) not null,
PRIMARY KEY (player_id));


insert into player(player_id,name,username,password,country,skill,team) values (1,'Zaheer Khan','zaheer','zaheer','India','Bowling','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (2,'Mayank Agarwal','mayank','mayank','India','Batting','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (3,'Khaleel Ahmed','khaleel','khaleel','India','Bowling','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (4,'Mohammed Shami','mohammed','mohammed','India','Bowling','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (5,'Karun Nair','karun','karun','India','Batting','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (6,'Jayant Yadav','jayant','jayant','India','Bowling','Delhi Daredevils');
insert into player(player_id,name,username,password,country,skill,team) values (7,'Carlos Brathwaite','carlos','carlos','West India','All-Rounder','Delhi Daredevils');

