/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sis2login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author FFFF44SSS
 */
public class Conectar {
    Connection conect= null;
    public Connection conexion()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error" + e);
        }
         return conect;   
    }
}
