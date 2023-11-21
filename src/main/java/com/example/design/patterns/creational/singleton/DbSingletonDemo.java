package com.example.design.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo {

    public static void main(String [] args) throws SQLException {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        Connection conn = instance.getConn();

        Statement statement = conn.createStatement();

        statement.execute("Create table students (Id int primary key, name varchar(65))");

        System.out.println("created table students.");

        int row = statement.executeUpdate("Insert into students (Id, name) values (1, 'Obinna')");

        if(row > 0){
            System.out.println("Inserted a new row.");
        }
        conn.close();
    }
}
