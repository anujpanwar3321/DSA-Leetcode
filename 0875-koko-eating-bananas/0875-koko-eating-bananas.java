class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = maxof(piles);
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            long count = 0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<=mid){
                    count++;
                }
                else{
                count += (int) Math.ceil((double) piles[i] / mid);
                }

            }
            if(count <= h){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            
        }
        return ans;
    }
    public static int maxof(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = Math.max(arr[i],max);
            }
            else{
                continue;
            }
        }
        return max;
    }
}