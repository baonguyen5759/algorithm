package com.bao.algorithm.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/*
* 88. Merge Sorted Array
* You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
* */
@Slf4j
public class Prop88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m + n -1;

        while (p2 >=0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                p1--;
            } else {
                nums1[i] = nums2[p2];
                p2--;
            }
            i--;
        }
    }

    void main() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        merge(nums1, 3, new int[] {2, 5, 6}, 3);
        log.info("Output 1: {}", Arrays.toString(nums1));

        int[] nums2 = {1};
        merge(nums2, 1, new int[] {}, 0);
        log.info("Output 2: {}", Arrays.toString(nums2));

        int[] nums3 = {1};
        merge(nums3, 0, new int[] {1}, 1);
        log.info("Output 3: {}", Arrays.toString(nums3));
    }
}
