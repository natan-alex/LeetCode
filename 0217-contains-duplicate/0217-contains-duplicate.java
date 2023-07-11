class Solution {
    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>(nums.length);

        for (var num : nums) {
            var oldSize = set.size();

            set.add(num);

            if (oldSize == set.size()) return true;
        }

        return false;
    }
    
    public boolean containsDuplicate2(int[] nums) {
        var map = new HashMap<Integer, Integer>(nums.length);

        for (var num : nums) {
            if (map.containsKey(num)) return true;

            map.put(num, num);
        }

        return false;
    }
    
    public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; ++i) {
            if (nums[i] == nums[i + 1]) return true;
        }

        return false;
    }

    public boolean containsDuplicate4(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < nums.length; ++j) {
                if (i == j) continue;
                if (nums[i] == nums[j]) return true;
            }
        }

        return false;
    }
}