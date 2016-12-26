package DataStructure;

import java.util.ArrayList;

public class WordSearch2 {
	public ArrayList<String> wordSearchII(char[][] board, ArrayList<String> words) {
        // write your code here
        ArrayList<String> res = new ArrayList<String>();
        if(words.size() == 0 || board.length == 0){
            return res;
        }
        Trie root = buildTree(words);
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                dfs(i, j, root, board, res);
            }
        }
        return res;
    }
    
    public void dfs(int i, int j, Trie root, char[][] board, ArrayList<String> res){
        char c = board[i][j];
        if(c == '*' || root.children[c - 'a'] == null){
            return;
        }
        root = root.children[c - 'a'];
        if(root.word != null){
            res.add(root.word);
            root.word = null;
        }
        board[i][j] = '*';
        if(i > 0){
            dfs(i - 1, j, root, board, res);
        }
        if(j > 0){
            dfs(i, j - 1, root, board, res);
        }
        if(i < board.length - 1){
            dfs(i + 1, j, root, board, res);
        }
        if(j < board[0].length - 1){
            dfs(i, j + 1, root, board, res);
        }
        board[i][j] = c;
    }
    public Trie buildTree(ArrayList<String> words){
        Trie root = new Trie();
        for(String s : words){
            Trie node = root;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(node.children[c - 'a'] == null){
                    node.children[c - 'a'] = new Trie();
                }
                node = node.children[c - 'a'];
            }
            node.word = s;
        }
        return root;
    }
}

class Trie{
    String word;
    Trie[] children = new Trie[26];
}

