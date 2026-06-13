class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int curr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                curr++;
            }else{
                res.add(curr);
                curr = 0;
                continue;
            }
            res.add(curr);
        }
        res.sort(null);
        return res.get(res.size() - 1);
    }
}