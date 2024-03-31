import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String respostaUsuario;

        List<Jogador> jogadores = new ArrayList<>();

        System.out.println("--- Cadastro de Jogadores ---");

        do {
            System.out.println("Nome do jogador:");
            String nome = leitor.nextLine();

            System.out.println("Pontuação: ");
            int pontuacao = leitor.nextInt();

            System.out.println("Nível: ");
            int nivel = leitor.nextInt();

            Jogador jogador = new Jogador(nome, pontuacao, nivel);
            jogadores.add(jogador);

            System.out.println("Deseja cadastrar outro jogador? (s/n) ");
            leitor.nextLine();
            respostaUsuario = leitor.nextLine();

        } while (respostaUsuario.equals("s"));

        System.out.println("\n--- Jogadores Cadastrados ---");

        for (int i = 0; i < jogadores.size()  ; i++) {
            
            Jogador jogador = jogadores.get(i);
            jogador.exibirInformacoes();
        }

        leitor.close();
    }
}
