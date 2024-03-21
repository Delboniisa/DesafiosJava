import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);   

        System.out.println("---Calculadora---");

        System.out.println("Qual operação você deseja realizar:");
        String operacao = leitor.nextLine();

        System.out.println("Informe os valores:");
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();

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
                System.out.println("Operação inválida");
                break;
        }

    }
}

