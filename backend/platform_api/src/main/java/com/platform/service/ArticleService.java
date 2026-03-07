package com.platform.service;

import com.platform.entity.Article;
import com.platform.repository.ArticleRepository;
import  org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository repository;


    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    public Article createArticleService(Article article)
    {
        return  repository.save(article);
    }


    public List<Article> getAllArticles()
    {
        return repository.findAll();
    }



}
