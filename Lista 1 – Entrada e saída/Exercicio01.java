import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Programa para cadastrar canditatos a vagas da BOSCH");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua data de Nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Digite sua pretensão Salarial: ");
        String pretensaoSalarial = scanner.nextLine();

        System.out.print("""
                Qual seu grau de Instrução? 
                Ensino médio
                Ensino técnico 
                Ensino superior 
                """);
        String grauInstrucao = scanner.nextLine();

        System.out.print("Qual o cargo Pretendido: ");
        String cargoPretendido = scanner.nextLine();

        System.out.print("""
                Possui CNH do tipo B? (sim ou não): """);
        String possuiCNH = scanner.nextLine();

        System.out.println("\nCadastro Confirmado!\n");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Pretensão Salarial: " + pretensaoSalarial);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Cargo Pretendido: " + cargoPretendido);
        System.out.println("Possui CNH do tipo B: " + possuiCNH);

        scanner.close();
    }
}
