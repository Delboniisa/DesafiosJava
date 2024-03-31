import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public Pizza(String nome, double valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    static public void novaPizza(Scanner leitor, List<Pizza> pizzas) {
        System.out.println("--- Adicionar Pizza ---");
    
        System.out.print("Nome da pizza: ");
        String nomePizza = leitor.nextLine();
        
        System.out.print("Valor da pizza: ");
        double valorPizza = leitor.nextDouble();
        leitor.nextLine();
    
        List<String> ingredientes = new ArrayList<>();
        System.out.println("Adicione os ingredientes da pizza (Digite 'fim' para parar):");
        String ingrediente;
        
        do {
            ingrediente = leitor.nextLine();
            if (!ingrediente.equalsIgnoreCase("fim")) {
                ingredientes.add(ingrediente);
            }
        } while (!ingrediente.equalsIgnoreCase("fim")); //quando achar o 'fim' irá terminar
    
        Pizza novaPizza = new Pizza(nomePizza, valorPizza, ingredientes);
        pizzas.add(novaPizza);
    
        System.out.println("Pizza adicionada com sucesso!");
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

}
