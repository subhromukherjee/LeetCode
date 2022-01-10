class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        """
        nums = collections.deque(nums)

        nums.rotate(k)

        nums = list(nums)
        print(nums)
        
        """
        """
        for i in range(k):
            nums=nums[-1:]+nums[:-1]
        print nums
        
        """
        for i in range(k):
            nums.insert(0,nums.pop())
