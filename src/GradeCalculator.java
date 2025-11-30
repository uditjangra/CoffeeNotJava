import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int subjects = scanner.nextInt();
        float totalMarks = 0;
        System.out.println("Enter the marks in each subject one by one:");
        for(int i = 0; i < subjects; i++){
            totalMarks = totalMarks + scanner.nextFloat();
        }
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Grade: " + grades(percentage(totalMarks, subjects)));
    }

    public static String grades(float percentage){
        switch ((int)percentage/10) {
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
            case 7:
                System.out.println("Grade : A");
                break;
            case 6:
                System.out.println("Grade : B");
                break;
            case 5:
                System.out.println("Grade : C");
                break;
            default:
                System.out.println("Grade : D");
                break;
        }
        return null;
    }
    public static float percentage(float totalMarks,int subjects){
        return (totalMarks/(100 * subjects))*100;
    }
}
