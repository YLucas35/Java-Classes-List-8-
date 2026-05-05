package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (inteiro): ");
        int n = sc.nextInt();

        System.out.println("Os divisores de "+n+" são:");

        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
