
import java.awt.Color;

public class AutoMcQueen extends Auto{ 

    public AutoMcQueen() {
        super();
    }

    public AutoMcQueen(int numeroIdentificador, int distanciaRecorrida, String nombreCorredor, Color colorAuto) {
        super(numeroIdentificador, distanciaRecorrida, nombreCorredor, colorAuto);
    }
    
    public AutoMcQueen(Auto a){
        super(a.getNumeroIdentificador(),a.getDistanciaRecorrida(),a.getNombreCorredor(),a.getColorAuto());
    }

    @Override
    public int agregarDistancia() {
        int nuevaDistancia = 30 + aleatorio.nextInt(160);
        setDistanciaRecorrida(nuevaDistancia + getDistanciaRecorrida());
        return getDistanciaRecorrida();
    }
}
