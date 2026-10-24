class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numsMap = {nums[0]: 0}
        for i in range(1, len(nums)):
            if numsMap.__contains__(target - nums[i]):
                return [numsMap[target - nums[i]], i]
            else:
                numsMap[nums[i]] = i
        return []
             