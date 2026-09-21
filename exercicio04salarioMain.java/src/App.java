import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horas = entrada.nextDouble();

        System.out.print("Digite o valor da hora: ");
        double valorHora = entrada.nextDouble();

        double salarioBruto = horas * valorHora;

        System.out.println();
        System.out.println("Horas\tValor Hora\tSalário Bruto");
        System.out.println("---------------------------------------");
        System.out.println(horas + "\t" + valorHora + "\t\t" + salarioBruto);

        entrada.close();
    }
}
