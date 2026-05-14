class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for(int i = 0; i<n; i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                char cell = board[r][c];
                if(cell == '.'){
                    continue;
                }

                int boxIndex = 3 * (r/3) + (c/3);
                if(rows[r].contains(cell) || cols[c].contains(cell) || boxes[boxIndex].contains(cell)){
                    return false;
                }

                rows[r].add(cell);
                cols[c].add(cell);
                boxes[boxIndex].add(cell);
            }
        }

        return true;
    }
}
