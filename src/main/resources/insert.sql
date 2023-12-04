insert into roles values
(1, 'ADMIN'),
(2, 'USER');

insert into users values
(1, 'Maksim', 'Mikiyanets', 'mymail@mail.ru','123',1),
(2, 'Ivan', 'Ivanov', 'ivanovmail@mail.ru','123',2);

insert into articles values
(1,'photo.jpg','body.txt','header');

insert into users_articles values
(1,'2023-10-10',2,1);

insert into players values
(1, '2002-10-13','Matthew', 'Poitras', '21', 85, 185, 'poitras.jpg','C');

insert into users_players values
(1, 2, '2023-11-11', 1);

insert into countries values
(1, 'CAN'),
(2, 'USA');

insert into teams values
(1, 'Edmonton Oilers', 1, '1965-10-10','edmontonoilers.jpg');

insert into seasons values
(1, '2020/2021'),
(2, '2021/2022'),
(3, '2022/2023'),
(4, '2023/2024');

insert into games values
(1,'2023-10-10','19:30',6300,'FINAL');

insert into trophies values
(1,'Stanley Cup','stanley_cup.jpg'),
(2, 'President Cup', 'president_cup.png');

insert into teams_seasons_trophies values
(2,2,1,2);

insert into player_team_season values
(1,1,1,1),
(2,2,1,1);

insert into player_stats values
(1,1,1,'00:20:11',1);

insert into skater_stats values
(1,1,2,2,8,10,10,7);

insert into players values
(2, '1999-10-13','Jeremy', 'Swayman', '23', 85, 191, 'jeremyswayman.jpg','G');

insert into player_stats values
(2,1,2,'00:58:00',1);

insert into goalie_stats values
(1,2,25,26,1);

insert into teams values
(2, 'Boston Bruins', 2, '1965-10-10','boston.jpg');

insert into team_stats values
(1,2,3,5,0,1,2),
(2,3,2,1,0,2,2);

insert into game_stats values
(1,1,1,2,1);