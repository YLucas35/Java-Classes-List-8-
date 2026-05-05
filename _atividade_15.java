package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = 0;

        System.out.println("Digite 8 números, e eu mostrarei quais deles são maiores do que 50.");

        for (int i=0; i<8; i++) {
            int n = sc.nextInt();

            if (n > 50) {
                c++;
            }
        }
        System.out.println("A quantidade de números maiores que 50 é: "+c);
        sc.close();
    }
}
