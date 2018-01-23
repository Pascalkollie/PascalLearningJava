package com.company.Tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Students {

     public static void displayData (ResultSet rs) throws SQLException {

         while (rs.next()) {
             StringBuffer buffer = new StringBuffer();
             buffer.append("Student SSN  " + rs.getString("ssn") + ": ");
             buffer.append(rs.getString( "firstName") + " ");
             buffer.append(rs.getString("mi") + ", ");
             buffer.append(rs.getString("lastName") + ": ");
             buffer.append("Birthday " + rs.getString("birthDate") + ": ");
             buffer.append("Street address " + rs.getString("street") +  " "  + rs.getString("zipCode") + ": ");
             buffer.append(rs.getString( "deptId"));
             System.out.println(buffer.toString());
         }
     }
}
