package org.domat.unitbot;

import java.sql.*;
import java.sql.DriverManager;

public class Database {

    public static void LogBDD() {
        try {
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:8889/unibot",
                    "root", "");
            String request = "SELECT * FROM Utilisateur";
            Statement statement = connection.createStatement();
            ResultSet results = statement.executeQuery(request);
            System.out.println("test");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
