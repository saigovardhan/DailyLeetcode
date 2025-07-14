class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> seen = new HashMap<>();
       for(Character c : s.toCharArray()){
        seen.put(c, seen.getOrDefault(c,0)+1);
       }

       for(Character c : t.toCharArray()) {
        if(!seen.containsKey(c)){
            return false;
        }
        if(seen.get(c)>0){
            seen.put(c, seen.get(c)-1);
        }

        if(seen.get(c) == 0){
            seen.remove(c);
        }
       }

       if(seen.size() > 0){
        return false;
       }
       return true;
    }
}