package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

     private  static final String USERNAME = "root";
     private  static final String PASSWORD =  "";
     private  static final String H_CONN_STRING = "root";
     private  static final String M_CONN_STRING = "jdbc:mysql://localhost:3306/yearup";

     public static Connection getConnection (DBtype dBtype) throws SQLException {

         switch (dBtype) {
             case MYSQL:
                 return DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
             case HSQLDB:
                 return DriverManager.getConnection(H_CONN_STRING, USERNAME, PASSWORD);
             default:
                 return null;
         }
     }
      public static void processException (SQLException e) {
          System.err.println( "Error message " + e.getMessage());
          System.err.println("Error code: " + e.getErrorCode());
          System.err.println("SQL state: " + e.getSQLState());
      }
}
