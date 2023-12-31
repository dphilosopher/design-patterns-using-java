package com.example.design.patterns.creational.factory;

public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new PostPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
