package com.company;

import java.sql.*;

public class ResultSetDemo {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="system";
        String password="manager";
        Connection con= DriverManager.getConnection(url,username,password);
        if(con!=null)
            System.out.println("connection established");
        Statement s=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs= s.executeQuery("select * from employees");
        rs.absolute(4);
        System.out.println(rs.getInt(1) +" " +rs.getString(2)+" "+rs.getInt(3)+" " +rs.getString(4));
    }
}
