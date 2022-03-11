public class Pista {
    private String nombrePista;
    private int longitudPista;

    public Pista() {
    }
    
    public Pista(String nombrePista, int longitudPista) {
        this.nombrePista = nombrePista;
        this.longitudPista = longitudPista;
    }

    public String getNombrePista() {
        return nombrePista;
    }

    public void setNombrePista(String nombrePista) {
        this.nombrePista = nombrePista;
    }

    public int getLongitudPista() {
        return longitudPista;
    }

    public void setLongitudPista(int longitudPista) {
        this.longitudPista = longitudPista;
    }

    @Override
    public String toString() {
        return "Pista: " + nombrePista + "       Longitud: " + longitudPista;
    }
    
    
}
