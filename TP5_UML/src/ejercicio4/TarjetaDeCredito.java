package ejercicio4;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, Cliente cliente, Banco banco, String fechaVencimiento) {
        this.numero = numero;
        this.cliente = cliente;
        this.banco = banco;
        this.fechaVencimiento = fechaVencimiento;

        cliente.setTarjeta(this);
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" +
                "numero='" + numero + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", banco=" + banco +
                ", cliente=" + cliente +
                '}';
    }
}
