package LeetCodeDaily;

public class StringScore {
    static class Solution10 {
        public int scoreOfString(String s) {
            int sum = 0;
            for(int i = 0; i < s.length()-1; i++){
                int firstLetter = s.charAt(i);
                int secondLetter = s.charAt(i+1);
                int firstminussecond = Math.abs(firstLetter - secondLetter);
                sum += firstminussecond;
            }
            return sum;
        }
    }
}
