public class Entrada {
    // Atributos de la entrada
    String nombre;
    double precio;

    // Constructor que inicializa la entrada con nombre y precio
    public Entrada(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método que muestra la información de la entrada en consola
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre + " | Precio: $" + precio);
    }
}