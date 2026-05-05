package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        System.out.println("Digite 10 números, e eu mostrarei quais deles são pares.");

        for (int i=0; i<10; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                c++;
            }
        }
        System.out.println("A quantidade de números pares é: "+c);
        sc.close();
    }
}
