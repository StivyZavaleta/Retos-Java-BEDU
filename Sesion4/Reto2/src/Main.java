public class Main
{
    public static void main(String[] args) {

        // Crea una declaracion de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700);
        // Crea una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500);

        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅¿RFC válido para esta cuenta?: " + rfcValido);
    }
}