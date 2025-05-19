import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        
        // Ruta del archivo de log
        Path rutaLog = Paths.get("src/errores.log"); 
        // Ruta del archivo registros de fallos.
        Path rutaError = Paths.get("src/registro_fallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        // Lee el archivo línea por línea y cuenta cuántas veces aparece ERROR y WARNING
        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            System.out.println("📊 -- RESUMEN DEL ANALISIS -- 📊");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Total de errores (ERROR): " + conteoErrores);
            System.out.println("Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + e.getMessage());

            // Si el archivo no existe o hay algún problema, captura la excepción con try-catch y guarda el mensaje de error en un archivo registro_fallos.txt
            try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                escritor.write("Error al leer el archivo 'errores.log': " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("No se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}