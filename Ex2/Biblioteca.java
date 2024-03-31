import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        String respostaUsuario;
        int size = 0;

        List<Livro> estante = new ArrayList<>();

        System.out.println("-- Bem Vindo(a) a Biblioteca! --");
        
        do {
            System.out.println("1. Adicionar livros:");
            System.out.println("2. Listar livros:");

            int opcao = leitor.nextInt();
            leitor.nextLine(); //Limpar o buffer

            switch(opcao) {
                case 1:
                    System.out.println("Deseja adicionar informações de quantos livros: ");
                    size = leitor.nextInt();

                    leitor.nextLine(); //Limpar buffer 

                    System.out.println("Insira as informações dos livros: ");

                    for(int i = 0; i < size; i++) {
                        System.out.println("Nome do Livro:");
                        String titulo = leitor.nextLine();
                
                        System.out.println("Nome do Autor: ");
                        String nome = leitor.nextLine();
                
                        System.out.println("Ano de publicação: ");
                        int ano = leitor.nextInt();
                        leitor.nextLine();
                        
                        Livro livro = new Livro(nome, titulo, ano);
                        estante.add(livro);
                    }
                    break;

                case 2:
                    for (Livro livro : estante) {
                        livro.ExibirInfo();
                    }
                    break;
            }

            System.out.println("Deseja continuar (s/n)?");
            respostaUsuario = leitor.nextLine();

        } while(respostaUsuario.equals("s"));
        
        leitor.close();
    }

    
}
