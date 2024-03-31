import java.util.Scanner;

public class Evento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String respostaAdicionarCarro;

        System.out.println("--- Registro de Carro ---");

        do {
            Carros carro = Carros.novoCarro(leitor);

            do {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Acelerar");
                System.out.println("2. Frear");
                System.out.println("3. Exibir Informações do Carro");
                System.out.println("4. Encerrar");

                int opcao = leitor.nextInt();
                leitor.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1:
                        carro.acelerar();
                        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
                        break;
                    case 2:
                        carro.frear();
                        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
                        break;
                    case 3:
                        carro.exibirInformacoes();
                        break;
                    case 4:
                        System.out.println("Encerrando o registro do carro.");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }

                if (opcao != 4) {
                    System.out.println("Deseja realizar outra operação? (s/n)");
                    respostaAdicionarCarro = leitor.nextLine();
                } else {
                    respostaAdicionarCarro = "n";
                }

            } while (respostaAdicionarCarro.equals("s"));

            System.out.println("Deseja adicionar outro carro? (s/n)");
            respostaAdicionarCarro = leitor.nextLine();

        } while (respostaAdicionarCarro.equals("s"));

        leitor.close();
    }
}
