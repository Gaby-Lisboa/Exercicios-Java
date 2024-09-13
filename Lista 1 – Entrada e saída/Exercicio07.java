import java.util.Scanner;

public class Exercicio07 {
    public void exerc07() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa para Calcular o salário do vendedor");

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double vtVendas = scanner.nextDouble();

        double salarioBase = 1500.00;
        double comissaoCarro = 350.00;
        double percComissao = 0.001 / 100;

        double comissaoTotalCarros = numCarrosVendidos * comissaoCarro;

        double comissaoTotalVendas = vtVendas * percComissao;

        double salarioTotal = salarioBase + comissaoTotalCarros + comissaoTotalVendas;

        System.out.println("\nResumo do Salário do Vendedor:");
        System.out.println("Nome do Vendedor: " + nomeVendedor);
        System.out.println("Mês: " + mes);
        System.out.println("Número de Carros Vendidos: " + numCarrosVendidos);
        System.out.println("Valor Total das Vendas: R$ " + String.format("%.2f", vtVendas));
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Comissão por Carro Vendido: R$ " + String.format("%.2f", comissaoCarro));
        System.out.println("Comissão Total por Carros Vendidos: R$ " + String.format("%.2f", comissaoTotalCarros));
        System.out.println("Percentual de Comissão sobre o Valor Total das Vendas: " + (percComissao * 100) + "%");
        System.out.println("Comissão Total sobre o Valor das Vendas: R$ " + String.format("%.2f", comissaoTotalVendas));
        System.out.println("Salário Total do Vendedor: R$ " + String.format("%.2f", salarioTotal));

        scanner.close();
    }
}
