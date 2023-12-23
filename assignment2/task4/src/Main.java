public class Main {
    public static void main(String[] args) {
        int[] firstarray = {1,2,3,4,5,6,7,8,9,0};
        int[] secondarray = {11,12,13,14,15,16,17,18,19,20};
        int[] resultarray = new int[20];

        for (int i=0;i< firstarray.length;i++){
            resultarray[i] = firstarray[i];
        }
        for (int i = firstarray.length;i<resultarray.length;i++){
            resultarray[i] = secondarray[i - firstarray.length];
        }

        for (int i = 0 ;i < resultarray.length ;i++){
            System.out.print(resultarray[i]+" ");
        }

    }
}