package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public Connection conn = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;

    public DAO(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=TourDB";
            conn=DriverManager.getConnection(url,"sa","admin");
            System.out.println("Connected");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
