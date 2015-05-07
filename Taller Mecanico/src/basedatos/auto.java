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
public class auto {
  conectate con;
  
  public auto (){
    con = new conectate();
  } 
  
  /*Añade un nuevo registro*/
   public void NuevoAuto(String patente, String rut, String modelo){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT INTO " + 
                    "auto VALUES(?,?,?)");            
            pstm.setString(1, patente);
            pstm.setString(2, rut);
            pstm.setString(3, modelo);                        
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }

     public void UpdateAuto(String rut, String modelo, String patente){
       try {           
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE auto " +
            "SET rut = ? ," +
            "IdModelo = ? ," +                                    
            "WHERE patente = ? "); 
            
            pstm.setString(1, patente);                   
            pstm.setString(2, modelo);
            pstm.setString(3, patente);

            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
   
   public void DeleteAuto(String patente){  
            try {                
                PreparedStatement pstm = con.getConnection().prepareStatement("DELETE FROM auto WHERE patente = ?");            
                pstm.setString(1, patente);                   
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
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as Total FROM auto ");
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
            " patente, rut, IdModelo" +
            " FROM auto" +
            " ORDER BY patente ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estPatente = res.getString("patente");
            String estRut = res.getString("rut");
            String estIdModelo = res.getString("IdModelo");

            data[i][0] = estPatente;            
            data[i][1] = estRut;            
            data[i][2] = estIdModelo;            
                 
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}


