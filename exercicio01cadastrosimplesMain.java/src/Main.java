import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = entrada.nextLine();

        System.out.println();
        System.out.println("Nome\tIdade\tCidade");
        System.out.println("-------------------------");
        System.out.println(nome + "\t" + idade + "\t" + cidade);

        entrada.close();
    }
}
