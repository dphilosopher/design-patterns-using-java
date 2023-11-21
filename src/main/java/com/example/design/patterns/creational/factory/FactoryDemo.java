package com.example.design.patterns.creational.factory;

import java.util.Calendar;
import java.util.Locale;

public class FactoryDemo {
    public static void main(String [] args){
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());


    }
}
