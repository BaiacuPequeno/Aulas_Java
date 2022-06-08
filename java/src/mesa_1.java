public class mesa_1 {
    public static void main(String[] args) {
        int cont = 1;
        long acu = 100;
        boolean cond;

        System.out.println("Número da iteração\tCondição\tControle\tAcumulador");
        do{
            acu -= cont;
            cond = cont <= 10;
            System.out.println("Iteração "+ cont+ "\t\t\t"+ cond+ "\t\t\t" + cont+ "\t\t\t"+ acu);
            cont+=1;
        }while (cont <=10);
    }
}
