import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do trabalhador: ");
        String nome = entrada.nextLine();

        System.out.print("Digite as horas trabalhadas: ");
        double horas = entrada.nextDouble();

        System.out.print("Digite o valor da hora: ");
        double valorHora = entrada.nextDouble();

        double salarioBruto = horas * valorHora;
        double bonificacao = 0;

        if (salarioBruto >= 1000.0) {
            bonificacao = 100.0;
        }

        double valorFinal = salarioBruto + bonificacao;

        System.out.println();
        System.out.println("Trabalhador: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Bonificação: " + bonificacao);
        System.out.println("Valor final a pagar: " + valorFinal);

        entrada.close();
    }
}
