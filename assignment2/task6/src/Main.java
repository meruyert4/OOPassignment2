public class Main {
    public static void main(String[] args) {
        int[][] multiplicationtable = new int[10][10];

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
               multiplicationtable[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplicationtable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
