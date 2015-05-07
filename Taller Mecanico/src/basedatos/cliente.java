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
public class cliente {
  conectate con;
  
  public cliente (){
    con = new conectate();
  } 
  
  /*Añade un nuevo registro*/
   public void NuevoCliente(String rut, String name, String app, String telefono){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("insert into " + 
                    "cliente(rut, app, nombre, telefono) " +
                    " values(?,?,?,?)");            
            pstm.setString(1, rut);
            pstm.setString(2, name);
            pstm.setString(3, app);                        
            pstm.setString(4, telefono);                        
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }

     public void UpdateCliente(String rut, String app, String name, String fono){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update cliente " +
            "set app = ? ," +
            "nombre = ? ," +
            "telefono = ? " +                                      
            "where rut = ? ");           
            pstm.setString(1, app);                   
            pstm.setString(2, name);
            pstm.setString(3, fono);
            pstm.setString(4, String.valueOf(rut));
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
   
   public void DeleteCliente(String rut){  
            try {                
                PreparedStatement pstm = con.getConnection().prepareStatement("delete from cliente where rut = ?");            
                pstm.setString(1, rut);                   
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
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as total FROM cliente ");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("Total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][4];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " rut, app, nombre, telefono " +
            " FROM cliente" +
            " ORDER BY nombre ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estRut = res.getString("rut");
            String estApellido = res.getString("app");
            String estNombre = res.getString("nombre");
            String estTelefono = res.getString("telefono");

            data[i][0] = estRut;            
            data[i][1] = estApellido;            
            data[i][2] = estNombre;            
            data[i][3] = estTelefono;                     
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}

