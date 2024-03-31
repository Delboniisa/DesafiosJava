import java.util.ArrayList;
import java.util.Iterator; //para percorrer a lista
import java.util.List;
import java.util.Scanner;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;
    private int codigo;

    public Produto(String nome, float preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }
    
    //muda a variavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void adicionarProduto(Scanner leitor, List<Produto> estoque) {
        System.out.println("Nome do produto: ");
        String nome = leitor.nextLine();

        System.out.println("Quantidade: ");
        int quantidade = leitor.nextInt();

        System.out.println("Preço: ");
        float preco = leitor.nextFloat();

        System.out.println("Código: ");
        int codigo = leitor.nextInt();

        boolean codigoDuplicado = false;
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            if (produto.getCodigo() == codigo) {
                codigoDuplicado = true;
                break;
            }
        }

        if (codigoDuplicado) {
            System.out.println("Erro, já existe um produto com esse código!");
        } else {
            Produto produto = new Produto(nome, preco, quantidade, codigo);
            estoque.add(produto);

            System.out.println("Produto adicionado!");
        }
    }

    public static void atualizarProduto(Scanner leitor, List<Produto> estoque) {
        System.out.println("Digite o código do produto que deseja atualizar: ");
        int codigo = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer
    
        boolean produtoEncontrado = false;
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);
            if (produto.getCodigo() == codigo) {
                produtoEncontrado = true;
    
                System.out.println("Digite o novo nome do produto: ");
                String novoNome = leitor.nextLine();
    
                System.out.println("Digite o novo preço: ");
                float novoPreco = leitor.nextFloat();
    
                System.out.println("Digite a nova quantidade: ");
                int novaQuantidade = leitor.nextInt();
    
                produto.setNome(novoNome);
                produto.setPreco(novoPreco);
                produto.setQuantidade(novaQuantidade);
    
                System.out.println("Produto atualizado!");
                break;
            }
        }
    
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
    

    public static void removerProduto(Scanner leitor, List<Produto> estoque) {
        System.out.println("Digite o código do produto que deseja remover: ");
        int codigo = leitor.nextInt();
        leitor.nextLine();

        boolean produtoEncontrado = false;
        Iterator<Produto> iterator = estoque.iterator();

        while (iterator.hasNext()) {
            Produto produto = iterator.next();

            if (produto.getCodigo() == codigo) {

                iterator.remove();
                produtoEncontrado = true;
            
                System.out.println("Produto removido com sucesso!");
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void imprimirRelatorio(List<Produto> estoque) {

        System.out.println("--- Relatório de Estoque ---");

        float valorTotal = 0;
        for (int i = 0; i < estoque.size(); i++) {
            Produto produto = estoque.get(i);

            System.out.println("-----------------------------");
            System.out.println("Nome: " + produto.getNome());

            System.out.println("Preço: " + produto.getPreco());

            System.out.println("Quantidade: " + produto.getQuantidade());

            float valorProduto = produto.getPreco() * produto.getQuantidade();

            System.out.println("Valor total do produto: " + valorProduto);
            valorTotal += valorProduto;

            System.out.println("Código: " + produto.getCodigo());
            System.out.println("-----------------------------");
        }

        System.out.println("Valor total do estoque: " + valorTotal);
    }
}
