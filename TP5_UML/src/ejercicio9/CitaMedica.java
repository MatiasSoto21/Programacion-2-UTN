package ejercicio9;

import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Profesional profesional;
    private Paciente paciente;

    public CitaMedica(LocalDate fecha, LocalTime hora, Profesional profesional, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.profesional = profesional;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "CitaMedica{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", profesional=" + profesional +
                ", paciente=" + paciente +
                '}';
    }
}
