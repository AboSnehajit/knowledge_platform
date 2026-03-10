package com.platform.dto.response;

public class ArticleResponse {


    private Long id;
    private String title;
    private String content;
    private  String author;

    public ArticleResponse(Long id , String title, String content,String author)
    {
        this.id=id;
        this.title=title;
        this.content=content;
        this.author=author;
    }


}
