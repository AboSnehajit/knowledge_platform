package com.platform.dto.request;
import  jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class CreateArticleRequest {

    @NotBlank(message="Title cannot be empty")
    @Size(min=5,max=100, message="Title must be between 5 and 100 characters")
    private String title;

    @NotBlank(message = "Content cannot be empty")
    private String content ;

    @NotBlank(message = "Author cannot be missing")
    private String author;

    public CreateArticleRequest(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public  CreateArticleRequest(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
