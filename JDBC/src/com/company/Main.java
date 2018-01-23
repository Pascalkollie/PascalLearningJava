package com.company;

import com.company.Tables.Course;
import com.company.Tables.Students;
import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException{
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DBUtil.getConnection(DBtype.MYSQL);
                Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT  * FROM student");
        ) {
            
         Students.displayData(rs);


        } catch (SQLException ex) {
            DBUtil.processException(ex);
        }
    }
}
