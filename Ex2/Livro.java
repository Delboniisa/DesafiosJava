import java.util.ArrayList;

public class Livro {
    
    static ArrayList<String> Nome;
    static ArrayList<String> Titulo;
    static ArrayList<Integer> Ano;

    public Livro(String nome2, String titulo2, int ano2) {
        this.Nome = new ArrayList<>();
        this.Titulo = new ArrayList<>();
        this.Ano = new ArrayList<>(); 
    }

    static void ExibirInfo(){

        System.out.println("-- Titulo:" + Titulo);
        System.out.println("-- Autor: " + Nome);
        System.out.println("-- Ano de Publicação: " + Ano);

    }

}

