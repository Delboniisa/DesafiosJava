import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao;
        String respostaUsuario;

        System.out.println("--- Sistema Bancário ---");

        ContaBancaria conta = ContaBancaria.criarConta(leitor);

        do {
            ContaBancaria.exibirMenu();
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para depositar: ");
                    double valorDeposito = leitor.nextDouble();

                    conta.deposito(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor para sacar: ");
                    double valorSaque = leitor.nextDouble();

                    conta.saque(valorSaque);
                    break;
                case 3:
                    double saldoAtual = conta.getSaldo();
                    System.out.println("Saldo atual da conta: R$" + saldoAtual);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja continuar (s/n)?");
            leitor.nextLine();
            respostaUsuario = leitor.nextLine();

        } while (respostaUsuario.equals("s"));

        leitor.close();
    }
}
