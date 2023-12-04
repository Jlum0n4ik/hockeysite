package com.example.coursework.controllers;

import com.example.coursework.models.Article;
import com.example.coursework.models.game.Game;
import com.example.coursework.models.game.GameStats;
import com.example.coursework.models.player.GoalieStats;
import com.example.coursework.models.player.PlayerStats;
import com.example.coursework.models.player.SkaterStats;
import com.example.coursework.models.team.Team;
import com.example.coursework.models.team.TeamStats;
import com.example.coursework.models.trophy.Trophy;
import com.example.coursework.models.user.User;
import com.example.coursework.models.player.Player;
import com.example.coursework.repositories.GameStatsRepository;
import com.example.coursework.services.*;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TestUserController {
    private UserService userService;
    private ArticleService articleService;
    private PlayerService playerService;
    private TeamService teamService;
    private GameService gameService;
    private TrophyService trophyService;
    private PlayerStatsService playerStatsService;
    private SkaterStatsService skaterStatsService;
    private GoalieStatsService goalieStatsService;
    private GameStatsService gameStatsService;
    private TeamStatsService teamStatsService;
    @GetMapping("/users")
    private ResponseEntity<List<User>> allUsers() {
        var users = userService.getAllUsers();
        if (users == null || users.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
    @GetMapping("/articles")
    public ResponseEntity<List<Article>> allArticles() {
        var articles = articleService.getAllArticles();
        if(articles == null || articles.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
    @GetMapping("/players")
    public ResponseEntity<List<Player>> allPlayers() {
        var players = playerService.getAllPlayers();
        if(players == null || players.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
    @GetMapping("/teams")
    public ResponseEntity<List<Team>> allTeams() {
        var teams = teamService.findAllTeams();
        if(teams == null || teams.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(teams, HttpStatus.OK);
    }
    @GetMapping("/games")
    public ResponseEntity<List<Game>> allGames() {
        var games = gameService.findAllGames();
        if(games == null || games.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(games, HttpStatus.OK);
    }
    @GetMapping("/trophies")
    public ResponseEntity<List<Trophy>> allTrophies() {
        var trophies = trophyService.findAllTrophies();
        if(trophies == null || trophies.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(trophies, HttpStatus.OK);
    }
    @GetMapping("/playerStats")
    public ResponseEntity<List<PlayerStats>> allPlayerStats() {
        var playerStats = playerStatsService.getAllPlayerStats();
        if(playerStats == null || playerStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(playerStats, HttpStatus.OK);
    }
    @GetMapping("/skaterStats")
    public ResponseEntity<List<SkaterStats>> allSkaterStats() {
        var skaterStats = skaterStatsService.getAllSkaterStats();
        if(skaterStats == null || skaterStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(skaterStats, HttpStatus.OK);
    }
    @GetMapping("/goalieStats")
    public ResponseEntity<List<GoalieStats>> allGoalieStats() {
        var goalieStats = goalieStatsService.getAllGoalieStats();
        if(goalieStats == null || goalieStats.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(goalieStats, HttpStatus.OK);
    }
    @GetMapping("/gameStats")
    public ResponseEntity<List<GameStats>> allGameStats() {
        var gameStats = gameStatsService.getAllGameStats();
        if(gameStats == null || gameStats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(gameStats, HttpStatus.OK);
    }
    @GetMapping("/teamsStats")
    public ResponseEntity<List<TeamStats>> allTeamsStats() {
        var teamsStats = teamStatsService.getAllTeamStats();
        if(teamsStats == null || teamsStats.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(teamsStats, HttpStatus.OK);
    }
}
