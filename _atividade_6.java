package Java_Lista_8_Para;

public class _atividade_6 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<5; i++) {
            int pastsum = sum;
            sum+=i;
            System.out.println(pastsum+" + "+i+" = "+sum);
        }
    }
}
