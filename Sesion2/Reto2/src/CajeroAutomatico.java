import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner snc = new Scanner(System.in);

        double saldo = 1000;

        int option;
        do {
            System.out.println("\n\uD83D\uDCB8 -- Bienvenido al cajero automático -- \uD83D\uDCB8\n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            option = snc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("✅ Saldo actual $" + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese monto a depositar: ");
                    int monto = snc.nextInt();
                    saldo += monto;
                    System.out.println("\uD83D\uDCB0 Nuevo saldo: $" + saldo);
                    break;
                case 3:
                    System.out.println("Ingrese monto a retirar: ");
                    int retiro = snc.nextInt();
                    if(saldo >= retiro) {
                        saldo -= retiro;
                        System.out.println("\uD83D\uDCB0 Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println(" ⚠\uFE0F Saldo disponoble: $" + saldo);
                        System.out.println("❌ No cuenta con los fondos ❌");
                    }
                    break;
                case 4:
                    System.out.println("\nGracias por su preferencia \uD83D\uDC4B\n");
                    break;
                default:
                    System.out.println("❌ Error, seleccione una opcion valida");
                    break;
            }
        }
        while (option != 4);
    }
}