package ejercicio5;

public class PlacaMadre {
    private String modelo;
    private String chipSet;

    public PlacaMadre(String modelo, String chipSet) {
        this.modelo = modelo;
        this.chipSet = chipSet;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "modelo='" + modelo + '\'' +
                ", chipSet='" + chipSet + '\'' +
                '}';
    }
}
