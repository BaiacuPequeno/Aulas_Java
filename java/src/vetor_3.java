import java.util.Scanner;

public class vetor_3 {
    public static void main(String[] args) {
        int[] list = new int[5];
        int[] list2 = new int[5];
        int leng = list.length;
        int tot = 0;

        // declarando o scanner
        Scanner doc = new Scanner(System.in);

        // lendo os valores da lista
        for (int i = 0; i < leng; i+=1) {
            System.out.println("Digite um numero:");
            list[i] = doc.nextInt();

            list2[i] = list[i];
            if (i > 0)   list[0] += list[i];
        }

        // mostrando a soma de todos os valores
        System.out.println("A soma dos numeros digitados é: "+ list[0]);


        // mostrando os valores da lista
        System.out.println("Os valores digitados foram: ");
        for (int i = 0; i < leng; i+=1) {
            System.out.print("|"+ list2[i]+ "|"+ "\t");
        }
    }
}
