import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion { // 1. Crea una clase principal llamada RegistroSimulacion.
    public static void main(String[] args) {
        try {

            // 2. Crear un objeto Path que apunte a un archivo y carpeta.
            Path rutaArchivo = Paths.get("src/config/parametros.txt");
            Path rutaCarpeta = Paths.get("src/config/");

            // 3. Crea un String con parámetros
            String parametros = "Tiempo de ciclo: 55.8 segundos\n" + "Velocidad de línea: 1.2 m/s\n" + "Número de estaciones: 8";

            // Si la carpeta config/ no existe, créala.
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectory(rutaCarpeta);
                System.out.println("📁 Carpeta 'config' creada.");
            }

            // 4. Utiliza Files.write() para guardar el contenido en el archivo.
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("✅ Archivo escrito exitosamente ✅");

            // 5. Usa Files.exists() para validar que el archivo fue creado correctamente.
            if (Files.exists(rutaArchivo)) {
                System.out.println("📄 El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                // 6. Lee el archivo con Files.readString() y muestra su contenido.
                String contenido = Files.readString(rutaArchivo);
                System.out.println("📄 Contenido leído:");
                System.out.println(contenido);
            } else {
                System.out.println("❌ El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}