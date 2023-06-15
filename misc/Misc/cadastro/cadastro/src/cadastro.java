import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite seu local de trabalho: ");
        String localTrabalho = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        System.out.println("\nNome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Local de Trabalho: " + localTrabalho);
        System.out.println("Salário Mensal: " + salarioMensal);
    }
}