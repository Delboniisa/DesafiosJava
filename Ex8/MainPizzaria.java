import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> pizzas = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Adicionar Pizza");
            System.out.println("2. Adicionar Pedido");
            System.out.println("3. Gerar Relatório");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("--- Adicionar Pizza ---");
                    System.out.print("Nome da pizza: ");
                    String nomePizza = scanner.nextLine();
                    System.out.print("Valor da pizza: ");
                    double valorPizza = scanner.nextDouble();
                    scanner.nextLine();

                    // Você pode adicionar os ingredientes da pizza aqui
                    List<String> ingredientes = new ArrayList<>();
                    System.out.println("Adicione os ingredientes da pizza (Digite 'fim' para parar):");
                    String ingrediente;
                    while (!(ingrediente = scanner.nextLine()).equalsIgnoreCase("fim")) {
                        ingredientes.add(ingrediente);
                    }

                    Pizza novaPizza = new Pizza(nomePizza, valorPizza, ingredientes);
                    pizzas.add(novaPizza);

                    System.out.println("Pizza adicionada com sucesso!");
                    break;
                case 2:
                    if (pizzas.isEmpty()) {
                        System.out.println("Não há pizzas cadastradas. Adicione pizzas primeiro.");
                        break;
                    }

                    System.out.println("--- Adicionar Pedido ---");
                    System.out.println("Escolha uma pizza:");
                    for (int i = 0; i < pizzas.size(); i++) {
                        System.out.println((i + 1) + ". " + pizzas.get(i).getNome());
                    }
                    System.out.print("Opção: ");
                    int pizzaEscolhida = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado

                    System.out.print("Tamanho da pizza: ");
                    String tamanhoPizza = scanner.nextLine();

                    System.out.print("Endereço de entrega: ");
                    String enderecoEntrega = scanner.nextLine();

                    Pizza pizzaSelecionada = pizzas.get(pizzaEscolhida - 1);
                    double valorPedido = pizzaSelecionada.getValor();

                    Pedido novoPedido = new Pedido(pizzaSelecionada, tamanhoPizza, valorPedido, enderecoEntrega);
                    pedidos.add(novoPedido);

                    System.out.println("Pedido adicionado com sucesso!");
                    break;
                case 3:
                    System.out.println("--- Relatório de Pedidos ---");
                    for (Pedido pedido : pedidos) {
                        System.out.println("Pizza: " + pedido.getPizza().getNome());
                        System.out.println("Tamanho: " + pedido.getTamanho());
                        System.out.println("Valor: " + pedido.getValor());
                        System.out.println("Endereço de entrega: " + pedido.getEnderecoEntrega());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
