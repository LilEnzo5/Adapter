public class Pedido {

    private Cliente cliente;
    private double monto;
    private ServicioFactura servicioFactura;

    public Pedido(Cliente cliente, double monto, ServicioFactura servicioFactura) {
        this.cliente = cliente;
        this.monto = monto;
        this.servicioFactura = servicioFactura;
    }

    public void procesarPedido() {

        if (monto > 0) {
            servicioFactura.emitirFactura(cliente, monto);
        } else {
            System.out.println("Monto incorrecto");
        }
    }
}
