class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> seen = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String s : strs) {
           seen.computeIfAbsent(hashCode(s), k->new ArrayList<>()).add(s);
        }

        for(List<String> e : seen.values()){
            result.add(e);
        }

        return result;

    }

    public String hashCode(String word) {
        int[] nums = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            int position = current - 'a';
            nums[position] += 1;
        }

        StringBuilder sb = new StringBuilder();
        char current = 'a';
        for (int i : nums) {
            sb.append(current + "" + i);
            current += 1;
        }

        return sb.toString();
    }
}