package functions;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("The Sum of first %d numbers is %d",input, sum(input) );
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
//        return n * (n+1)/2;
    }
}
