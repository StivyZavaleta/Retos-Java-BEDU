public class EjemploVariables {
    public static void main(String[] args) {
        int edad = 28;
        double salario = 15499.50;
        boolean activo = true;
        char inicial = 'M';
        var ciudad = "Guadalajara";

        // Imprimir los valores almacenados en las variables
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
        System.out.println("Activo: " + activo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ciudad: " + ciudad);

        // Conversiónes
        double precio = 199.99;
        int precioRedondeado = (int) precio;
        System.out.println("Precio original: " + precio);
        System.out.println("Precio redondeado: " + precioRedondeado);
    }
}

/* Desde Java 10, se puede usar var para que el compilador infiera el tipo de dato automáticamente:
   var mensaje = "Hola, mundo";
   var numero = 10;
   var activo = true;

   📌 El tipo se infiere en tiempo de compilación y no puede cambiarse. Aunque var hace el código más limpio,
   el tipo real sigue existiendo y debe ser claro para evitar confusiones. No se recomienda usar var cuando
   el tipo no sea evidente, con null o sin inicializar.

    A veces es necesario convertir un tipo de dato a otro. Esto puede hacerse de manera implícita o explícita:
    int numero = 10;
    resultado = numero; // conversión implícita

    dodoubleuble precio = 19.99;
    int precioEntero = (int) precio; // conversión explícita (casting)

    ⚠️ Al hacer casting, podrías perder precisión (por ejemplo, perder decimales).
*/