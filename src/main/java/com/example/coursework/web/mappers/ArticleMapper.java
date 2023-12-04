package com.example.coursework.web.mappers;

import com.example.coursework.models.Article;
import com.example.coursework.web.dto.article.ArticleDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleDTO fromArticle(Article article);
    Article fromArticleDTO(ArticleDTO articleDTO);
    List<ArticleDTO> fromArticleList(List<Article> articles);
}
