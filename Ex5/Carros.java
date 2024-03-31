import java.util.Scanner;

public class Carros {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carros(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar() {
        velocidadeAtual += 10; 
    }

    public void frear() {
        if (velocidadeAtual >= 10) {
            velocidadeAtual -= 10; 
        } else {
            System.out.println("O carro está parado, não é possível frear!");
        }
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void exibirInformacoes() {
        System.out.println("-------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("-------------------------");
    }

    public static Carros novoCarro(Scanner leitor) {
        System.out.println("\n-- Novo Carro --");

        System.out.println("Digite a marca do carro:");
        String marca = leitor.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = leitor.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer

        System.out.println("Digite a placa do carro:");
        String placa = leitor.nextLine();

        return new Carros(marca, modelo, ano, placa);
    }
}
