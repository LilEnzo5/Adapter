public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan");

        LegacyBillingSystem sistema = new LegacyBillingSystem();

        FacturaService servicio = new FacturaAdapter(sistema);

        Pedido pedido = new Pedido(cliente, 150.0, servicio);

        pedido.procesarPedido();
    }
}
