// Exercicio 12 - Desafio final
// Contexto: Calculo de comissao de um vendedor.
// Se as vendas forem maiores ou iguais a 5000, ganha 10% de comissao (0.10).
// Se for menor que 5000, ganha 5% de comissao (0.05).
//
// Casos de teste:
// 1. Vendas: 4000 -> Comissao esperada: 200.0 (5%)
// 2. Vendas: 5000 -> Comissao esperada: 500.0 (10% - valor de fronteira)
// 3. Vendas: 7000 -> Comissao esperada: 700.0 (10%)

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o valor total de vendas: ");
        double vendas = entrada.nextDouble();

        double comissao = 0;
        if (vendas >= 5000.0) {
            comissao = vendas * 0.10;
        } else {
            comissao = vendas * 0.05;
        }

        double total = vendas + comissao;

        System.out.println();
        System.out.println("Vendedor: " + nome);
        System.out.println("Total de vendas: " + vendas);
        System.out.println("Comissão: " + comissao);
        System.out.println("Total com comissão: " + total);

        entrada.close();
    }
}
