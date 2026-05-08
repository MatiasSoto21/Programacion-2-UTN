package ejercicio8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Matias", "mati@mail.com");
        FirmaDigital firma = new FirmaDigital(
                "123456asdasd",
                LocalDate.of(2026, 3, 15)
        );

        Documento doc = new Documento(
                "Documento1",
                "Muchas cosas",
                firma,
                usuario
        );

        System.out.println(doc);
    }
}
