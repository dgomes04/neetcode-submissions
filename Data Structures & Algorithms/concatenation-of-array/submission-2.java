class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for(int i = 0, j = n; i < n; i++){
            int curr = nums[i];
            ans[i] = curr;
            ans[j] = curr;
            j++;
        }
        return ans;
    }
}