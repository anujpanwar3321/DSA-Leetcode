class Solution {
    public static void solve(int candidates[],int target,List<List<Integer>> ans,List<Integer> output,int index){
        if(target==0){
            ans.add(new ArrayList<>(output));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        if(target<0){
            return;
        }
        int currvalue = candidates[index];
        output.add(currvalue);
        solve(candidates,target-currvalue,ans,output,index);
        output.remove(output.size()-1);
        solve(candidates,target,ans,output,index+1);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index=0;
        solve(candidates,target,ans,output,index);
        return ans; 
    }
}