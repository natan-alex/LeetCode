impl Solution {
    pub fn longest_subarray(nums: Vec<i32>) -> i32 {
        let mut count = Vec::new();
        let mut ones = 0;

        for num in nums {
            if num == 1 {
                ones += 1;
            } else {
                count.push(ones);
                ones = 0;
            }
        }

        count.push(ones);

        if count.len() == 1 {
            return count[0] - 1;
        }

        let mut biggest = 0;

        for i in 0..(count.len() - 1) {
            let diff = count[i] + count[i + 1];

            if diff > biggest {
                biggest = diff;
            }
        }

        biggest
    }
}