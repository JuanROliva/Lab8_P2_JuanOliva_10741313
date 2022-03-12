
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdministradorAutos {
    
    private ArrayList<Auto> listaAutos = new ArrayList<Auto>();
    private File archivo = null;

    public AdministradorAutos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Auto> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(ArrayList<Auto> listaAutos) {
        this.listaAutos = listaAutos;
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
            Auto auto;
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while ((auto = (Auto)ois.readObject())!= null) {
                System.out.println("aqui");
                listaAutos.add(auto);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println("Error en lectura auto");
        }
    }
    
    public void escribirArchivo(){
        try {
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Auto a : listaAutos) {
                oos.writeObject(a);
            }
            oos.flush();
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error en escritura auto");
        }
    }
    
    
}
