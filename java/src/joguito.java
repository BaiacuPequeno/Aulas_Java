import java.util.Scanner;
import java.util.Random;

public class joguito {
    public static void main(String[] args) {
        Scanner doc = new Scanner(System.in);
        Random num = new Random();
        int c, comp = 0;
        comp = num.nextInt(10) + 1;

        do {
            System.out.println("Chute um numero de 0 a 10");
            c = doc.nextInt();

            if (c == comp) {
                System.out.println("Você acertou!!!");
            } else {
                if (c < comp) {
                    System.out.println("Mais alto!");
                } else {
                    System.out.println("Mais baixo!");
                }
            }
        } while (c != comp);

        doc.close();
    }
}
