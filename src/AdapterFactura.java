public class AdapterFactura implements ServicioFactura {

    private SistemaFacturacionAntiguo sistemaAntiguo;

    public AdapterFactura(SistemaFacturacionAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void emitirFactura(Cliente cliente, double monto) {

        String nombre = cliente.getNombre();
        String total = String.valueOf(monto);

        sistemaAntiguo.generarComprobante(nombre, total);

        System.out.println("Factura generada");
    }
}
