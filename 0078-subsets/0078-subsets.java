class Solution {
    public static void solve(int nums[],int index,List<Integer> set,List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(set));
            return;
        }
        int currvalue = nums[index];
        set.add(currvalue);
        solve(nums,index+1,set,ans);
        set.remove(set.size()-1);
        solve(nums,index+1,set,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        int index = 0;
        solve(nums,index,set,ans);
        return ans;
    }
}