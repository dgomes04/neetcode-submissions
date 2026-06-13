class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> p = new HashMap<>();
        int[] r = new int[2];
        int l = nums.length;
        for(int i=0;i<l;i++){
            int cr=nums[i];
            int c = target-cr;
            
            if(p.containsKey(c)){
                r[0] = p.get(c);
                r[1] = i;
                return r;
            }else{
                p.put(cr, i);
            }
        }

        return r;
    }
}
