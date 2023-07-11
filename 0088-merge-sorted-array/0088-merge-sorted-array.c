void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    for (int i = 0; i < n; ++i) {
        nums1[i + m] = nums2[i];
    }
    
    sort_with_insertion_sort(nums1, m + n, m);
}

void sort_with_insertion_sort(int* nums, int size, int start_from) {
    for (int i = start_from; i < size; ++i) {
        int j = i - 1;
        int temp = nums[i];

        while (j >= 0 && nums[j] > temp) {
            nums[j + 1] = nums[j];
            j -= 1;
        }

        nums[j + 1] = temp;
    }
}