package arrays;

public class RunningSumof1dArray1480 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] runningSum(int[] nums) {
            int n = nums.length;
            for(int i = 1; i < n; i++){
                nums[i] = nums[i] + nums[i-1];
            }
            return nums;
        }
    }
}

