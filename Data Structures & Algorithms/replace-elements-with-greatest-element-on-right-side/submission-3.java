class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;

        for(int i = n - 1; 0 <= i; i--){
            int tmp = arr[i];
            arr[i] = max;
            max = Math.max(max, tmp);
        }
        return arr;
    }
}