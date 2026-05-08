package ejercicio8;

import java.time.LocalDate;

public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;

    public FirmaDigital(String codigoHash, LocalDate fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" +
                "codigoHash='" + codigoHash + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
