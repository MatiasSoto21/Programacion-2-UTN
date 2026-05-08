package ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Profesional profesional = new Profesional("Doc Pepe", "Odontologia");
        Paciente paciente = new Paciente("Matias","OSEP");
        CitaMedica cita = new CitaMedica(
                LocalDate.of(2026,4,5),
                LocalTime.of(12,30),
                profesional,
                paciente
        );

        System.out.println(cita);
    }
}
