use std::collections::HashSet;

impl Solution {
    pub fn contains_duplicate(nums: Vec<i32>) -> bool {
        let mut set = HashSet::with_capacity(nums.len());

        for num in nums {
            let old_size = set.len();

            set.insert(num);

            if old_size == set.len() {
                return true;
            }
        }

        return false;
    }
}