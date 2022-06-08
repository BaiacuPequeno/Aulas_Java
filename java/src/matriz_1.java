public class matriz_1 {
    public static void main(String[] args) {

        // declarando a matriz
        int nums[][] = {{4, 5, 6, 7}, {1, 2, 3, 4}, {9, 4, 6, 11}};
        int i, j;
        int len = nums.length;
        int len2 = len + 1;

        // mostrando os numeros da matriz
        for (i = 0; i < len; i++) {
            for(j = 0; j < len2; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
