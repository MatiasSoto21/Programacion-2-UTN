package ejercicio10;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Matias", "42861714");
        ClaveSeguridad clave = new ClaveSeguridad("12345asd", "789");
        CuentaBancaria cuenta = new CuentaBancaria(
                "0001235",
                2500.50,
                clave,
                titular
        );

        System.out.println(cuenta);
    }
}
