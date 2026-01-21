package KunalVideos;

import java.util.Scanner;

public class LinearSearchAlgorithms {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = search(arr,target);
        System.out.println(ans);
    }
    //search in the array
    static int search(int[] array, int target){
        for (int element : array) {
            if (target == element) {
                return element;
            }
        }
        return -1;
    }
}
