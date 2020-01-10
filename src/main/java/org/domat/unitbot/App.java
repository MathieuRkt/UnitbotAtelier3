package org.domat.unitbot;

public class App {

    public static void main(String[] args) {
        Window window = new Window();
        Connection log = new Connection();
        System.out.println("Hello World");
        Connection.logBDD();
        window.setWindow();

    }

    //Connection connection =
      //      DriverManager.getConnection("jdbc:domat://localhost:8888/phpMyAdmin/db_structure.php?server=1&db=unibot");
}
