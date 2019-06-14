package Udemy;
// factorial Write a function that computes the factorial value
//Definition: n! = n*(n-1)! , where 0! = 1
//1! = 1
//2! = 2 * 1! = 2 * 1
//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
/*
//Factorial Program using recursion in java
class FactorialExample{
    public static void main(String args[]){
        System.out.println(getf(4));
    }
    public static int getf(int n){
        if(n==0){
            return 1;
        }
        return getf(n-1)*n;
        }

}
*/
//Factorial Program using loop in java
class FactorialExample{
    public static void main(String args[]){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
