package com.company.Tables;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {


    public static void displayCourseData (ResultSet rs) throws SQLException {

        while (rs.next()) {
            StringBuffer buffer = new StringBuffer();
            buffer.append("Course id  " + rs.getString("courseid") + ": ");
            System.out.println(buffer.toString());
        }
    }
}
