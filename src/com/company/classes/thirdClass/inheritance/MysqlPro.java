package com.company.classes.thirdClass.inheritance;
import java.sql.*;

public class MysqlPro {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

// TODO code application logic here

            System.out.println("Welcome to Java - Oracle ");
            String url="jdbc:oracle:thin:@localhost:1521:XE";



            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con=DriverManager.getConnection(url,"kush1","kush1");
                System.out.println("Connection Established...!");
                Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery("select * from employee");
                while(rs.next())
                    System.out.println(rs.getInt(1)+" "+rs.getString(2));
                con.close();
    }
            catch(ClassNotFoundException e){ System.out.println("Driver Not Found"+e);}
            catch(SQLException e){ System.out.println("Connection Not Found"+e);}
            catch(Exception e){ System.out.println(e);}
        }
}
