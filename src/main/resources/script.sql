CREATE TABLE IF NOT EXISTS Roles (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) CHECK(name in ('ADMIN', 'USER')) NOT NULL
);

CREATE TABLE IF NOT EXISTS Users (
    id SERIAL PRIMARY KEY,
    f_name VARCHAR(255) NOT NULL,
    l_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role_id INTEGER references Roles(id)
);

-- 4 Создание таблицы Articles +
CREATE TABLE IF NOT EXISTS Articles (
    id SERIAL PRIMARY KEY,
    photo_url VARCHAR(255) NOT NULL,
    body_url VARCHAR(255) NOT NULL,
    header VARCHAR(255) NOT NULL
);

-- 3 Создание таблицы Users_Articles +
CREATE TABLE IF NOT EXISTS Users_Articles (
    id SERIAL PRIMARY KEY,
    creation_date DATE NOT NULL,
    creator_id INT8 references Users(id) ON DELETE CASCADE,
    article_id INT8 references Articles(id) ON DELETE CASCADE

);
-- 5 Создание таблицы Players +
CREATE TABLE IF NOT EXISTS Players (
    id SERIAL PRIMARY KEY,
    date_of_birth DATE NOT NULL,
    name VARCHAR(255) NOT NULL ,
    lname VARCHAR(255) NOT NULL,
    age INTEGER CHECK(age between 10 and 150),
    weight INTEGER CHECK(weight between 40 and 150),
    height INTEGER CHECK(height between 140 and 250),
    photo_url VARCHAR(255) NOT NULL,
    position VARCHAR(255) CHECK(position IN ('C','RW','LW','D','F','G'))
);

-- 6 Создание таблицы Users_Players +
CREATE TABLE IF NOT EXISTS Users_Players (
    id SERIAL PRIMARY KEY,
    creater_id INTEGER references Users(id),
    creation_date DATE NOT NULL,
    player_id INTEGER references Players(id) ON DELETE CASCADE
);





--------сделано---------------------







-- 7 Создание таблицы Seasons +
CREATE TABLE IF NOT EXISTS Seasons (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 8 Создание таблицы Countries +
CREATE TABLE IF NOT EXISTS Countries (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

-- 9 Создание таблицы Teams +
CREATE TABLE IF NOT EXISTS Teams (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    country_id INTEGER references Countries(id) ON DELETE SET NULL,
    found_date DATE NOT NULL,
    logo_url VARCHAR(255) NOT NULL
);


-------------------------------сделано











-- 10 Создание таблицы Players_Teams_Season +
CREATE TABLE IF NOT EXISTS Player_Team_Season (
    id SERIAL PRIMARY KEY,
    season_id INTEGER references Seasons(id),
    player_id INT8 references Players(id),
    team_id  INTEGER references Teams(id)
);

-- 11 Создание таблицы Team_Stats +
CREATE TABLE IF NOT EXISTS Team_Stats (
    id SERIAL PRIMARY KEY,
    goals_for INTEGER CHECK(goals_for >= 0),
    goals_against INTEGER CHECK(goals_against >= 0),
    pp_attempts INTEGER CHECK(pp_attempts >= 0),
    pp_goals INTEGER CHECK(pp_goals >= 0),
    team_id INTEGER references Teams(id),
    added_by INT8 references Users(id) ON DELETE SET NULL
);








-- 12 Создание таблицы Game +
CREATE TABLE IF NOT EXISTS Games (
    id SERIAL PRIMARY KEY,
    game_date DATE NOT NULL,
    game_time TIME NOT NULL,
    game_attendance INTEGER CHECK(game_attendance >= 0),
    game_status VARCHAR(50) CHECK(game_status IN ('1-st Period', '2-nd Period','3-rd Period', 'OT', 'SO'))
);


-- 13 Создание таблицы Game_Stats +
CREATE TABLE IF NOT EXISTS Game_Stats (
    game_stat_id SERIAL PRIMARY KEY,
    gameg_id INT8 references Games(id),
    game_home_team_stat_id INT8 references Team_Stats(id),
    game_away_team_stat_id INT8 references Team_Stats(id),
    added_by INT8 references Users(id)
);

-- 14 Создание таблицы Player_Stats +
CREATE TABLE IF NOT EXISTS Player_Stats (
    id SERIAL PRIMARY KEY,
    team_id INTEGER references Teams(id),
    player_id INT8 references Players(id),
    total_ice_time TIME NOT NULL,
    game_id INT8 references Games(id)
);

-- 15 Создание таблицы Goalie_Stats +
CREATE TABLE IF NOT EXISTS Goalie_Stats (
    id SERIAL PRIMARY KEY,
    player_stat_id INTEGER references Player_Stats(id),
    saves_count INTEGER CHECK(saves_count >= 0),
    shots_faced INTEGER CHECK(shots_faced >= 0),
    goals_against FLOAT CHECK(goals_against >= 0.0)
);

-- 16 Создание таблицы Skater_Stats +
CREATE TABLE IF NOT EXISTS Skater_Stats (
    id SERIAL PRIMARY KEY,
    player_stat_id INT8 references Player_Stats(id),
    goals_count INTEGER CHECK(goals_count >= 0),
    assists_count INTEGER CHECK(assists_count >= 0),
    penalty_minutes INTEGER CHECK(penalty_minutes >= 0),
    shots_made INTEGER CHECK(shots_made >= 0),
    face_offs_count INTEGER CHECK(face_offs_count >= 0),
    face_offs_wins INTEGER CHECK(face_offs_count >= 0)
);

-- 17 Создание таблицы Trophies +
CREATE TABLE IF NOT EXISTS Trophies (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    photo_url VARCHAR(255) NOT NULL
);

-- 18 Создание таблицы Teams_Seasons_Trophies +
CREATE TABLE IF NOT EXISTS Teams_Seasons_Trophies (
    id SERIAL PRIMARY KEY,
    trophy_id INTEGER references Trophies(id),
    team_id INTEGER references Teams(id),
    season_id INTEGER references Seasons(id)
);
