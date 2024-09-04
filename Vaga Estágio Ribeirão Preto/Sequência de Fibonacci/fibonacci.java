import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Escolha um número para checar se ele está presente na sequência de Fibonacci:");
         int n = input.nextInt();

         boolean isFibonacci = false;
         
         if (n == 0 || n == 1) {
            isFibonacci = true;
         } else {
            int numInicial = 0;
            int proxNumero = 1;
            int soma = 0;
            for (int i = 1; i <= n; i++){
                soma = numInicial + proxNumero;
                numInicial = proxNumero;
                proxNumero = soma;

                if (soma == n) {
                    isFibonacci = true;
                    break;
                }
            }
         }
         if (isFibonacci) {
            System.out.println("Número pertence.");
         }else{
            System.out.println("Número não pertence.");
         }
    }
}
