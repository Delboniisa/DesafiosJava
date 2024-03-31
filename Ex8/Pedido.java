import java.util.List;
import java.util.Scanner;

public class Pedido {
    private Pizza pizza;
    private String tamanho;
    private double valor;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido(Pizza pizza, String tamanho, double valor, String enderecoEntrega) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.valor = valor;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
    }

    public static void novoPedido(Scanner leitor, List<Pizza> pizzas, List<Pedido> pedidos){
        if (pizzas.isEmpty()) { // ver se está vazio
            System.out.println("Não há pizzas cadastradas, adicione pizzas primeiro!");
        }

        System.out.println("--- Adicionar Pedido ---");
        System.out.println("Escolha uma pizza:");

        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println((i + 1) + ". " + pizzas.get(i).getNome());
        }

        System.out.print("Opção: ");
        int pizzaEscolhida = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer 

        System.out.print("Tamanho da pizza: ");
        String tamanhoPizza = leitor.nextLine();

        System.out.print("Endereço de entrega: ");
        String enderecoEntrega = leitor.nextLine();

        Pizza pizzaSelecionada = pizzas.get(pizzaEscolhida - 1); //achar a pizza selecionada
        double valorPedido = pizzaSelecionada.getValor();

        Pedido novoPedido = new Pedido(pizzaSelecionada, tamanhoPizza, valorPedido, enderecoEntrega);
        pedidos.add(novoPedido);

        System.out.println("Pedido adicionado!");
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void cancelarPedido() {
        this.cancelado = true;
    }

}
