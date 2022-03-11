
import java.awt.Color;

public class AutoNascar extends Auto{
    
    public AutoNascar() {
        super();
    }

    public AutoNascar(int numeroIdentificador, int distanciaRecorrida, String nombreCorredor, Color colorAuto) {
        super(numeroIdentificador, distanciaRecorrida, nombreCorredor, colorAuto);
    }
    
    public AutoNascar(Auto a){
        super(a.getNumeroIdentificador(),a.getDistanciaRecorrida(),a.getNombreCorredor(),a.getColorAuto());
    }

    @Override
    public int agregarDistancia() {
        int nuevaDistancia = 30 + aleatorio.nextInt(160);
        setDistanciaRecorrida(nuevaDistancia + getDistanciaRecorrida());
        return getDistanciaRecorrida();
    }
}
