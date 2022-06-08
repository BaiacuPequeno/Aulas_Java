import java.util.Scanner;

public class vetor_1 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        int leng = notas.length;

        Scanner doc = new Scanner(System.in);

        // leitura de 10 notas
        for (int i = 0; i < leng; i+=1) {
            System.out.println("Digite a nota do aluno numero "+ (i+1));
            notas[i] = doc.nextDouble();
        }


        for (int i = 0; i < leng; i+=1) {
            System.out.println(" nota: "+ (i + 1) + " = "+ notas[i]);
        }

        doc.close();
    }
}
