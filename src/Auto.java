
import java.awt.Color;
import java.util.Random;

public abstract class Auto {
    private int numeroIdentificador;
    private int distanciaRecorrida;
    private String nombreCorredor;
    private Color colorAuto;
    protected Random aleatorio = new Random();

    public Auto() {
    }

    public Auto(int numeroIdentificador, int distanciaRecorrida, String nombreCorredor, Color colorAuto) {
        this.numeroIdentificador = numeroIdentificador;
        this.distanciaRecorrida = distanciaRecorrida;
        this.nombreCorredor = nombreCorredor;
        this.colorAuto = colorAuto;
    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public Color getColorAuto() {
        return colorAuto;
    }

    public void setColorAuto(Color colorAuto) {
        this.colorAuto = colorAuto;
    }

    @Override
    public String toString() {
        return numeroIdentificador + " " + nombreCorredor + " - ";
    }
    
    public abstract int agregarDistancia();
    
    public void setDistanciaCero(){
        this.distanciaRecorrida = 0;
    }
    
    public Object[] aFilas(){
        Object[] fila = {numeroIdentificador,nombreCorredor,distanciaRecorrida};
        return fila;
    }
}
