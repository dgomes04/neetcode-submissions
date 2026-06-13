class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len ; i++){      
            if ( nums[i] == 1 ){
                count++;
            } else {
                if (maxCount < count){
                    maxCount = count;     
                } 
                count = 0;
            }
        }
                 if (maxCount < count){
                    maxCount = count;
                } 
        return maxCount;
    }
}