
package datos;
import Conexion.conexion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ControlDatosRE {
       
    private conexion conectar;
    private ModeloDatosRE modeloRE;
    private Connection con;
    
    public ControlDatosRE(){
   conectar = new conexion();
   modeloRE = new ModeloDatosRE();
}
    public void insertar(String pieza,String cantidad, String precio){
  
        PreparedStatement ps;
        String sql;
        //modelo.setID(ID);
        modeloRE.setPieza(pieza);
        modeloRE.setCantidad(cantidad);
        modeloRE.setPrecio(precio);
        
        try {
            	
            con = conectar.getConnection();
            sql = "insert into refaccion(pieza, cantidad, precio) values(?,?,?)";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, modeloRE.getPieza());
            ps.setString(2, modeloRE.getCantidad());
            ps.setString(3, modeloRE.getPrecio());
        
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se han insertado los datos");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
      }
    }
