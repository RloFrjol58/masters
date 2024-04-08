
package datos;

import Conexion.conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Borrar {
    
    private conexion conectar;
    private ModeloDatosUS modeloUS;
    private Connection con;
    
    public Borrar(){
        conectar = new conexion();
        modeloUS = new ModeloDatosUS();
    }
    
    //Funtion that executes the action of deleting a User record 
    public void borrar(String ID){
        PreparedStatement ps;
        String sql;
        modeloUS.setID(ID);
        
        
         try {
            	/*
            con = conectar.getConnection();
            // sql = "DELETE FROM profesor WHERE ID = ? ";
            sql = "UPDATE profesor SET status = ? WHERE ID = ? ";
            ps = con.prepareStatement(sql);
            
            // Parametros para realizar el delete
            ps.setString(1, 0);
            ps.setString(2, modelo.getID());
            
            */
            
            con = conectar.getConnection();
            // sql = "DELETE FROM profesor WHERE ID = ? ";
            sql = "UPDATE usuarios SET status = ? WHERE ID = ? ";
            ps = con.prepareStatement(sql);

            // Parámetros para realizar la actualización
            ps.setInt(1, 0); // Assuming status is an integer
            ps.setInt(2, Integer.parseInt(modeloUS.getID())); // Assuming getID() returns a String that can be parsed to an integer

           
            System.out.println("sql:: " + ps);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han Borrado los datos");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
