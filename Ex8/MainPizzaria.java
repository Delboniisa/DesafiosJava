import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPizzaria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcao;

        List<Pizza> pizzas = new ArrayList<>();
        List<Pedido> pedidos = new ArrayList<>();

        do {
            System.out.println("--- Menu ---");
            System.out.println("1. Adicionar Pizza");
            System.out.println("2. Adicionar Pedido");
            System.out.println("3. Gerar Relatório");
            opcao = leitor.nextInt();
            leitor.nextLine(); //Limpar o buffer

            switch (opcao) {
                case 1:
                    Pizza.novaPizza(leitor, pizzas);
                    break;
                case 2:
                    Pedido.novoPedido(leitor, pizzas, pedidos);
                    break;
                case 3:
                    System.out.println("--- Relatório de Pedidos ---");
                    for (int i = 0; i < pedidos.size(); i++) {
                        Pedido pedido = pedidos.get(i);
                        System.out.println("-----------------------------");
                        System.out.println("Pizza: " + pedido.getPizza().getNome());
                        System.out.println("Tamanho: " + pedido.getTamanho());
                        System.out.println("Valor: " + pedido.getValor());
                        System.out.println("Endereço de entrega: " + pedido.getEnderecoEntrega());
                        System.out.println("-----------------------------");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);

    }
}
