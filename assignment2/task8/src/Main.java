import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0;i< array.length;i++){
            array[i] = scanner.nextInt();
            for(int j = 0;j<array[i];j++){
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}