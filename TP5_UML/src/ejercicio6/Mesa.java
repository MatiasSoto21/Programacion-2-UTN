package ejercicio6;

public class Mesa {
    private int mesa;
    private int capacidad;

    public Mesa(int mesa, int capacidad) {
        this.mesa = mesa;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "mesa=" + mesa +
                ", capacidad=" + capacidad +
                '}';
    }
}
