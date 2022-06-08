public class repet_02 {
    public static void main(String[] args) {
        int cont = 1;
        int ac = 0;
        int ac2 = 0;

        System.out.println("Os numeros pares entre 0 e 100 sao: ");
        while (cont <= 100) {
            if (cont == 101) break;
            if (cont%2 == 0) {
                ac += cont;
                ac2 += cont;
            }
            if (ac > 0) System.out.println(ac);
            cont ++;
            ac = 0;
        }
        System.out.println("A soma desses números é: " + ac2);
    }
}
