package KunalVideos.QuestionsOnBinarySearch;

public class CeilingNumber {
    static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int ans = CeilingNumber(arr,4);
        int ans2 = CeilingNumber(arr,15);
        System.out.println(ans + " " + ans2);
    }
    static int CeilingNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<arr[mid]){
                end = mid - 1;
            }else if (target>arr[mid]) {
                start = mid + 1;
            }else if (target==arr[mid]) {
                return mid;
            }
        }
        return start;
    }
}
