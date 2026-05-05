package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 números, e eu mostrarei qual é o menor entre eles.");

        for (int i=0; i<=5; i++) {
            int n = sc.nextInt();

            if (n < menor) {
                menor = n;

            }
        }
        System.out.println("menor número dos que foram digitados foi: "+menor);
        sc.close();
    }
}
