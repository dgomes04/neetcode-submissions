class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            int element = nums[i];
            if(seen.contains(element)){
                return true;
            }
            seen.add(element);
        }
        return false;
    }
}