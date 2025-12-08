package arrays;

class answer2 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int x : nums){
            if(hasEvenDigits(x)){
                count++;
            }
        }
        return count;
    }
    public boolean hasEvenDigits(int input){
        int temp = input;
        int count = 0;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        if(count%2==0){
            return true;
        }else{
            return false;
        }
    }
}