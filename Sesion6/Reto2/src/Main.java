import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {

        // Lista concurrente: temario
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matematicas basicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Ordenar temas alfabeticamente
        Collections.sort(temas);
        System.out.println("📚 Temas ordenados alfabeticamente:");
        for (Tema tituloTema : temas) {
            System.out.println("- " + tituloTema);
        }

        // Ordenar temas por prioridad
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema tema1, Tema tema2) {
                return Integer.compare(tema1.prioridad, tema2.prioridad);
            }
        });

        System.out.println("\n📚 Temas ordenados por prioridad (1 = urgente, 2 = importante, 3 = opcional):");
        for (Tema tituloTema : temas) {
            System.out.println("- " + tituloTema);
        }

        // Mapa concurrente: repositorio de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");

        System.out.println("\n📚 Temas y direccion de recurso:");
        for (String tema : recursos.keySet()) {
            System.out.println("- Titulo: " + tema + " → " + recursos.get(tema));
        }
    }
}