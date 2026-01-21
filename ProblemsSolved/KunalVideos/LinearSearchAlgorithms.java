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
        System.out.println(search(arr,target));
    }
    //search in the array
    static int search(int[] array, int target){
        if(array.length==0){
            return -1;
        }
        // run a loop
        for(int i = 0; i < array.length; i++){
            if(target==array[i]){
                return i;
            }
        }
        return 0;
    }
}
