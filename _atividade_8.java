package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para começar a fazer a tabuada de vezes deste número:");
        int n = sc.nextInt();

        for (int i=1; i<=10; i++) {
            int r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }
        sc.close();
    }
}
