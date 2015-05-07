/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Roberto
 */
public class mecanicos {
  conectate con;
  
  public mecanicos (){
    con = new conectate();
  } 
  
  /*Añade un nuevo registro*/
   public void NuevoMecanicos(String app, String nombre, int idMecanicos){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT INTO " + 
                    "mecanicos(App, Nombre) " +
                    " VALUES(?,?)");            
            pstm.setString(1, app);
            pstm.setString(2, nombre);
                
           
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }

     public void UpdateMecanicos(String app, String nombre, int idMecanicos){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE mecanicos " +
            "SET app = ? ," +
            "nombre = ? " +
            "WHERE IdMecanico = ? ");           
            pstm.setString(1, app);                   
            pstm.setString(2, nombre);
            pstm.setString(3, String.valueOf(idMecanicos));
  
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
   
   public void DeleteMecanicos(int idMecanicos){  
            try {                
                PreparedStatement pstm = con.getConnection().prepareStatement("DELETE FROM mecanicos WHERE IdMecanico = ?");            
                pstm.setString(1, String.valueOf(idMecanicos));                   
                pstm.execute();
                pstm.close();            
            }catch(SQLException e){
            System.out.println(e);
            }            
   }


    
 /*obtenemos todos los datos de la tabla*/
 public Object [][] getDatos(){
      int registros = 0;
      //obtenemos la cantidad de registros existentes en la tabla
      try{         
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as total FROM mecanicos ");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("Total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][3];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " IdMecanico, app, nombre " +
            " FROM mecanicos" +
            " ORDER BY nombre ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estIdMecanico = res.getString("IdMecanico");
            String estApp = res.getString("app");
            String estNombre = res.getString("nombre");

            data[i][0] = estIdMecanico;            
            data[i][1] = estApp;            
            data[i][2] = estNombre;            
                       
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}

