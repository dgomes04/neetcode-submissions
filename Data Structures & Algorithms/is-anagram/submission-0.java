class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> amtS = new HashMap<>();
        HashMap<Character, Integer> amtT = new HashMap<>();

        for(int i=0;i<s.length();i++){
            amtS.merge(s.charAt(i), 1, Integer::sum);
            amtT.merge(t.charAt(i), 1, Integer::sum);
        }
        return amtS.equals(amtT);
    }
}
