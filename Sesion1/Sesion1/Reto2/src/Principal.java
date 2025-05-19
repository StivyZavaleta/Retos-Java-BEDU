public class Principal {
    public static void main(String[] args) {
        // Crear dos objeto de tipo Entrada utilizando el constructor
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Pantinaje sobre Hielo", 230.6);

        // Crear un objeto de tipo Entrada_Record usando el record
        Entrada_Record entrada_record = new Entrada_Record("Opera", 150.0);

        // Llamar al método para mostrar la información de la entrada
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Muestra el toString() generado automáticamente por el record.
        System.out.println(entrada_record);
    }
}