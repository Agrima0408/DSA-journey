class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <String> set = new HashSet<>();
        for(int r = 0;r<9;r++){
            for(int c = 0 ;c <9;c++){
                char ch = board[r][c];
                if(ch!='.'){
                    if(!set.add(ch + "in row " + r) || !set.add(ch + "in col "+c) || !set.add(ch+"in" +(r/3) + "and" + (c/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}