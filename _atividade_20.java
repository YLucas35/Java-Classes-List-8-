package Java_Lista_8_Para;

import java.util.Scanner;

public class _atividade_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int approveds = 0;
        int disapproveds = 0;
        double points;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota do aluno "+i+": ");
            points = sc.nextDouble();
            
            if (points >= 7.0) {
                approveds++;
            } else {
                disapproveds++;
            }
        }

        System.out.println("Total de alunos que foram aprovados: "+approveds);
        System.out.println("Total de alunos reprovados: "+disapproveds);

        sc.close();
    }
}
