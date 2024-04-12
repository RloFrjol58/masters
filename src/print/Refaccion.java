
package print;

import datos.ControlDatosRE;
import datos.BorrarUS;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import Conexion.conexion;
import datos.ControlDatosUS;
import java.awt.TextField;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Refaccion extends javax.swing.JInternalFrame {
    
   conexion con1 = new conexion();
   Connection conet;
   DefaultTableModel modeloRE;
   Statement st;
   ResultSet rs;
   int ID;

    public Refaccion() {
        initComponents();
        
        consultar();
    }

    void consultar(){
        String sql = "select * from refaccion";
        
        try{
            conet = con1.getConnection();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            Object[] refaccion = new Object[4];
            modeloRE = (DefaultTableModel) tabla1.getModel();
            
            while (rs.next()){
                refaccion [0] = rs.getInt("id");
                refaccion [1] = rs.getString("pieza");
                refaccion [2] = rs.getString("precio");
                refaccion [3] = rs.getString("cantidad");
                
                modeloRE.addRow(refaccion);
            }
            tabla1.setModel(modeloRE);
            
        }catch(Exception e){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtPieza = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pieza ");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Precio ");

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        btnGuardar.setBackground(new java.awt.Color(204, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(204, 255, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("MENU REFACCIONES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(txtPieza)
                                .addComponent(txtCantidad)
                                .addComponent(txtPrecio)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Pieza ", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tabla1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        LimpiarTabla();
        consultar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrar();
        LimpiarTabla();
        consultar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agre();
        consultar();
        LimpiarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    
    void borrar(){
        
        Boolean borrar = true;
        String mensaje = "";
        String ID = txtID.getText();
         
        if(ID.length()==0){
            borrar = false;
            mensaje += "Escriba el ID\n";
        }
         
        if (borrar) {
           BorrarUS control = new BorrarUS();
           control.borrar(ID);
        }else JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void LimpiarTabla(){
        while (modeloRE.getRowCount() > 0) {
            modeloRE.removeRow(0);
    }
    }
    
    void agre (){
        
        Boolean guardar = true;
        String mensaje = "";
        String pieza = txtPieza.getText();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
       
        //conditionals of data insert
        if(pieza.length()==0){
            guardar = false;
            mensaje += "Escriba el apellido\n";
        }
        if(cantidad.length()==0){
            guardar = false;
            mensaje += "Escriba el apellido\n";
        }
        if(precio.length()==0){
            guardar = false;
            mensaje += "Escriba el nombre\n";
        }
        
        if(guardar){
          ControlDatosRE control = new ControlDatosRE();
          control.insertar(pieza, cantidad, precio);
          txtID.setText("1");
          txtPieza.setText("");
          txtCantidad.setText("");
          txtPrecio.setText("");
          
        }else JOptionPane.showMessageDialog(null, mensaje);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPieza;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
