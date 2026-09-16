class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hash=new HashSet();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(hash.contains(i+"row"+board[i][j])||hash.contains(j+"col"+board[i][j])||hash.contains(i/3+"row"+j/3+"col"+board[i][j])){
                    return false;
                }
                hash.add(i+"row"+board[i][j]);
                hash.add(j+"col"+board[i][j]);
                hash.add(i/3+"row"+j/3+"col"+board[i][j]);
                
            }
        }
        return true;
    }
}
