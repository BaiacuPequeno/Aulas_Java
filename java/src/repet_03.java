import java.util.Scanner;

public class repet_03 {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
        float nota, n1 = 0;

        System.out.println("Para sair do programa digite qualquer numero acima de 10\n\n");
        System.out.println("****** DIGITE UMA NOTA ******");
        do {
            nota = doc.nextFloat();

            
            System.out.println("****** DIGITE OUTRA NOTA ******");
            if (nota <= 10 && nota >= 0) n1 += nota;

        } while (nota <= 10 && nota >= 0);
            System.out.println("A soma das notas é" + n1);
    }
}
