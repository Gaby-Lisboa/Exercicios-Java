import java.util.Scanner;

public class Exercicio06 {
    public void exerc06() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para calcular a média ponderada");

        System.out.println("Digite a 1° nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a 2° nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 * 0.40) + (nota2 * 0.60);

        System.out.printf("A média ponderada é de %.2f", media);

        scanner.close();
    }
}
