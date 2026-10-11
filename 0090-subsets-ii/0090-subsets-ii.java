class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> output = new ArrayList<>();
        int index=0;
        solve(nums,ans,output,index);
        return ans;
    }
    public static void solve(int nums[],List<List<Integer>> ans,List<Integer> output,int index){
        if(index>=nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int currvalue = nums[index];
        // include
        output.add(currvalue);
        solve(nums,ans,output,index+1);
        //exclude
        output.remove(output.size()-1);
        while( index<nums.length && currvalue==nums[index] ){
            index++;
        }
        solve(nums,ans,output,index); 
    }
}