package interviewPrep;

import java.util.HashSet;
import java.util.Set;

public class leetCodeProblem extends interviewPrepProblems {
	/*
	 * 217. Contains Duplicate Given an integer array nums, return true if any value
	 * appears at least twice in the array, and return false if every element is
	 * distinct.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1] Output: true Example 2:
	 * 
	 * Input: nums = [1,2,3,4] Output: false Example 3:
	 * 
	 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105 -109 <= nums[i] <= 109
	 */

	public boolean containsDuplicate(int[] array) {
		boolean duplicate = false;
		int numberOne;
		for (int i = 0; i <= array.length; i++) {
			numberOne = array[i];

			if (numberOne == array[(array[i] - i)]) {
				duplicate = true;
				return duplicate;
			}
		}
		return duplicate;
	}

	/*
	 * Given the root to a binary tree, implement serialize(root), which serializes
	 * the tree into a string, and deserialize(s), which deserializes the string
	 * back into the tree.
	 * 
	 * For example, given the following Node class
	 * 
	 * class Node: def __init__(self, val, left=None, right=None): self.val = val
	 * self.left = left self.right = right The following test should pass:
	 * 
	 * node = Node('root', Node('left', Node('left.left')), Node('right')) assert
	 * deserialize(serialize(node)).left.left.val == 'left.left'
	 * 
	 */

	// new problem
	/*
	 * Given an integer array nums, return true if any value appears at least twice
	 * in the array, and return false if every element is distinct.
	 */
	public boolean duplicatesInArray(int[] list) {
		boolean duplicate = false;
		Set<Integer> set = new HashSet<Integer>();
		for (int x : list) {
			System.out.println("x=" + x);
			if (!set.contains(x)) {
				set.add(x);
			} else {
				System.out.println("true");
				duplicate = true;
			}
		}
		System.out.println(duplicate);
		return duplicate;
	}

}
