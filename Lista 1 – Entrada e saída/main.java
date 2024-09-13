import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicio01 exerc01 = new Exercicio01();
        Exercicio02 exerc02 = new Exercicio02();
        Exercicio03 exerc03 = new Exercicio03();
        Exercicio04 exerc04 = new Exercicio04();
        Exercicio05 exerc05 = new Exercicio05();
        Exercicio06 exerc06 = new Exercicio06();
        Exercicio07 exerc07 = new Exercicio07();



        System.out.println("Lista 1 - Entrada e saída");

        System.out.println("""
        Escolha um exercício para ser executado:
        [1] - Exercicio 01 (Programa para cadastrar canditatos a vagas da BOSCH)
        [2] - Exercício 02 (Calculadora de dois números)
        [3] - Exercicio 03 (Programa que calcula o valor de venda de uma mercadoria)
        [4] - Exercicio 04 (Programa para informar o número antecessor e sucssor do número digitado)
        [5] - Exercicio 05 (Programa para trasformar o horário em segundos)
        [6] - Exercicio 06 (Programa para calcular a média ponderada)
        [7] - Exercicio 07 (Programa para calcular o salário do vendedor)
        """);
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                exerc01.exerc01();
                break;
            case 2:
                exerc02.exerc02();
                break;
            case 3:
                exerc03.exerc03();
                break;
            case 4:
                exerc04.exerc04();
                break;
            case 5:
                exerc05.exerc05();
                break;
            case 6:
                exerc06.exerc06();
                break;
            case 7:
                exerc07.exerc07();
                break;
        }
    }
}
