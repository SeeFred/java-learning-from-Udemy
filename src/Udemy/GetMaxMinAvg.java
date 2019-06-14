package Udemy;

public class GetMaxMinAvg {
    public static void main(String[] args) {
        int[] values = {-2, 1, 1, -36};
        System.out.println("Max number is:" + findMax(values));
        System.out.println("Min number is:" + findMin(values));
        System.out.println("Avg number is:" + findAvg(values));

    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=0;i< arr.length;i++){

            if(arr[i]>max){
                max= arr[i];

            }
        }
        return max;

    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i< arr.length;i++){

            if(arr[i]<min){
                min= arr[i];

            }
        }
        return min;

    }
    public static int findAvg(int[] arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){

            sum= sum+arr[i];
        }
        return sum/arr.length;

    }
}
