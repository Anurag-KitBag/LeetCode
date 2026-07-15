class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat[0].length <= 1) {
            return mat[0][0];
        }
        int diagonalsum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                //check condition which element to sum
                if(i == j || i + j + 1 == mat.length) {
                    diagonalsum += mat[i][j];
                }
            }
        }
        return diagonalsum;
    }
}