import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        int[] array = new int[n];



        for (int i = 0;i < n ; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int max = array[0];

        for (int i = 0;i< array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println(max);
    }
}