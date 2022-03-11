
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministradorPista {
    
    private Pista pista;
    private File archivo = null;

    public AdministradorPista(String path) {
        this.archivo = new File(path);
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo(){
        try {
            if (!archivo.exists()) {
                return;
            }
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            pista = (Pista) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error en lectura pista");
        }
    }
    
    public void escribirArchivo(){
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pista);
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error en escritura pista");
        }
    }
}
