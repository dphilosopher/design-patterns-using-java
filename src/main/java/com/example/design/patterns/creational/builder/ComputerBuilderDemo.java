package com.example.design.patterns.creational.builder;

public class ComputerBuilderDemo {
    public static void main(String [] args){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addHdd(HDD.DEFAULT).addRam(RAM.DEFAULT).hasUsbc(true).hasGigabitWifi(false);
        Computer computer = builder.build();

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isHasGigabitWifi());
        System.out.println(computer.isHasUsbc());
    }
}
