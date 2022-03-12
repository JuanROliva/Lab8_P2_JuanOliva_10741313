
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {
    public main() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        iniciarModeloTabla();
        //cargarDatos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_comenzarCarrera = new javax.swing.JButton();
        bt_pausarCarrera = new javax.swing.JButton();
        lb_pista = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCorredores = new javax.swing.JTable();
        cb_corredoresDisponibles = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        bt_AgregarCorredorCarrera = new javax.swing.JButton();
        bt_color = new javax.swing.JButton();
        bt_guardarCorredor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreCorredor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_tipoAuto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_logitudPista = new javax.swing.JFormattedTextField();
        tf_nombrePista = new javax.swing.JTextField();
        bt_restablecerPista = new javax.swing.JButton();
        bt_crearPista = new javax.swing.JButton();
        tf_identidificador = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_comenzarCarrera.setText("Comenzar");
        bt_comenzarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_comenzarCarreraActionPerformed(evt);
            }
        });
        getContentPane().add(bt_comenzarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, -1, -1));

        bt_pausarCarrera.setText("Pausar");
        bt_pausarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pausarCarreraActionPerformed(evt);
            }
        });
        getContentPane().add(bt_pausarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 27, -1, -1));

        lb_pista.setText("Nombre Pista y Longitud");
        getContentPane().add(lb_pista, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 302, -1));

        progressBar.setStringPainted(true);
        getContentPane().add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 67, 850, 55));

        tablaCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCorredores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tablaCorredores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 140, 850, 151));

        getContentPane().add(cb_corredoresDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 349, 266, -1));

        jLabel2.setText("Jugadores Listos para Competir");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 315, 178, -1));

        bt_AgregarCorredorCarrera.setText("Agregar");
        bt_AgregarCorredorCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarCorredorCarreraActionPerformed(evt);
            }
        });
        getContentPane().add(bt_AgregarCorredorCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 349, -1, -1));

        bt_color.setText("Color");
        bt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorActionPerformed(evt);
            }
        });
        getContentPane().add(bt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 460, -1, -1));

        bt_guardarCorredor.setText("Guardar Corredor y Vehiculo");
        bt_guardarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarCorredorActionPerformed(evt);
            }
        });
        getContentPane().add(bt_guardarCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 494, 206, -1));

        jLabel3.setText("Numero identificador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 392, 129, -1));
        getContentPane().add(tf_nombreCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 420, 200, -1));

        jLabel4.setText("Nombre Corredor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 423, 145, -1));

        cb_tipoAuto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));
        getContentPane().add(cb_tipoAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 460, 128, -1));

        jLabel5.setText("Tipo de Auto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 463, 103, -1));

        jLabel6.setText("Nombre Pista");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 84, -1));

        jLabel7.setText("Longitud");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 84, -1));

        tf_logitudPista.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        getContentPane().add(tf_logitudPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 389, 126, -1));
        getContentPane().add(tf_nombrePista, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 126, -1));

        bt_restablecerPista.setText("Restablecer Pista");
        bt_restablecerPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_restablecerPistaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_restablecerPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));

        bt_crearPista.setText("Crear");
        bt_crearPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearPistaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_crearPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        tf_identidificador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        getContentPane().add(tf_identidificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorActionPerformed
       bt_color.setBackground(JColorChooser.showDialog(this, "Seleccione un Color de Auto", Color.black));
    }//GEN-LAST:event_bt_colorActionPerformed

    private void bt_guardarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarCorredorActionPerformed
        int numeroIdentificador = Integer.valueOf(tf_identidificador.getText());
        String nombre = tf_nombreCorredor.getText();
        Color color = bt_color.getBackground();
        String tipoAuto = cb_tipoAuto.toString();
        if (validacionNumeroIdentificador(numeroIdentificador)) {
            if (tipoAuto.equals("McQueen")) {
                listaAutos.add(new AutoMcQueen(numeroIdentificador, 0, nombre, color));
            }else if(tipoAuto.equals("Convertible")){
                listaAutos.add(new AutoConvertible(numeroIdentificador, 0, nombre, color));
            }else{
                listaAutos.add(new AutoNascar(numeroIdentificador, 0, nombre, color));
            }
            agregarComboAuto(listaAutos.get(listaAutos.size()-1));
            JOptionPane.showMessageDialog(this, "Corredor Agregado con exito");
            tf_identidificador.setText("");
            tf_nombreCorredor.setText("");
            cb_corredoresDisponibles.setSelectedIndex(0);
            //escribirDatos();
        }else{
            JOptionPane.showMessageDialog(this, "El identificador ya esta registrado");
        }
    }//GEN-LAST:event_bt_guardarCorredorActionPerformed

    private void bt_crearPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearPistaActionPerformed
        String nombre = tf_nombrePista.getText();
        int longitud = Integer.valueOf(tf_logitudPista.getText());
        if (nombre.equals(" ")) {
            return;
        }
        pista.setNombrePista(nombre);
        pista.setLongitudPista(longitud);
        lb_pista.setText(pista.toString());
        //escribirDatos();
    }//GEN-LAST:event_bt_crearPistaActionPerformed

    private void bt_restablecerPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_restablecerPistaActionPerformed
        pista = new Pista();
        lb_pista.setText("Cree una nueva pista");
        //escribirDatos();
    }//GEN-LAST:event_bt_restablecerPistaActionPerformed

    private void bt_AgregarCorredorCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarCorredorCarreraActionPerformed
        if (cb_corredoresDisponibles.getSelectedIndex()!=-1) {
            agregarTablaCompetidores((Auto)cb_corredoresDisponibles.getSelectedItem());
            modeloComboCompetidores.removeElement(cb_corredoresDisponibles.getSelectedItem());
        }
    }//GEN-LAST:event_bt_AgregarCorredorCarreraActionPerformed

    private void bt_comenzarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_comenzarCarreraActionPerformed
        if (pista.getLongitudPista()<=0) {
            JOptionPane.showMessageDialog(this, "Agrege una pista");
            return;
        }
        
        if (modeloTableCompetidores.getRowCount()>1) {
            hiloCarrera = new HiloCarrera(progressBar, condicion, tablaCorredores, modeloTableCompetidores, pista);
            hiloCarrera.setCompetidores(competidores);
            Thread hilo = new Thread(hiloCarrera);
            hilo.start();
        }else{
            JOptionPane.showMessageDialog(this, "Deben haber al menos dos comperidores");
        }
    }//GEN-LAST:event_bt_comenzarCarreraActionPerformed

    private void bt_pausarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pausarCarreraActionPerformed
        hiloCarrera.setContinuar(!hiloCarrera.isContinuar());
    }//GEN-LAST:event_bt_pausarCarreraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AgregarCorredorCarrera;
    private javax.swing.JButton bt_color;
    private javax.swing.JButton bt_comenzarCarrera;
    private javax.swing.JButton bt_crearPista;
    private javax.swing.JButton bt_guardarCorredor;
    private javax.swing.JButton bt_pausarCarrera;
    private javax.swing.JButton bt_restablecerPista;
    private javax.swing.JComboBox<String> cb_corredoresDisponibles;
    private javax.swing.JComboBox<String> cb_tipoAuto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_pista;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTable tablaCorredores;
    private javax.swing.JFormattedTextField tf_identidificador;
    private javax.swing.JFormattedTextField tf_logitudPista;
    private javax.swing.JTextField tf_nombreCorredor;
    private javax.swing.JTextField tf_nombrePista;
    // End of variables declaration//GEN-END:variables
    
    //Lista de variables
    Pista pista = new Pista();
    ArrayList<Auto> listaAutos = new ArrayList<>();
    ArrayList<Auto> competidores = new ArrayList<>();
    AdministradorAutos baseAutos = new AdministradorAutos("./BaseDatos/Autos.dbx");
    AdministradorPista basePista = new AdministradorPista("./BaseDatos/Pista.dbx");
    DefaultComboBoxModel modeloComboCompetidores = new DefaultComboBoxModel();
    DefaultTableModel modeloTableCompetidores = new DefaultTableModel();
    HiloCarrera hiloCarrera = new HiloCarrera();
    
    boolean condicion = true;
    
    public void iniciarModeloTabla(){
        modeloTableCompetidores = (DefaultTableModel)tablaCorredores.getModel();
    }
    
    public void reiniciarModeloTabla(){
        modeloTableCompetidores.setRowCount(0);
        tablaCorredores.setModel(modeloTableCompetidores);
    }
    
    public boolean validacionNumeroIdentificador( int identificador){
        boolean condicion = true;
        for (Auto a : listaAutos) {
            if (a.getNumeroIdentificador() == identificador) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }
    
    public void agregarComboAuto(Auto a){
        modeloComboCompetidores.addElement(a);
        cb_corredoresDisponibles.setModel(modeloComboCompetidores);
    }
    
    public void agregarTablaCompetidores(Auto a){
        modeloTableCompetidores.addRow(a.aFilas());
        competidores.add(a);
        tablaCorredores.setModel(modeloTableCompetidores);
    }
    
    public void cargarDatos(){
        baseAutos.cargarArchivo();
        this.listaAutos = baseAutos.getListaAutos();
        pista = basePista.getPista();
        System.out.println(listaAutos);
    }
    
    public void escribirDatos(){
        baseAutos.setListaAutos(listaAutos);
        basePista.setPista(pista);
        baseAutos.escribirArchivo();
        basePista.escribirArchivo();
    }
}
