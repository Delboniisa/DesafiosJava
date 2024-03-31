import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public List<Contato> buscarContatoPorNome(String nome) {

        List<Contato> resultados = new ArrayList<>();

        for (int i = 0; i < contatos.size(); i++) {

            Contato contato = contatos.get(i);

            if (contato.getNome().equalsIgnoreCase(nome)) {
                resultados.add(contato);
            }
        }
        return resultados;
    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
    }

    public static void adicionarContato(Agenda agenda, Scanner scanner) {

        System.out.println("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();

        Contato contato = new Contato(nome, telefone);
        agenda.adicionarContato(contato);

        System.out.println("Contato adicionado!");
    }

    public static void procurarContato(Agenda agenda, Scanner scanner) {

        System.out.println("Digite o nome do contato que deseja procurar: ");
        String nome = scanner.nextLine();
    
        List<Contato> resultados = agenda.buscarContatoPorNome(nome);
    
        if (resultados.isEmpty()) {
            System.out.println("Contato não encontrado!");
        } else {
            for (int i = 0; i < resultados.size(); i++) {

                Contato contato = resultados.get(i);

                System.out.println(contato.getNome() + " - " + contato.getTelefone());
            }
        }
    }

    public static void excluirContato(Agenda agenda, Scanner scanner) {

        System.out.println("Digite o nome do contato que deseja excluir: ");
        String nome = scanner.nextLine();

        List<Contato> resultados = agenda.buscarContatoPorNome(nome);

        if (resultados.isEmpty()) {
            System.out.println("Contato não encontrado!");
        } else {
            Contato contato = resultados.get(0);
            agenda.removerContato(contato);

            System.out.println("Contato excluído!");
        }
    }
}
