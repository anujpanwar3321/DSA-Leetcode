class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int currval = nums[i];
            map.put(currval,map.getOrDefault(currval,0)+1);
        }
        for(int var: map.keySet()){
            if(map.get(var)>1){
                return true;
            }
        }
        return false;
    }
}