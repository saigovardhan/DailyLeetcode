class Solution {
    public void setZeroes(int[][] matrix) {
        int[] xaxis = new int[matrix.length];
        int[] yaxis = new int[matrix[0].length];

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if (matrix[x][y] == 0) {
                    xaxis[x] = 1;
                    yaxis[y] = 1;
                }
            }
        }
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[0].length; y++) {
                if(xaxis[x]==1){
                    matrix[x][y] = 0;
                }
                if(yaxis[y] ==1){
                    matrix[x][y] = 0;
                }
            }
        }

    }
}
