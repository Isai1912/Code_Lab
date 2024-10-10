package org.acatlan.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection cn= null;
        var dataBase = "mac_students";
        var url= "jdbc:mysql://localhost:3306/" + dataBase;
        var user= "root";
        var password= "admin";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn= DriverManager.getConnection(url, user, password);

        }catch(ClassNotFoundException | SQLException ex){
            cn= null;
        }finally{
            return cn;
        }
    }

    public static void main(String args[]){
        Connection cn= Conexion.getConnection();
        if ((cn != null)) {
            System.out.println("Conexion exitosa.");
        } else {
            System.err.println("Conexion fallida.");
        }
    }
}
