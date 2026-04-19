package com.sandip.designpattern.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EveryDayExampleDriver {
    //JDBC Database connection creation
    //Register a driver
    //Create a connection
    //Create Statement

    public static void main(String[] args) {
        //h2 in memory database connection creation
        String url = "jdbc:h2:mem:dummy;DB_CLOSE_DELAY=-1";
        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();

            //Client is an abstraction and can work with any database that has a driver
            statement.executeUpdate(
                    "CREATE TABLE address(ID int PRIMARY KEY, district VARCHAR(20), city VARCHAR(20))"
            );
            System.out.println("Table created");
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
