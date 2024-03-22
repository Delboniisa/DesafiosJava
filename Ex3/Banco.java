import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        int opcao=0;

        System.out.println("-- Bem vindo--");
        System.out.println("O que você deseja realizar?");
        System.out.println("1. Depósito");
        System.out.println("2. Saque");
        System.out.println("3. Ver saldo");
        System.out.println("4. Criar conta");
        opcao = leitor.nextInt();

        switch(opcao){
            case 1: 
            
            break;
            case 2:  

            break;
            case 3:

            break;
            case 4: 

            break;
            default:
                System.out.println("Opção inválida!");
            break;
        }


        leitor.close();
    }
}

