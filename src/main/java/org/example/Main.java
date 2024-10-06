import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 2500.0;
        double soma;
        double subtracao;

        do {
            System.out.println("***********************");
            System.out.println("Dados iniciais do cliente:");
            System.out.println("");
            System.out.println("Nome: Pedro Batista");
            System.out.println("Tipo de Conta: Corrente");
            System.out.printf("Saldo inicial: %.2f%n", saldo);
            System.out.println("***********************");
            System.out.println("");
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.println("Escolha uma opção:");

            opcao = leitor.nextInt(); // Leitura da opção do usuário

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: %.2f%n", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado:");
                    soma = leitor.nextDouble();
                    saldo += soma;
                    System.out.printf("Novo saldo após depósito: %.2f%n", saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor a ser transferido:");
                    subtracao = leitor.nextDouble();
                    if (subtracao > saldo) {
                        System.out.println("Saldo insuficiente para transferência.");
                    } else {
                        saldo -= subtracao;
                        System.out.printf("Novo saldo após transferência: %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, por favor escolha novamente.");
            }
        } while (opcao != 4);

        leitor.close(); // Fechando o scanner
    }
}
