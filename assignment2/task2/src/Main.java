import java.util.Scanner;
public class Main {
    public static String[] strings = new String[5];

    public static void main(String[] args) {

        for (int i = 0; i < strings.length ; i++){
            if(i%2==0){
                strings[i] = "even";
            }
            else {
                strings[i] = "ood";
            }
        }

        for (int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }

    }
}