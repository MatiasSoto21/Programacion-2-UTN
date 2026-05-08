package ejercicio13;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Usuario matias = new Usuario("Mati", "matias@email.com");
        GeneradorQR generador = new GeneradorQR();
        CodigoQR codigo = new CodigoQR("CodigoPrimero11", matias);

        System.out.println("Primer Codigo ");
        System.out.println(codigo);
        System.out.println("Segundo Codigo");

        generador.generar("CodigoSegundo22", matias);
    }
}
