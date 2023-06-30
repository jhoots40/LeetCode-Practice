class Solution {
    public String tictactoe(int[][] moves) {
        int board[][] = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
        
        for(int i = 0; i < moves.length; i++) {
            if(i % 2 == 0) board[moves[i][0]][moves[i][1]] = 1;
            else board[moves[i][0]][moves[i][1]] = 2;
            
            if(i >= 4) {
                int check = checkWin(board);
                if(check != 0) return check == 1 ? "A" : "B";
            }
        }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("i: " + i + " j: " + j + "  " + board[i][j]);
            }
        }
        
        return moves.length == 9 ? "Draw" : "Pending";
    }
    
    public int checkWin(int[][] board) {
        //check horizontal rows
        for(int i = 0; i < 3; i++) {
            if(board[i][0] != board[i][1]) continue;
            if(board[i][1] != board[i][2]) continue;
            if(board[i][2] != 0) return board[i][2];
        }
        
        //check vertical rows
        for(int i = 0; i < 3; i++) {
            if(board[0][i] != board[1][i]) continue;
            if(board[1][i] != board[2][i]) continue;
            if(board[2][i] != 0) return board[2][i];
        }
        
        //check diagonals
        if(board[0][0] == board[1][1]) {
            if(board[1][1] == board[2][2]) {
                System.out.println("made it here");
                if(board[2][2] != 0) return board[2][2];
            }
        }
        
        if(board[0][2] == board[1][1]) {
            if(board[1][1] == board[2][0]) {
                if(board[2][0] != 0) return board[2][0];
            }
        }
        
        return 0;
    }
}