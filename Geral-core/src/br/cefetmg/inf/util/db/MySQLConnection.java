package br.cefetmg.inf.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLConnection implements ConnectionFactory {

    private final static String dbDriver = "com.mysql.jdbc.Driver";
    private final static String dbURL = "jdbc:postgresql://localhost:5432/sislocdb";
    private final static String user = "postgres";
    private final static String pass = "postgres";

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
