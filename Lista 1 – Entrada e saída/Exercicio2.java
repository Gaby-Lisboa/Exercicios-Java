import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Calculadora de dois numeros\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2° número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        double resto = num1 % num2;

        //desafio 1
        if (num2 == 0){
            System.out.println("A divisão não poderá ser realizada");
        } else {
            double div = num1 / num2;
            System.out.println("A divisão dos dos numeros é de:" + div);
        }

        //desafio 2
        double elev = Math.pow(num1, num2);


        System.out.printf("""
        [Soma] %d + %d = %d
        [Subtração] %d - %d = %d
        [Multiplicação] %d X %d = %d
        [Potenciação] (%d)^%d = %.2f
        [Resto] %d %% %d = %.2f
        """, num1, num2, soma, num1, num2, sub, num1, num2, multi, num1, num2, elev, num1, num2, resto);

        scanner.close();
    }
}


