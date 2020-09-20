//Java Solution

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        return dfs(nums, start, end);
    }
    
    public TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, start, mid - 1);
        root.right = dfs(nums, mid + 1, end);
        
        return root;
    }
}