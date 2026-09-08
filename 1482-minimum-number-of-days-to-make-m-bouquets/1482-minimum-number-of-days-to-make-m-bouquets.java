class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int ans = -1;
        int start = 0;
        int end = maxof(bloomDay);
        if ((long)m * k > bloomDay.length) {
            return ans;
        }

        while (start <= end) {

            int boqcount = 0;
            int flowercount = 0;
            int mid = start + (end - start) / 2;
            for (int i = 0; i < bloomDay.length; i++) {

                if (bloomDay[i] <= mid) {
                    flowercount++;

                    if (flowercount == k) {
                        boqcount++;
                        flowercount = 0;
                    }

                } else {
                    flowercount = 0;
                }
            }
            
            if (boqcount >= m) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
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