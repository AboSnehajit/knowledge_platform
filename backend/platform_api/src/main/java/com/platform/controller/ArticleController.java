package com.platform.controller;

import com.platform.dto.request.CreateArticleRequest;
import com.platform.entity.Article;
import com.platform.service.ArticleService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @PostMapping("/create_article")
    public Article createArticle(@Valid  @RequestBody CreateArticleRequest request)
    {
        return service.createArticleService(request);
    }

    @GetMapping("/getAll_articles")
    public List<Article> getAllArticles()
    {
        return service.getAllArticles();
    }

    @GetMapping("/get_page")
    public Page<Article>getArticles(Pageable pageable)
    {
        return service.getArticles(pageable);
    }


}
