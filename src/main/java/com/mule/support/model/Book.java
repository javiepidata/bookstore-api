package com.mule.support.model;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private Integer pages;
    private Integer id; // Must be unique per book
    
    public Book() {
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) return true;
    	if(!(obj instanceof Book)){
    		return false;
    	}
    	Book book = (Book) obj;
    	return Objects.equals(author, book.getAuthor()) &&
    			Objects.equals(title, book.getTitle()) &&
    			Objects.equals(pages, book.getPages());
    		
    }
    @Override
    public int hashCode() {
    	return Objects.hash(author, title, pages);
    }
}
