import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el Nombre, Edad y Expediente del paciente: ");

        // Crear un nuevo objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Asignar valores a los atributos
        paciente1.nombre = scn.nextLine();
        paciente1.edad = scn.nextInt();
        paciente1.expediente = scn.next();

        // Llamar al método mostrarInformacion() del objeto
        paciente1.mostrarInformacion();
    }
}