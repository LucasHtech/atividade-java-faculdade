import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = entrada.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println();
        System.out.println("Base\tAltura\tÁREA\tPERÍMETRO");
        System.out.println("---------------------------------");
        System.out.println(base + "\t" + altura + "\t" + area + "\t" + perimetro);

        entrada.close();
    }
}
