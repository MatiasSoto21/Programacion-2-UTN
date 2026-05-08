package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("V6", "000001");
        Conductor conductor = new Conductor("Colapinto","B1");
        Vehiculo vehiculo = new Vehiculo("ABC123", "F1", motor, conductor);

        System.out.println(vehiculo);
    }
}
