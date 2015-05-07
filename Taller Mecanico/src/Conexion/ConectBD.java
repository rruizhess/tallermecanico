/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class ConectBD {
    
  private String bd =   "taller";    //<-----nombre Base Datos
   private String login = "root";//<---- user base de datos
   private String password = "jidokwan";//<----pass bd
   private String url = "jdbc:mysql://localhost:3306/"+bd;// direccion bd 

  public ConectBD(String user, String pass){
    this.login=user;
    this.password=pass;
    
    }

   
   public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.gjt.mm.mysql.Driver");

           link = DriverManager.getConnection(this.url, this.login, this.password);
           

       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, "No Esta Logeado");
          

       }


       return link;

   }
   
   
}
