import java.util.Optional;

public class Factura {
    // Se usa el private para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> RFC;

    // Constructor
    public Factura(double monto, String descripcion, String RFC) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.RFC = Optional.ofNullable(RFC); // Con Optional, el RFC puede ser null
    }

    // Metodo para devolver el resumen de la factura
    public String getResumen() {
        String resumen = "\n \uD83D\uDCC4 Factura generada:";
        resumen += "\nDescripcion: " + descripcion;
        resumen += "\nMonto: $" + monto;

        // Si el RFC esta presente, se muestra, si no, se muestra [No proporcionado]
        resumen += "\nRFC: " + RFC.orElse("[No proporcionado]");
        return resumen;
    }
}