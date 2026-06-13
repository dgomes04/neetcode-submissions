class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> p = new HashMap<>();
        int[] r = new int[2];
        int l = nums.length;
        for(int i=0;i<l;i++){
            int complement = target - nums[i];
            
            if(p.containsKey(complement)){
                r[0] = p.get(complement);
                r[1] = i;
                return r;
            }else{
                p.put(nums[i], i);
            }
        }

        return r;
    }
}
