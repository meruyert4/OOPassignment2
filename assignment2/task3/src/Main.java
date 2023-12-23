public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,54,4,3,1,2,32,0,11};
        for (int i = 0; i < numbers.length ; i++){
            if(numbers[i]%2==0){
                numbers[i] = -numbers[i];
            }
        }
        for (int i = 0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}