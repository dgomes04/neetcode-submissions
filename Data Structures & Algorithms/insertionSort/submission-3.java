// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> res = new ArrayList<>();
        if(pairs.size() == 0){
            return res;
        }
        res.add(pairs);
        List<Pair> curr = new ArrayList<Pair>(pairs);
        for(int i = 1; i < pairs.size(); i++){
            for(int j = i - 1 ; j >= 0 && curr.get(j).key > curr.get(j + 1).key;j--){
                curr = new ArrayList<Pair>(curr); 
                Pair prev = curr.get(j);
                Pair cur = curr.get(j+1);
                curr.set(j+1, prev);
                curr.set(j, cur);

            }
            res.add(curr);

        }
        return res;
    }
}
