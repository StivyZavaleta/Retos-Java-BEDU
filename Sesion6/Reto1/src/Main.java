import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 📝 Paso 1: ArrayList para registrar todas las especies en orden (puede haber repetidos)
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens"); // Repetido

        System.out.println("Muestras de especies (ordenados, con duplicados):");
        for (int i = 0; i < muestras.size(); i++) {
            System.out.println(i + 1 + ". " + muestras.get(i));
        }

        // ✅ Paso 2: HashSet para filtrar especies únicas
        HashSet<String> tiposEspecie = new HashSet<>(muestras); // Elimina duplicados

        System.out.println("\n✅ Tipos únicos de especies encontrados:");
        for (String especie : tiposEspecie) {
            System.out.println("- " + especie);
        }

        // 🗃️ Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-01", "Dra. Zavaleta");
        idInvestigador.put("M-02", "Dr. Torres");
        idInvestigador.put("M-03", "Dra. Cruz");

        System.out.println("\n📇 ID Investigador (muestra → investigador):");
        for (Map.Entry<String, String> entry : idInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // 🔍 Paso 4: Mostrar resultados
        String idBuscar = "M-01";
        System.out.println("\n🔍 Investigador asignado a la muestra " + idBuscar + ": " + idInvestigador.get(idBuscar));
    }
}