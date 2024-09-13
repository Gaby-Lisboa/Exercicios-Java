import java.util.Scanner;

public class Exercicio04 {
    public void exerc04() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para informar o número antecessor e sucssor do número digitado\n");

        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int ant = num - 1;
        int sus = num + 1;

        System.out.printf("O número digitado foi %d, seu número antecessor é %d e seu número sucessor é %d", num, ant, sus);

        scanner.close();
    }
}
