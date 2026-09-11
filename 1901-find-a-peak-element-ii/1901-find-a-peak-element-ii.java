class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int start = 0;
        int end = cols - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Find maximum element in mid column
            int maxRow = 0;

            for (int i = 1; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            int left = (mid > 0) ? mat[maxRow][mid - 1] : -1;
            int right = (mid < cols - 1) ? mat[maxRow][mid + 1] : -1;

            // Peak found
            if (mat[maxRow][mid] > left &&
                mat[maxRow][mid] > right) {

                return new int[]{maxRow, mid};
            }

            // Right side has a bigger element
            else if (right > mat[maxRow][mid]) {
                start = mid + 1;
            }

            // Left side has a bigger element
            else {
                end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}