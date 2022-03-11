
import java.util.ArrayList;

public class main extends javax.swing.JFrame {
    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_comenzarCarrera = new javax.swing.JButton();
        bt_pausarCarrera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        tf_identidificador = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_comenzarCarrera.setText("Comenzar");
        getContentPane().add(bt_comenzarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 27, -1, -1));

        bt_pausarCarrera.setText("Pausar");
        getContentPane().add(bt_pausarCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 27, -1, -1));

        jLabel1.setText("Nombre Pista y Longitud");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 302, -1));

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
        getContentPane().add(bt_AgregarCorredorCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 349, -1, -1));

        bt_color.setText("Color");
        getContentPane().add(bt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 460, -1, -1));

        bt_guardarCorredor.setText("Guardar Corredor y Vehiculo");
        getContentPane().add(bt_guardarCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 494, 206, -1));

        jLabel3.setText("Numero identificador");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 392, 129, -1));
        getContentPane().add(tf_nombreCorredor, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 420, 200, -1));

        jLabel4.setText("Nombre Corredor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 423, 145, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 460, 128, -1));

        jLabel5.setText("Tipo de Auto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 463, 103, -1));

        jLabel6.setText("Nombre Pista");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 84, -1));

        jLabel7.setText("Longitud");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 84, -1));

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        getContentPane().add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 389, 126, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 126, -1));

        jButton6.setText("Restablecer Pista");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        jButton7.setText("Crear");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, -1, -1));
        getContentPane().add(tf_identidificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton bt_guardarCorredor;
    private javax.swing.JButton bt_pausarCarrera;
    private javax.swing.JComboBox<String> cb_corredoresDisponibles;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTable tablaCorredores;
    private javax.swing.JFormattedTextField tf_identidificador;
    private javax.swing.JTextField tf_nombreCorredor;
    // End of variables declaration//GEN-END:variables
    
    //Lista de variables
    Pista pista = new Pista();
    ArrayList<Auto> listaAutos = new ArrayList<>();
    ArrayList<Auto> competidores = new ArrayList<>();
    AdministradorAutos baseAutos = new AdministradorAutos("./BaseDatos/Autos.dbx");
    AdministradorPista basePista = new AdministradorPista("./BaseDatos/Pista.dbx");
    
    
    
    

}
