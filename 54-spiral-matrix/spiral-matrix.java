class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int startingRow=0;
        int startingCol=0;
        int endRow=m-1;
        int endCol=n-1;
        List<Integer> ans= new ArrayList<>();
        while(startingRow<=endRow && startingCol<=endCol){
        for(int col=startingCol;col<=endCol;col++){
                ans.add(matrix[startingRow][col]);
            }
            startingRow++;
        for(int row=startingRow;row<=endRow;row++){
                ans.add(matrix[row][endCol]);
        }
            endCol--;
            if(startingRow<=endRow){
        for(int col=endCol;col>=startingCol;col--){
                ans.add(matrix[endRow][col]);
            }
            endRow--;
            }
            if(startingCol<=endCol){
        for(int row=endRow;row>=startingRow;row--){
                ans.add(matrix[row][startingCol]);
        }
             startingCol++;
            }
    }
    return ans;
}
    
}