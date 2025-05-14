public class Principal {
    public static void main(String[] args) {

        // Esta Factura si tiene RFC
        Factura RFCfactura = new Factura(2500, "Servicio de consultaria", "ABCC010101XYZ");

        // Esta Factura no tiene RFC
        Factura NoRFCFactura = new Factura(1800, "Reparacion de equipo", null);

        // Mostrar Facturas
        System.out.println(RFCfactura.getResumen());
        System.out.println(NoRFCFactura.getResumen());

    }
}