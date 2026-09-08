class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start =1;
        int end = maxof(nums);
        int ans =-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            int sum=0;
            for(int i =0;i<nums.length;i++){
                int divans = (nums[i]+mid-1)/mid;
                 sum = sum + divans;
            }
            if(sum<=threshold){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
     public static int maxof(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}