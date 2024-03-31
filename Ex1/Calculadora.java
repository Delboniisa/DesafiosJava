import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        String respostaUsuario;

        System.out.println("---Calculadora---");

        do {
            System.out.println("Qual operação você deseja realizar:");
            String operacao = leitor.nextLine();

            System.out.println("Informe os valores:");
            int valor1 = leitor.nextInt();
            int valor2 = leitor.nextInt();
            
            leitor.nextLine();

            switch (operacao) {
                case "+":
                    Operacoes.Soma(valor1, valor2);
                    break;
                case "-":
                    Operacoes.Subtracao(valor1, valor2);
                    break;
                case "*":
                    Operacoes.Multiplicacao(valor1, valor2);
                    break;
                case "/":
                    Operacoes.Divisao(valor1, valor2);
                    break;
                default:
                    System.out.println("Operação inválida, tente novamente!");
                    break;
            }

            System.out.println("Deseja continuar? (s/n)");
            respostaUsuario = leitor.nextLine();

        } while (respostaUsuario.equals("s"));

        leitor.close();
    }
}
