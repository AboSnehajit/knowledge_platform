package com.platform.service;

import com.platform.dto.request.CreateArticleRequest;
import com.platform.entity.Article;
import com.platform.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import  org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    private final ArticleRepository repository;


    public ArticleService(ArticleRepository repository) {
        this.repository = repository;
    }

    public Article createArticleService(CreateArticleRequest request)
    {

        Article article= new Article(
                request.getTitle(),
                request.getContent(),
                request.getAuthor()
        );
        return  repository.save(article);
    }


    public List<Article> getAllArticles()
    {
        return repository.findAll();
    }

    public Page<Article> getArticles(Pageable pageable)
    {
        return repository.findAll(pageable);
    }




}
