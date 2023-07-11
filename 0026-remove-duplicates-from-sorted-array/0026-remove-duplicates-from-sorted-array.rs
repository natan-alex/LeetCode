impl Solution {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
        let mut k = 0;
        let mut i = 0;

        while i < nums.len() {
            nums[k] = nums[i];

            i += 1;

            while i < nums.len() && nums[i] == nums[k] {
                i += 1;
            }

            k += 1;     
        }

        k as i32
    }
}