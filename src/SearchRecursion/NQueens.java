package SearchRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class NQueens {
	ArrayList<ArrayList<String>> solveNQueens(int n) {
        // write your code here
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        if(n == 0){
            return res;
        }
        char[][] board = new char[n][n];
		for (int i = 0; i < n; i++){
			Arrays.fill(board[i], '.'); 
		}
        boolean[] op90 = new boolean[n];
        boolean[] op45 = new boolean[2 * n - 1];
        boolean[] op135 = new boolean[2 * n - 1];
        solve(board, 0, n, op90, op45, op135, res);
        return res;
     }
     
     public void solve(char[][] board, int level, int n,boolean[] op90, boolean[] op45, boolean[] op135, ArrayList<ArrayList<String>> res){
         if(level == n){
             add(board, res);
             return;
         }
         for(int i = 0; i < n; i++){
             if(!op90[i] && !op45[i + level] && !op135[n - level + i - 1]){
                 op90[i] = true;
                 op45[i + level] = true;
                 op135[n - level + i - 1] = true;
                 board[level][i] = 'Q';
                 solve(board, level + 1, n, op90, op45, op135, res);
                 board[level][i] = '.';
                 op90[i] = false;
                 op45[i + level] = false;
                 op135[n - level + i - 1] = false;
             }
         }
     }
     
     public void add(char[][] board, ArrayList<ArrayList<String>> res){
         ArrayList<String> list = new ArrayList<String>();
         for(int i = 0; i < board.length; i++){
             String s = String.valueOf(board[i]);
             list.add(s);
         }
         res.add(list);
     }
}
