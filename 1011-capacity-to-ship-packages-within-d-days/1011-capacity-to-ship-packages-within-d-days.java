class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int ans = -1;
        int start = maxWeight(weights);   // Changed
        int end = totalSum(weights);      // Changed

        while (start <= end) {

            int mid = start + (end - start) / 2;

            int weightSum = 0;
            int i = 0;
            int countDays = 1;            // Changed

            while (i < weights.length) {

                weightSum += weights[i];
                i++;

                if (weightSum > mid) {
                    countDays++;
                    i--;
                    weightSum = 0;
                }
            }

            if (countDays <= days) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static int maxWeight(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int totalSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}