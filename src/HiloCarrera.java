
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class HiloCarrera implements Runnable{

    private ArrayList<Auto> competidores = new ArrayList<Auto>();
    private JProgressBar barra;
    private boolean continuar;
    private JTable tablaPosiciones;
    private DefaultTableModel modeloTabla;
    private Pista pista;
    private ArrayList<Integer> distanciaOrdenada = new ArrayList<>();

    public HiloCarrera() {
    }
    
    public HiloCarrera(JProgressBar barra, boolean continuar, JTable tablaPosiciones, DefaultTableModel modeloTabla, Pista pista) {
        this.barra = barra;
        this.continuar = continuar;
        this.tablaPosiciones = tablaPosiciones;
        this.modeloTabla = modeloTabla;
        this.pista = pista;
    }

    public ArrayList<Auto> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(ArrayList<Auto> competidores) {
        this.competidores = competidores;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }

    public JTable getTablaPosiciones() {
        return tablaPosiciones;
    }

    public void setTablaPosiciones(JTable tablaPosiciones) {
        this.tablaPosiciones = tablaPosiciones;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    @Override
    public void run() {
        boolean ganoAlguien = false;
        int distanciaMax = 0;
        barra.setMaximum(pista.getLongitudPista());
        System.out.println("llego aqui");
        while (!ganoAlguien) {
            if (continuar) {
                for (Auto a : competidores) {
                    System.out.println("llego aqui 2");
                    a.agregarDistancia();
                    if (distanciaMax<a.getDistanciaRecorrida()) {
                        distanciaMax = a.getDistanciaRecorrida();
                        barra.setBackground(a.getColorAuto());
                        barra.setValue(distanciaMax);
                        //ordenarPosiciones();
                        actulizarModeloyTabla();
                    }
                    if (a.getDistanciaRecorrida()>= pista.getLongitudPista()) {
                        JOptionPane.showMessageDialog(null, "Gano "+ a.getNombreCorredor());
                        ganoAlguien = true;
                        break;
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error en pausa");;
            }
        }
        System.out.println("Murio el hilo");
    }
    
    public void actulizarModeloyTabla(){
        modeloTabla.setRowCount(0);
        for (Auto competidore : competidores) {
            modeloTabla.addRow(competidore.aFilas());
        }
        tablaPosiciones.setModel(modeloTabla);
    }
    
    public void ordenarPosiciones(){
        for (Auto competidore : competidores) {
            distanciaOrdenada.add(competidore.getDistanciaRecorrida());
        }
        
        Collections.sort(distanciaOrdenada);
        modeloTabla.setRowCount(0);
        
        for (int i = distanciaOrdenada.size()-1; i >= 0; i--) {
            for (int j = 0; j < this.competidores.size(); j++) {
                if (distanciaOrdenada.get(i) == competidores.get(j).getDistanciaRecorrida()) {
                    modeloTabla.addRow(competidores.get(j).aFilas());
                    break;
                }
            }
        }
        tablaPosiciones.setModel(modeloTabla);
        
    }
    
}
