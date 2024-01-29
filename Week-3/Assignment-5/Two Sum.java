class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 用兩個for loop的暴力解
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 如果找到一對數字的和等於目標值，返回它們的索引
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // 無解返回空值
        return new int[]{};
    }
}