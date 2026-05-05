package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;

        System.out.println("Digite 5 números, e eu mostrarei qual é o maior entre eles.");

        for (int i=0; i<=5; i++) {
            int n = sc.nextInt();

            if (n > maior) {
                maior = n;

            }
        }
        System.out.println("maior número dos que foram digitados foi: "+maior);
        sc.close();
    }
}
