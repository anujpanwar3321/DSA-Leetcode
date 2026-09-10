class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalrows = matrix.length;
        int totalcols = matrix[0].length;
        int startrow = totalrows-1;
        int startcol = 0;
        while(startrow>=0 && startcol<=totalcols-1){
            if(matrix[startrow][startcol]==target){
                return true;
            }
            else if(matrix[startrow][startcol]<target){
                startcol++;
            }
            else{
                startrow--;
            }
        }
        return false;
    }
}