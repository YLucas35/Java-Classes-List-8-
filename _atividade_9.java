package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long factor = 1;

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            factor *= i;
        }

        System.out.println("O fatorial de "+n+" é: " + factor);
        sc.close();
    }
}
