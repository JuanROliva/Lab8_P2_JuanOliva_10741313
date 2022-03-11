
import java.util.ArrayList;
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
        while (!ganoAlguien) {
            if (continuar) {
                for (Auto a : competidores) {
                    a.agregarDistancia();
                    if (distanciaMax<a.getDistanciaRecorrida()) {
                        distanciaMax = a.getDistanciaRecorrida();
                    }
                    if (a.getDistanciaRecorrida()>= pista.getLongitudPista()) {
                        JOptionPane.showMessageDialog(null, "Gano "+ a.getNombreCorredor());
                        ganoAlguien = true;
                        break;
                    }
                }
            }
        }
    }
}
