package org.domat.unitbot;

import java.sql.DriverManager;
import java.sql.*;

public class Connection {
    public static void logBDD() {
    }

    public static void LogBDD() {
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8888/phpMyAdmin/db_structure.php?server=1&db=unibot",
                    "root", "");
            System.out.println("test");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
