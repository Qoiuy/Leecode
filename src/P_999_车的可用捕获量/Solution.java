package P_999_车的可用捕获量;

public class Solution {

    public int numRookCaptures(char[][] board) {

        int Rx = 0,Ry = 0;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 'R'){

                    Rx = i;
                    Ry = j;
                }
            }
        }

        int count =0 ;
        for (int i = Rx -1; i >= 0; i--) {
            char curr = board[i][Ry];
            if (curr == '.'){
                continue;
            }else if (curr == 'B' ){
                break;
            }else if (curr == 'p'){
                count ++ ;
                break;
            }
        }
        for (int i = Rx +1; i < board.length; i++) {
            char curr = board[i][Ry];
            if (curr == '.'){
                continue;
            }else if (curr == 'B' ){
                break;
            }else if (curr == 'p'){
                count ++ ;
                break;
            }
        }
        for (int i = Ry - 1; i >= 0; i--) {
            char curr = board[Rx][i];
            if (curr == '.'){
                continue;
            }else if (curr == 'B' ){
                break;
            }else if (curr == 'p'){
                count ++ ;
                break;
            }
        }
        for (int i = Ry +1; i < board.length; i++) {
            char curr = board[Rx][i];
            if (curr == '.'){
                continue;
            }else if (curr == 'B' ){
                break;
            }else if (curr == 'p'){
                count ++ ;
                break;
            }
        }
        return count;
    }


}
