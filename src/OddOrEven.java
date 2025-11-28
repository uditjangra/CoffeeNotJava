import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if(input%2==0){
            System.out.println("The input is even");
        }else{
            System.out.println("The input is odd");
        }
    }
}
