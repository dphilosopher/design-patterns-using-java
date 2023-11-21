package com.example.design.patterns.creational.builder;

public enum RAM {

    DEFAULT(512), UPGRADED(1024), MAX(2048);

    private int size;

    RAM(int size){
        this.size = size;
    }
}
