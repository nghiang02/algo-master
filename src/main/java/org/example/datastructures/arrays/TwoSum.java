package org.example.datastructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * Problem:     1. Two Sum
 * Link:        https://leetcode.com/problems/two-sum/
 * Difficulty:  Easy
 * Topic:       Arrays, Hashing
 * Pattern:     Hash map lookup (complement)
 * Date:        2026-10-19
 * Status:      Solved
 * ============================================================
 *
 * PROBLEM (in my own words)
 *   Given an int array and a target, return the indices of the two
 *   numbers that add up to the target. There is exactly one answer,
 *   and the same element can't be used twice.
 *
 * EXAMPLES
 *   Input:  nums = [2, 7, 11, 15], target = 9
 *   Output: [0, 1]
 *   Why:    nums[0] + nums[1] = 2 + 7 = 9
 *
 *   Input:  nums = [3, 3], target = 6
 *   Output: [0, 1]
 *
 * CONSTRAINTS
 *   - 2 <= nums.length <= 10^4
 *   - Exactly one valid answer exists
 *
 * ------------------------------------------------------------
 * APPROACH 1: Brute force
 *   Idea:  Try every pair (i, j) with i < j and check the sum.
 *   Time:  O(n^2)
 *   Space: O(1)
 *
 * APPROACH 2: Hash map (one pass)
 *   Idea:  For each number x, the partner I need is target - x.
 *          Keep a map of value -> index for numbers already seen,
 *          so checking for the partner is O(1).
 *   Steps:
 *     1. Loop through nums with index i.
 *     2. need = target - nums[i]
 *     3. If need is in the map, return [map.get(need), i].
 *     4. Otherwise put nums[i] -> i in the map.
 *   Time:  O(n)
 *   Space: O(n)
 *
 * ------------------------------------------------------------
 * NOTES
 *   Key insight:   Trade memory for speed: "have I seen the complement?"
 *                  is a hash map lookup instead of an inner loop.
 *   Edge cases:    Duplicates like [3, 3]: check the map BEFORE inserting,
 *                  so an element never pairs with itself.
 *   Mistakes I made: <fill in>
 *   Similar problems: 167. Two Sum II (sorted -> two pointers), 15. 3Sum
 * ============================================================
 */
public class TwoSum {

    // Approach 1: Brute force — O(n^2) time, O(1) space
    public static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // Approach 2: Hash map — O(n) time, O(n) space
    public static int[] optimal(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (seen.containsKey(need)) {
                return new int[]{seen.get(need), i};
            }
            seen.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        check(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        check(new int[]{3, 2, 4}, 6, new int[]{1, 2});
        check(new int[]{3, 3}, 6, new int[]{0, 1});
    }

    private static void check(int[] nums, int target, int[] expected) {
        int[] brute = bruteForce(nums, target);
        int[] fast = optimal(nums, target);
        boolean ok = Arrays.equals(brute, expected) && Arrays.equals(fast, expected);
        System.out.printf("%s nums=%s target=%d -> brute=%s optimal=%s expected=%s%n",
                ok ? "PASS" : "FAIL", Arrays.toString(nums), target,
                Arrays.toString(brute), Arrays.toString(fast), Arrays.toString(expected));
    }
}
