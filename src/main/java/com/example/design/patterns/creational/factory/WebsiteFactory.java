package com.example.design.patterns.creational.factory;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType){
        switch (siteType){
            case BLOG:{
                return new Blog();
            }
            default:{
                return null;
            }
        }
    }
}
