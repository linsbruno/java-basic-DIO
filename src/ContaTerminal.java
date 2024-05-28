import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar variáveis
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitar e ler os dados do usuário
        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine();  // Consumir a quebra de linha deixada pelo nextInt

        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        saldo = scanner.nextDouble();

        // Exibir mensagem com as informações inseridas
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n",
                nomeCliente, agencia, numeroConta, saldo);

        // Fechar o scanner
        scanner.close();
    }
}
