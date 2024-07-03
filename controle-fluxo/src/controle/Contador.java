package controle;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        System.out.println("Digite dois valores para descobrir o número de interações entre eles.");
        System.out.println("Primeiro valor: ");
        Scanner scanner = new Scanner(System.in);
        int paramentro1 = lerInteiro(scanner);

        System.out.println("Segundo valor: ");
        int paramentro2 = lerInteiro(scanner);

        try {
            contar(paramentro1, paramentro2);
        } catch (InvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws InvalidoException {

        if (parametroUm >= parametroDois) {
        } else {
            int diferenca = parametroDois - parametroUm;
            for (int i = 1; i <= diferenca; ++i) {
                System.out.println("Imprimindo a " + i + "ª interação: " + i);
            }
        }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro:");
            }
        }
    }

}