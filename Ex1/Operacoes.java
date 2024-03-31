
public class Operacoes {
    
    int valor1 = 0;
    int valor2 = 0;


    static void Soma(int valor1, int valor2){
        
        double resultado = valor1 + valor2;

        System.out.println("Resultado: " + resultado);
    }

    static void Subtracao(int valor1, int valor2){

        double resultado = valor1 - valor2;

        System.out.println("Resultado: " + resultado);
    }

    static void Divisao(int valor1, int valor2){

        if (valor2 != 0) {
            double resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Erro! não é possível dividir por zero");
        }
    }

    static void Multiplicacao(int valor1, int valor2){

        double resultado = valor1 * valor2;
        
        System.out.println("Resultado: " + resultado);
    }
}
