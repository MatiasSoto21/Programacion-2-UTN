package ejercicio4;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Macro", "12345");
        Cliente mati = new Cliente("Matias", "123456789");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("1234555", mati, banco,"06/08/2035");

        System.out.println(tarjeta1);
    }
}
