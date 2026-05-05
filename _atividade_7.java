package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Digite um número para ser o limite da sua soma");
        int end = sc.nextInt();

        for (int i=1; i<=end; i++) {
            int pastsum = sum;
            sum+=i;
            System.out.println(pastsum+" + "+i+" = "+sum);
        }
        sc.close();
    }
}
