package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se ele é primo ou não: ");
        int num = sc.nextInt();
        int divisors = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors++;
            }
        }

        if (divisors == 2) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
        sc.close();
    }
}
