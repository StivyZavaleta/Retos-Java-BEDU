public class DialogoTexto implements GestorDialogo {

    public void verDialogo(Narrativa dialogo) {
        System.out.println("Escena actual: " + dialogo.getEscenaActual());
        System.out.println("El enemigo esta debil...");
    }
}