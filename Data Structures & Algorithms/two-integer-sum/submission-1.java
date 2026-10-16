class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                map.put(nums[i], new ArrayList<>(Arrays.asList(i)));
            }
        }


        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                if(target - nums[i] == nums[i]){
                    if(map.get(nums[i]).size() > 1){
                        return new int[]{map.get(nums[i]).get(0), map.get(nums[i]).get(1)};
                    }
                }else{
                    int index2 = map.get(target - nums[i]).get(0);
                    return new int[]{Math.min(i, index2), Math.max(i, index2)};
                }
            }
        }
        return null;
    }
}