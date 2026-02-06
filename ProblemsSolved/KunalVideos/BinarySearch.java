package KunalVideos;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,15,21,23,52,63,67,85,96,102,231};
        int ans = BinarySearch1(arr,0);
        System.out.println(ans);
    }
    static int BinarySearch1(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
        int mid = start + ((end - start) / 2); //We don't do (Start + End)/ 2 because in case of larger arrays it becomes a problem for int datatype to carry a larger number
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target> arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
