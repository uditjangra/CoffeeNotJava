package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();
        System.out.printf("The factorial of %d is %d",input,factorial(input));
    }
    public static int factorial(int n){
        int x = 1;
        for(int i = 1; i <= n;i++){
            x = x * i;
        }
        return x;
    }
}
