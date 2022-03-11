
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javax.swing.JTable;

public class HiloCarrera extends Thread{

    private ArrayList<Auto> competidos = new ArrayList<Auto>();
    private JProgressBar barra;
    private boolean continuar;
    private JTable tablaPosiciones;
    
    
    
    
    
    @Override
    public void run() {
        boolean ganoAlguien = false;
        int distanciaMax = 0;
        while (!ganoAlguien) {
            for (Auto competido : competidos) {
                
            }
            
        }
        
        
        
        
        
    }
    
    
}
