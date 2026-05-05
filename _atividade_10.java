package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int max = 5;

        System.out.println("Digite 5 números, e eu farei a média deles.");

        for (int i=0; i<max; i++) {
            double n = sc.nextDouble();
            sum += n;
        }
        double media = sum / max;

        System.out.println("A média dos 5 números é: "+media);
    }
}
