class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pos = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            
            if(pos.containsKey(complement)){
                return new int[] {pos.get(complement), i};
            }else{
                pos.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}
