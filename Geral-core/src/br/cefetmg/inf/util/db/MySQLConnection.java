package br.cefetmg.inf.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection implements ConnectionFactory {

    private final static String dbDriver = "com.mysql.jdbc.Driver";
    private final static String dbURL = "jdbc:mysql://localhost:3306/geral";
    //private final static String dbURL = "jdbc:mysql://http://localhost/phpmyadmin/db_structure.php?server=1&db=geral&token=002f17d7d91a113c2994de22676097b2";
    private final static String user = "";
    private final static String pass = "";

    public MySQLConnection() {
    }

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(dbDriver);
        return DriverManager.getConnection(dbURL, user, pass);
    }

    public static void main(String[] args) {
        try {
            ConnectionFactory cf = new MySQLConnection();
            cf.getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}