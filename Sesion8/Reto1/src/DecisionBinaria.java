import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {

    public String tomarDecision() {

        Scanner scn = new Scanner(System.in);

        System.out.println("¿Que quieres hacer?");
        System.out.println("A: Atacar");
        System.out.println("B: Perdonar");
        String input = scn.nextLine();

        return input.toUpperCase();
    }
}