use std::collections::HashSet;

impl Solution {
    pub fn length_of_longest_substring(s: String) -> i32 {
        let string_length = s.len();
        let mut maximum_substring_length = 0;
        let mut substring = HashSet::with_capacity(string_length);

        for i in 0..string_length {
            substring.clear();
            
            let mut chars = s.chars().skip(i);

            while let Some(c) = chars.next() {
                if substring.contains(&c) { break; }
                substring.insert(c);
            }
            
            let substring_length = substring.len();

            if substring_length > maximum_substring_length {
                maximum_substring_length = substring_length;
            }
        }
        
        maximum_substring_length as i32
    }
}