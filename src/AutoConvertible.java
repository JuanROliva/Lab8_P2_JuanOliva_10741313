
import java.awt.Color;

public class AutoConvertible extends Auto{
    
    public AutoConvertible() {
        super();
    }

    public AutoConvertible(int numeroIdentificador, int distanciaRecorrida, String nombreCorredor, Color colorAuto) {
        super(numeroIdentificador, distanciaRecorrida, nombreCorredor, colorAuto);
    }
    
    public AutoConvertible(Auto a){
        super(a.getNumeroIdentificador(),a.getDistanciaRecorrida(),a.getNombreCorredor(),a.getColorAuto());
    }

    @Override
    public int agregarDistancia() {
        int nuevaDistancia = 20 + aleatorio.nextInt(180);
        setDistanciaRecorrida(nuevaDistancia + getDistanciaRecorrida());
        return getDistanciaRecorrida();
    }

    @Override
    public String toString() {
        return super.toString() + "Convertible";
    }
    
    
}
