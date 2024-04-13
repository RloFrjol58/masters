
package datos;

import Conexion.conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControlDatosSE {
    
    private conexion conectar;
    private ModeloDatosSE modeloSE;
    private Connection con;
    
    public ControlDatosSE(){
   conectar = new conexion();
   modeloSE = new ModeloDatosSE();
}
    public void insertar(String servicio, String precio){
  
        PreparedStatement ps;
        String sql;
        //modelo.setID(ID);
        modeloSE.setServicio(servicio);
        modeloSE.setPrecio(precio);
        
        try {
            	
            con = conectar.getConnection();
            sql = "insert into servicio(servicio, precio) values(?,?)";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modeloSE.getServicio());
            ps.setString(2, modeloSE.getPrecio());
        
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
      }
    
}
