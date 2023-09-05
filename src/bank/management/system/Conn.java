package bank.management.system;

import java.sql.*;


public class Conn {
    Connection c;  
    public Statement s;
    public Conn(){
        try{
//           Class.forName(com.mysql.cj.jdbc.Driver);
           c = DriverManager.getConnection("jdbc:mysql:///bankManagementSystem", "root", "root"); 
           s = c.createStatement();
        }catch(Exception e){
            e.getMessage();
        }
    }
}
