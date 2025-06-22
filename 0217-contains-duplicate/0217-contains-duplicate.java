class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
      return Arrays.stream(nums).anyMatch(n ->!seen.add(n));
    }
}