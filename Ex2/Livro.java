class Livro {
    
    private String Nome;
    private String Titulo;
    private int Ano;

    public Livro(String nome, String titulo, int ano) {
        this.Nome = nome;
        this.Titulo = titulo;
        this.Ano = ano;
    }

    public void ExibirInfo() {
        System.out.println("-- Título: " + this.Titulo);
        System.out.println("-- Autor: " + this.Nome);
        System.out.println("-- Ano de Publicação: " + this.Ano);
        System.out.println();
    }
}
