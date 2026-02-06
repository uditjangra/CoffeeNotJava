package KunalVideos;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7,10,20,30,40,50,67,78};
        int[] arr2 = {78,67,56,45,34,23,10};
        int ans = AgnosticBinary(arr,50);
        int ans2 = AgnosticBinary(arr2,67);
        System.out.println("For ascending order:" + ans);
        System.out.println("For descending order:" + ans2);
    }
    static int AgnosticBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        while(start<=end) {
            int mid = start + ((end - start) / 2);
            if (isAsc) {
                if(target==arr[mid]){
                    return mid;
                }
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target==arr[mid]){
                    return mid;
                }
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
