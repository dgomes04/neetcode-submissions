class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        
        for(int i=0;i<arr.length -1;i++){
            int curr = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > curr){
                    curr = arr[j];
                }
            }
            res[i] = curr;
        }
        res[arr.length -1] = -1;
        return res;
    }
}