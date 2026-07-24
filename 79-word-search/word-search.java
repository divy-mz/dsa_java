class Solution {
        static boolean safe(char[][] board, String word,int row,int col,int loc,boolean[][] visited){
            if(row<0 || row>=board.length || col<0 || col>=board[0].length){
                return false;
            }
            else if(board[row][col]!=word.charAt(loc)){
                return false;
            }
            else if(visited[row][col]==true){
                return false;
            }
            else {
                return true;
            }
            
        }
        static boolean solve(char[][] board, String word,int i,int j,int index,boolean[][] visited){
            if(index==word.length()){
                return true;
            }
            if(!safe(board,word,i,j,index,visited)){
                return false;
            }
            visited[i][j]=true;
            if(solve(board,word,i-1,j,index+1,visited)){
            return true;
            }

            if(solve(board,word,i+1,j,index+1,visited)){
            return true;
            }

            if(solve(board,word,i,j-1,index+1,visited)){
            return true;
            }

            if(solve(board,word,i,j+1,index+1,visited)){
            return true;
            }

            visited[i][j]=false;
            return false;


        }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        int index=0;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(solve(board,word,i,j,index,visited)){
                    return true;

                }
            }
        }
        return false;
        
    }
}