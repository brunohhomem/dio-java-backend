import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        while (true) {
        	
        	System.out.println("Escolha uma operação bancária: ");
        	
        	System.out.println("1 - Depositar\r\n"
        			+ "2 - Sacar\r\n"
        			+ "3 - Consultar Saldo\r\n"
        			+ "0 - Encerrar");
        	
            int opcao = scanner.nextInt();
            switch(opcao){
                case 1:
                    double saldoAtual = scanner.nextDouble();
                    saldo+=saldoAtual;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valorSacado = scanner.nextDouble();
                    if(valorSacado >saldo){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo-=valorSacado;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}