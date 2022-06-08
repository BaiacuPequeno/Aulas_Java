public class for_2 {
    public static void main(String[] args) {
        int num;

        System.out.println("Os multiplos de 2 entre 0 e 1000 sao: \n\n\n");
        for (num = 0; num < 1002; num+=2) {
            System.out.print(num + " ");
            if(num%30 == 0) {
                System.out.println("");
            }
        }
    }
}
