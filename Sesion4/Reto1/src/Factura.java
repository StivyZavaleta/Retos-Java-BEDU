import java.util.Objects;

public class Factura {
    String folio;
    String cliente;
    double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override // Muestra la informacion de la factura
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    @Override // compara si las facturas tienen el mismo folio
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otraFactura = (Factura) obj;
        return this.folio.equals(otraFactura.folio);
    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}