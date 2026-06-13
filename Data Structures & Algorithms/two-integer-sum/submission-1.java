class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pos = new HashMap<>();
        int[] result = new int[2];

        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            
            if(pos.containsKey(complement)){
                result[0] = pos.get(complement);
                result[1] = i;
                return result;
            }else{
                pos.put(nums[i], i);
            }
        }

        return result;
    }
}
