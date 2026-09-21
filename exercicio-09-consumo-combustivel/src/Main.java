import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância percorrida em km: ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite os litros de combustível: ");
        double litros = entrada.nextDouble();

        double consumo = distancia / litros;

        System.out.println();
        System.out.println("Distância: " + distancia + " km");
        System.out.println("Litros: " + litros + " L");
        System.out.println("Consumo: " + consumo + " km/l");

        if (consumo >= 12.0) {
            System.out.println("Classificação: econômico");
        } else {
            System.out.println("Classificação: alto consumo");
        }

        entrada.close();
    }
}
