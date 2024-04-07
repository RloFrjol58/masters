
package datos;

import Conexion.conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControlDatosUS {
    
    //variables de conexion 
    private conexion conectar;
    private ModeloDatosUS modeloUS;
    private Connection con;
    
    public ControlDatosUS(){
    conectar = new conexion();
    modeloUS = new ModeloDatosUS();
    }
    
     public void insertar(String ApellidoP, String ApellidoM, String Nombre,
                          String Email, String nombreUsuario ){
  
        PreparedStatement ps;
        String sql;
        // modelo.setID(ID);
        modeloUS.setApellidoP(ApellidoP);
        modeloUS.setApellidoM(ApellidoM);
        modeloUS.setNombre(Nombre);
        modeloUS.setEmail(Email);
        modeloUS.setNombreUsuario(nombreUsuario);
        
        try {
            	
            con = conectar.getConnection();
            sql = "insert into usuarios(ApellidoP, ApellidoM, Nombre, Email, nombreUsuario) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            
            // ps.setString(1, modelo.getID());
            ps.setString(1, modeloUS.getApellidoP());
            ps.setString(2, modeloUS.getApellidoM());
            ps.setString(3, modeloUS.getNombre());
            ps.setString(4, modeloUS.getEmail());
            ps.setString(5, modeloUS.getNombreUsuario());
            
            System.out.println("ps:: " + ps);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
