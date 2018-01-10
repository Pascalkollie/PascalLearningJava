package com.company;

import java.sql.*;

public class Main {

      private static final String USERNAME = "root";
      private static final String PASSWORD = "Zombees6!";
      private static final String CONN_STRING =
              "jdbc:mysql://localhost:3306/Mysql";
    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM `person`");

            rs.last();
            System.out.println("Number of rows: " + rs.getRow());

//            System.out.println("Connected!");
        } catch (SQLException e) {
            System.err.println(e);
        }  finally {
            if (conn != null){
                conn.close();
            }

            if (conn != null) {
                conn.close();
            }
        }
    }
}
