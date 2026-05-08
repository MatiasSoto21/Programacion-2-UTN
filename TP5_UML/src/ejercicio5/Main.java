package ejercicio5;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main(String[] args) {
        PlacaMadre placa = new PlacaMadre("ModeloX", "AMD");
        Propietario propietario = new Propietario("Matias", "42861714");
        Computadora compu = new Computadora("Samsung", "12345", placa, propietario);

        System.out.println(compu);
    }
}
