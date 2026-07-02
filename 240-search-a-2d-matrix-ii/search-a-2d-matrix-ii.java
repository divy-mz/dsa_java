class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //int totalRow=matrix.length;
        //int totalCol=matrix[0].length;
        //int n=totalRow*totalCol;
        int r=0;
        int c=matrix[0].length-1;                                                             
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return true;
            }
            else if(matrix[r][c]>target){
                c--;

            }
            else{
                r++;
            }
        }
        return false;
        
    }
}
                                                            // low value <-[]
                                                            //              | high value