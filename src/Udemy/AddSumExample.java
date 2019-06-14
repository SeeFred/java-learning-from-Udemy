package Udemy;

//Fibonnaci number mean that sum of the two preceding numbers.

import java.util.Scanner;

public class AddSumExample {
    public static void main(String[] args) {

        int sum =addingSum(4);
        System.out.println(sum);

    }
        public static int addingSum(int n){
            int sum = 0;
            for(int i = 1; i < n; i++){
                System.out.print(sum + "+" + i);
                sum = sum + i;
                System.out.println("=" + sum);
            }
            return sum;


        }



}

