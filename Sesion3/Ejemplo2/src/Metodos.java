public class Metodos {

    public static void mostrarBienvenida() {
        System.out.println("👋 Bienvenido al sistema");
    }

    public static void mostrarSuma(int a, int b) {
        int resultado = a + b;
        System.out.println("➕ La suma es: " + resultado);
    }

    public static int obtenerSuma(int a, int b) {
        return a + b;
    }

    public static void duplicar(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método: " + numero);
    }

    public static void cambiarNombre(Persona p) {
        p.nombre = "Nuevo nombre";
    }

    public static void saludar() {
        System.out.println("👋 Hola");
    }

    public static void saludar(String nombre) {
        System.out.println("👋 Hola, " + nombre);
    }

}
