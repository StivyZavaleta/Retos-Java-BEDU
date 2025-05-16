import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Set<Integer> consumosCPU = new HashSet<>();

        try {
            // Solicita al usuario ingresar el consumo de CPU de varios servidores (valores en porcentaje).
            System.out.println("Ingresar el consumo de CPU de varios servidores (Escribe -1 para terminar).");

            while (true) {
                System.out.print("\nCPU %: ");
                int consumos = scn.nextInt(); // El valor debe ser numérico.

                if(consumos == -1) {
                    break;
                }

                // No se deben permitir registros duplicados (usa HashSet).
                if (!consumosCPU.add(consumos)) {
                    System.out.println("⚠️ Valor duplicado: " + consumos + "% ⚠️");
                    continue;
                }

                // No se permiten valores negativos ni mayores a 100%.
                if (consumos < 0 || consumos > 100) {
                    System.out.println("❌  Solo se permiten valores entre 0 y 100 ❌");
                    continue;
                }

                // Si el valor ingresado es mayor a 95%, lanza una excepción personalizada llamada ConsumoCriticoException.
                if (consumos > 95) {
                    throw new ConsumoCriticoException("🚨  ALERTA DE CONSUMO DE CPU ALTO: " + consumos + "% 🚨");

                }

                System.out.println("✅  Consumo de CPU registrado: " + consumos + "% ✅");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌  Error: Debes ingresar un numero entero valido ❌");
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
        } finally {
            scn.close();
            System.out.println("\nRecursos liberados correctamente.");
        }
    }
}