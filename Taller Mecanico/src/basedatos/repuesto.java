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
public class repuesto {
  conectate con;
  
  public repuesto (){
    con = new conectate();
  } 
  
  /*Añade un nuevo registro*/
   public void NuevoRepuesto(String descripcion){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("INSERT INTO " + 
                    "repuestos(Descripcion) " +
                    " VALUES(?)");            
            pstm.setString(1, descripcion);
 
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }

     public void UpdateRepuesto(String descripcion, int IdRepuesto){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE repuestos " +
            "SET descripcion = ?  " +                                      
            "WHERE IdRepuesto = ? ");           
            pstm.setString(1, descripcion);                   
            pstm.setString(2, String.valueOf(IdRepuesto));
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
   
   public void DeleteRepuesto(String idRepuesto){  
            try {                
                PreparedStatement pstm = con.getConnection().prepareStatement("delete from repuestos where IdRepuesto = ?");            
                pstm.setString(1, idRepuesto);                   
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
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT count(1) as total FROM repuestos ");
         ResultSet res = pstm.executeQuery();
         res.next();
         registros = res.getInt("Total");
         res.close();
      }catch(SQLException e){
         System.out.println(e);
      }
      
    Object[][] data = new String[registros][2];  
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " IdRepuesto, Descripcion " +
            " FROM repuestos" +
            " ORDER BY Descripcion ");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String estIdRepuesto = res.getString("IdRepuesto");
            String estDescripcion = res.getString("Descripcion");

            data[i][0] = estIdRepuesto;            
            data[i][1] = estDescripcion;            
                 
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
 }    
}
