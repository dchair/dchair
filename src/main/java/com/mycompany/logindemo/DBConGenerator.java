/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logindemo;

import java.sql.*;

/**
 *
 * @author student
 */
public class DBConGenerator {

    String username="chair";
    String passwd="12345";
    String cstring = "jdbc:mariadb://127.0.0.1/webdb";
    
    public DBConGenerator() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");            
        }catch(Exception e ) {            
        }
    }
    
    public Connection getConnction() {
        Connection con;
        try{
            con = DriverManager.getConnection(cstring,username,passwd);
            return con;
        } catch( Exception e) {
            return null;
        }        
    }
    
}
