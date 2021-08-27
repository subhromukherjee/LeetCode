"""
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

"""
# Move Zeroes

# 72 ms
class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        x = nums.count(0)
        for i in range(x):
            nums.remove(0)
            nums.append(0)

"""
193 ms

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        for i in nums:
            if i == 0:
                nums.remove(0)
                nums.append(0)

"""