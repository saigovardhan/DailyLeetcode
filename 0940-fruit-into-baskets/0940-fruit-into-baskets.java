class Solution {
    public int totalFruit(int[] fruits) {
        // store in a hashmap
        // when hashmap is at size 2 , count elements in hashmap it is max
        Map<Integer, Integer> basket = new HashMap<>();
        int start = 0, end = 0, maxAfford = 0;

        while (end < fruits.length) {
            int right_fruit = fruits[end];
            basket.put(right_fruit, basket.getOrDefault(right_fruit, 0) + 1);
            while (basket.size() > 2 && start < fruits.length) {
                int left_fruit = fruits[start];
                basket.put(left_fruit, basket.get(left_fruit)-1);
                if(basket.get(left_fruit) <=0){
                    basket.remove(left_fruit);
                }
                start+=1;
            }
            maxAfford = Math.max(maxAfford, (end-start)+1);
            end+=1;
        }
        return maxAfford;
    }
}