package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class StatementDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="system";
        String password="manager";
        Connection con=DriverManager.getConnection(url,username,password);
        if(con!=null)
            System.out.println("connection established");

        Statement st=con.createStatement();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the values");
        int id=s.nextInt();
        String name=s.next();
        int price=s.nextInt();
        int x=st.executeUpdate("insert into mobile values("+id+",'"+name+"',"+price+")");
        if (x!=0)


            System.out.println("Record inserted");




    }

}

