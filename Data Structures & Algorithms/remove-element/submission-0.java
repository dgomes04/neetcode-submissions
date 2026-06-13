class Solution {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == val){
                count++;
                for(int j = i+1; j < nums.length; j++){
                    if(nums[j] == val){
                        count++;
                    }else{
                        nums[i] = nums[j];
                        nums[j] = val;
                        count = 0;
                        res++;
                        break;
                    }
                }
            } else {
                res++;
            }
        }
        return res;
    }
}