package com.platform.repository;


import com.platform.dto.response.ArticleResponse;
import com.platform.entity.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends  JpaRepository<Article, Long > {

    Page<Article> findAll(Pageable pageable);

    @Query(value = """
            SELECT new com.platform.dto.response.ArticleResponse(
            a.id,
            a.title,
            a.content,
             u.name)
            FROM Article a
            JOIN a.author u
            """)
    List<ArticleResponse> getArticles();

}
