import java.util.Scanner;

public class for_1 {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);

        int id, acId = 0;
        int c;
        int b = 1;

        for (c = 0; c < 5; c++) {
            System.out.println("Digite a idade do numero " + b);
            id = doc.nextInt();
            acId += id;
            b++;
        }

        System.out.println("A soma das idades é " + acId);
        doc.close();
    }
}
