import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println();
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        System.out.println();
        System.out.println("Celsius\tFahrenheit");
        System.out.println("--------------------");
        System.out.println(celsius + "\t" + fahrenheit);

        entrada.close();
    }
}
