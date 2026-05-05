package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ser o limite da sua contagem:");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++) {
            System.out.println(i);
        }
    }
}
