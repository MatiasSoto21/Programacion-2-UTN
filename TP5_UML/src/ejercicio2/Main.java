package ejercicio2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static void main() {
        Usuario usuario = new Usuario("Matias", "12345");
        Bateria bateria = new Bateria("Samsung", 128);
        Celular celu = new Celular("1234567890123456","Samsung","A32", bateria, usuario);

        System.out.println(celu);
    }
}
