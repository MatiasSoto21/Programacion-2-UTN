package ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {


        Mesa mesa = new Mesa(1, 6);
        Cliente cliente1 = new Cliente("Matias", "123456");
        Reserva reserva1 = new Reserva(
                LocalDate.of(2026, 5, 20),
                LocalTime.of(22, 15),
                mesa,
                cliente1
        );

        System.out.println(reserva1);
    }
}
