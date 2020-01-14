package org.domat.unitbot;

public class App {

    public static void main(String[] args) {
        Window window = new Window();
        Database log = new Database();
        System.out.println("Hello World");
        window.setWindow();
        log.LogBDD();


    }

    //Connection connection =
      //      DriverManager.getConnection("jdbc:domat://localhost:8888/phpMyAdmin/db_structure.php?server=1&db=unibot");
}
