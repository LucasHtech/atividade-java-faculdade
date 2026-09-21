import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double valorMinimoFreteGratis = 150.0;
        double valorFixoFrete = 15.0;

        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        double frete = 0;
        if (valorCompra >= valorMinimoFreteGratis) {
            frete = 0;
        } else {
            frete = valorFixoFrete;
        }

        double total = valorCompra + frete;

        System.out.println();
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Frete: " + frete);
        System.out.println("Total a pagar: " + total);

        entrada.close();
    }
}
