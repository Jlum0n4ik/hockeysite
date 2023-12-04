package com.example.coursework.controllers;

import com.example.coursework.models.Article;
import com.example.coursework.services.ArticleService;
import com.example.coursework.web.dto.article.ArticleDTO;
import com.example.coursework.web.mappers.ArticleMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ArticleController {
    private ArticleService articleService;
    private ArticleMapper articleMapper;
    @GetMapping("/articles")
    public ResponseEntity<List<ArticleDTO>> allArticles() {
        var articles = articleMapper.fromArticleList(articleService.getAllArticles());
        if(articles == null || articles.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(articles, HttpStatus.OK);
    }
}
