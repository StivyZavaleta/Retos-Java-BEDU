import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("\uD83D\uDC8A -- FARMACIA NOMILARES -- \uD83D\uDC8A");
        System.out.println("Nombre del medicamento: ");
        var name = scn.nextLine(); // nombre del medicamento
        System.out.println("Precio unitario: ");
        double price = scn.nextDouble(); // precio del medicamento
        System.out.println("Cantidad de piezas: ");
        int unit = scn.nextInt(); // cantidad de medicamento

        double total = price * unit; // calcular el total sin descuento
        boolean aplicaDescuento = total > 500; // si el total es mayor a 500 pesos se ofrece un 15% de descuento
        double descuento = aplicaDescuento ? total * 0.15 : 0; // operador ternario aplicando descuento
        double totalFinal = total - descuento; // total con o sin descuento

        // resultados en consola
        System.out.println("Medicamento: " + name);
        System.out.println("Cantidad: " + unit);
        System.out.println("Precio unitario: $" + price);
        System.out.println("Total sin descuento: $" + total);
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);
    }
}