package functions;

import java.util.Scanner;

public class PythagoreanTripletCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(isPythagoreanTriplet(a,b,c)){
            System.out.println("This is a Pythagorean Triplet");
        }else{
            System.out.println("This is not a Pythagorean Triplet");
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c){
        return (a * a) + (b * b) == (c * c) || (b*b) + (c*c) == (a*a);
    }
}
