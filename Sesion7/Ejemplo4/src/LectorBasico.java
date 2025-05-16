import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectorBasico {
    public static void main(String[] args) {
        Path ruta = Paths.get("C:/java/Sesion7/Ejemplo4/src/datos.txt");

        try {
            String contenido = Files.readString(ruta);
            System.out.println("📄 Contenido del archivo:");
            System.out.println(contenido);
            System.out.println("Ruta absoluta esperada: " + ruta.toAbsolutePath());
        } catch (IOException e) {
            System.out.println("❌ No se pudo leer el archivo: " + e.getMessage());
        }
    }
}