# Find Smallest Letter Greater Than Target
LeetCode #744

Given a characters array `letters` that is sorted in non-decreasing order and a character `target`, return the smallest character in the array that is lexicographically greater than `target`.

Note that the letters wrap around. For example, if the target is `z` and there is no character greater than `z`, return the first character in the array.

You must write an algorithm with O(log n) runtime complexity.

### Example 1:

Input: letters = ["c","f","j"], target = "a"  
Output: "c"

### Example 2:

Input: letters = ["c","f","j"], target = "c"  
Output: "f"

### Example 3:

Input: letters = ["x","x","y","y"], target = "z"  
Output: "x"
