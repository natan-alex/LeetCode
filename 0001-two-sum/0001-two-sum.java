// not mine solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var numsAndIndices = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            var complement = target - nums[i];

            if (numsAndIndices.containsKey(complement)) {
                return new int[] { i, numsAndIndices.get(complement) };
            } else {
                numsAndIndices.put(nums[i], i);
            }
        }

        return null;
    }
}