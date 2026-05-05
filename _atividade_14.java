package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Digite 6 números, e eu somarei apenas aqueles que são positivos.");

        for (int i=0; i<6; i++) {
            int n = sc.nextInt();

            if (n > 0) {
                sum+=n;
            }
        }
        System.out.println("A soma dos números positivos é: "+sum);
        sc.close();
    }
}
