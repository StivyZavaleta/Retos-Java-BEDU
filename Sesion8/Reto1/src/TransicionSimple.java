public class TransicionSimple implements TransicionHistoria {

    public void hacerTransicion(String transicion) {
        if (transicion.equalsIgnoreCase("A")) {
            System.out.println("➡️ Atacas al enemigo terminando con su vida...");
        } else {
            System.out.println("➡️ Perdonas al enemigo y ayudas a salvarlo...");
        }
    }
}