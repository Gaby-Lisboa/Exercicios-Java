import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa que calcula o valor de venda de uma mercadoria\n");

        System.out.println("Informe o valor da compra: ");
        double compra = scanner.nextDouble();

        double representante = (compra * 0.20);
        double imposto = (compra * 0.30);
        double venda = compra + representante + imposto;

        System.out.printf("O valor total da venda é de R$%.2f \nSendo R$%.2f do Representante e R$%.2f de Imposto", venda, representante, imposto);

        scanner.close();
    }
}
