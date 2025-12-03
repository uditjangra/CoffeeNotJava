package arrays;

public class BuildArrayfromPermutation1920 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] arr = new int[nums.length];
            for(int i = 0; i < nums.length;i++){
                arr[i]=nums[nums[i]];
            }return arr;
        }
    }
}
