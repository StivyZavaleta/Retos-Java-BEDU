public class MainNarrativa {
    public static void main(String[] args) {

        Narrativa textoDialogo = new Narrativa("Batalla Final");

        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        dialogo.verDialogo(textoDialogo);
        String accion = decision.tomarDecision();
        transicion.hacerTransicion(accion);
    }
}