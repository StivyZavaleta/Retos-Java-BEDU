import java.util.Objects;

public class CuentaFiscal {
    private final String rfc; // No modificable
    private double saldoDisponible;

    // Constructor
    public CuentaFiscal(String rfc, double saldoDisponible) {
        this.rfc = rfc;
        if(saldoDisponible >= 0) { // Validaacion para que el saldo no sea negativo
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("❌No puede ser saldo negativo❌");
            this.saldoDisponible = 0;
        }
    }

    // Getters para ambos atributos
    public String getRFC() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // metodo para comprar el RFC de la cuenta con el de la declaracion
    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta() {
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}