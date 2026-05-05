package Java_Lista_8_Para;

public class _atividade_16 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        System.out.println("Os primeiros 10 números da sequência de Fibonacci:");

        for (int i = 1; i <= 10; i++) {
            System.out.print(n1);
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        //Os números posteriores a 8 estão em casas decimais, ou seja (exemplo): depois do 8 não é 1 e 3 separado.
        //E sim é o número 13 inteiro, só pra n achar estranho que na visão a olho nu parece ter mais de 10 números.
    }
}
