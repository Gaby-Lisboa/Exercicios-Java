import java.util.Scanner;

public class Exercicio05 {
    public void exerc05() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para trasformar o horário em segundos");

        System.out.println("Digite as horas:");
        int hora = scanner.nextInt();
        System.out.println("Digite os minutos:");
        int min = scanner.nextInt();
        System.out.println("Digite os segundos:");
        int seg = scanner.nextInt();

        int segundos = (hora * 3600) + (min * 60) + seg;

        System.out.printf("O horário é de: %d segundos", segundos);

        scanner.close();
    }
}
