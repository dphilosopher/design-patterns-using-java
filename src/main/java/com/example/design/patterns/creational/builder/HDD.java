package com.example.design.patterns.creational.builder;

public enum HDD {

    DEFAULT(512), UPGRADED(1024), MAX(2068);

    private int size;

    HDD(int size){
        this.size = size;
    }
}
