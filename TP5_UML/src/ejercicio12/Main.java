package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente persona = new Contribuyente("Mati", "12345");
        Impuesto impuesto = new Impuesto(21, persona);
        Calculadora calc = new Calculadora();

        calc.calcular(impuesto);
    }
}
