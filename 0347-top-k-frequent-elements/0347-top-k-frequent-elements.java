class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];

        for(int n: nums){
            seen.put(n, seen.getOrDefault(n, 0)+1);
        }

        for(int i=0;i<freq.length;i++){
            freq[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> count : seen.entrySet()){
            Integer key = count.getKey();
            Integer value = count.getValue();
            System.out.println(key+", "+ value);
            freq[value].add(key);
        }
        int index  = 0;
        int[] res = new int[k];

        for(int i= freq.length-1; i>0 && index < k ; i--){
            for(int num : freq[i]){
                res[index++] = num;
                if(index == k){
                    return res;
                }
            }
        }
        return res;
    }
}