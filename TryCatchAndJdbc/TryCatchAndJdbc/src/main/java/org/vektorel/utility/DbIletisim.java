package org.vektorel.utility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbIletisim  {


    public Connection getConnection(){
        Connection conn=null;
        String url= "jdbc:postgresql://34.69.186.189:5432/deneme";
        String username= "postgres";
        String password= "Jjs2s_g432sa";
        try {
            Driver.class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection(url,username,password);
            return conn;
        }catch (ClassNotFoundException e){
            System.out.println("driver bulunurken hata aldık.");
            e.printStackTrace();
        }catch (SQLException sqlException){
            System.out.println("sql hatasi ");
            sqlException.printStackTrace();
        }
        return conn;

    }

    public boolean closeConnection(Connection connection){
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
