package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreapredStatement2 {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="system";
        String password="manager";
        Connection con= DriverManager.getConnection(url,username,password);
        if(con!=null)
            System.out.println("connection established");
    PreparedStatement ps=con.prepareStatement("insert into employees values(?,?,?,?)");
        PreparedStatement pt=con.prepareStatement("insert into employees values(?,?,?,?)");
    ps.setInt(1,101);
    ps.setString(2,"pranitha");
    ps.setInt(3,939006124);
    ps.setString(4,"Dilsuknagar");
    pt.setInt(1,102);
    pt.setString(2,"rishitha");
    pt.setInt(3,812580);
    pt.setString(4,"uppal");
    int x= ps.executeUpdate();
    int y=pt.executeUpdate();
    if(x !=0)
        System.out.println("record inserted");
    else
        System.out.println("y inserted");


    }
}
