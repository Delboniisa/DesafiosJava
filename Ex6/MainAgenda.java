import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Excluir contato");
            System.out.println("3. Procurar contato");
            int opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    Agenda.adicionarContato(agenda, leitor);
                    break;
                case 2:
                    Agenda.excluirContato(agenda, leitor);
                    break;
                case 3:
                    Agenda.procurarContato(agenda, leitor);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
