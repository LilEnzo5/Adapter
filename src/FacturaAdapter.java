public class FacturaAdapter implements FacturaService {

    private LegacyBillingSystem sistemaAntiguo;

    public FacturaAdapter(LegacyBillingSystem sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void emitirFactura(Cliente cliente, double monto) {

        String nombre = cliente.getNombre();
        String total = String.valueOf(monto);

        sistemaAntiguo.crearFacturaAntigua(nombre, total);

        System.out.println("Factura generada correctamente");
    }
}