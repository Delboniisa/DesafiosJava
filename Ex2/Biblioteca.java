import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        List <Livro> estante = new ArrayList<>();
        int size = 0;

        System.out.println("-- Bem Vindo(a) a Biblioteca! --");
        System.out.println("1. Adicionar livros:");
        System.out.println("2. Listar livros:");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Deseja adicionar informações de quantos livros: ");
                size = leitor.nextInt();

                System.out.println("Insira as informações dos livros: ");

                for(int i=0; i<size; i++){

                    leitor.nextLine();
                    System.out.println("Nome do Livro:");
                    String titulo = leitor.nextLine();
            
                    System.out.println("Nome do Autor: ");
                    String nome = leitor.nextLine();
            
                    System.out.println("Ano de publicação: ");
                    int ano = leitor.nextInt();
                    
                    Livro livro = new Livro(nome, titulo, ano);
                    estante.add(livro);
                }
            break;
            case 2:
                for(int i=0; i<size; i++){

                    Livro.ExibirInfo();
                }
            break;
        }

        leitor.close();
    }
}

