package ejercicio6;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(LocalDate fecha, LocalTime hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", mesa=" + mesa +
                ", cliente=" + cliente +
                '}';
    }
}
