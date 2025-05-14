//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Metodos.mostrarBienvenida(); // Se realiza la llamada al método.

        Metodos.mostrarSuma(10, 20); // Se establecen dos argumentos.

        int suma = Metodos.obtenerSuma(5, 7);
        System.out.println("🧮 Resultado: " + suma);

        int x = 10;
        Metodos.duplicar(x);
        System.out.println("Fuera del método: " + x);  // x no cambia

        Persona persona = new Persona("Mario");
        Metodos.cambiarNombre(persona);
        System.out.println("Nombre actualizado: " + persona.nombre);

        Metodos.saludar();              // Hola
        Metodos.saludar("Mario");       // Hola, Mario

    }

}