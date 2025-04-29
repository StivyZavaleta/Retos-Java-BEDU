public class Paciente {
    // Caracteristicas del paciente
    String nombre;
    int edad;
    String expediente;

    // Método que muestra datos del paciente
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}