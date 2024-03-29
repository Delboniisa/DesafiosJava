import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        List<Produto> estoque = new ArrayList<>();

        while (true) {
            System.out.println("--- Estoque ---");
            System.out.println("1. Adicionar novo produto ");
            System.out.println("2. Atualizar um produto ");
            System.out.println("3. Remover um produto ");
            System.out.println("4. Imprimir relatório ");

            int opcao = leitor.nextInt();
            leitor.nextLine(); 

            switch(opcao){
                case 1: 
                    Produto.adicionarProduto(leitor, estoque);
                    break;
                case 2:
                    Produto.atualizarProduto(leitor, estoque);
                    break;
                case 3: 
                    Produto.removerProduto(leitor, estoque);
                    break;
                case 4: 
                    Produto.imprimirRelatorio(estoque);
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
