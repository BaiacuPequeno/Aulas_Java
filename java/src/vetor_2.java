import java.util.Scanner;

public class vetor_2 {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);

        int m;
        int[] nums = new int[5];

        // tamanho do vetor
        int leng = nums.length;

        System.out.println("Digite um número: ");
        // instrução for para pegar os valores digitados
        for (int i = 0; i < leng; i+=1) {
            nums[i] = doc.nextInt();
            System.out.println("Digite outro número: ");
        }

        m = nums[0];

        // pega o maior numero dentro do vetor nums
        for (int i = 0; i < leng; i+=1) {
            if (nums[i] > m) {
                m = nums[i];
            }
        }

        System.out.println("\n\nO maior numero dentro do vetor é: "+ m);
        doc.close();
    }
}
