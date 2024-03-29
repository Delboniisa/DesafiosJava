import java.util.Scanner;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

   public static ContaBancaria criarConta(Scanner leitor) {
        System.out.println("Número da conta: ");
        int numeroConta = leitor.nextInt(); 

        leitor.nextLine(); 

        System.out.println("Nome do titular da conta: ");
        String nomeTitular = leitor.nextLine();

        return new ContaBancaria(numeroConta, nomeTitular);
    }

    public static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("Escolha uma opção: ");
    }

    public void deposito(double valorDeposito) {

        if (valorDeposito > 0) {
            saldo += valorDeposito;

            System.out.println("Depósito de R$" + valorDeposito + ", foi realizado com sucesso!.");
        } else {
            System.out.println("Depósito inválido!");
        }

    }

    public void saque(double valorSaque) {

        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;

            System.out.println("Saque de R$" + valorSaque + ", foi realizado com sucesso!");
        } else if ( valorSaque < saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Saque inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
