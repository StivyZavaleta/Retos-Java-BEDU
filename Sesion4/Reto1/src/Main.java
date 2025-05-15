public class Main
{
    public static void main(String[] args) {

        Factura factura1 = new Factura("FAC001", "Juan Perez", 1450);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450);

        // Muestra ambas facturas
        System.out.println(factura1);
        System.out.println(factura2);

        // Comparación con equals()
        System.out.println("\n¿Las facturas son iguales?: " + factura1.equals(factura2));

        // Hash codes
        System.out.println("\nHash de factura 1: " + factura1.hashCode());
        System.out.println("Hash de factura 2: " + factura2.hashCode());
    }
}