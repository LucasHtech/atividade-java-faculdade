import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço unitário: ");
        double preco = entrada.nextDouble();

        System.out.print("Digite a quantidade: ");
        int qtd = entrada.nextInt();

        double subtotal = preco * qtd;
        double desconto = 0;

        if (subtotal >= 200.0) {
            desconto = subtotal * 0.05;
        }

        double total = subtotal - desconto;

        System.out.println();
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor final: " + total);

        entrada.close();
    }
}
