class Solution {
    public int diagonalSum(int[][] mat) {
        byte side = (byte)mat.length;
        short sum = 0;
        for(int i = 0; i<side; i++)
            sum+=(mat[i][i] + mat[i][side-i-1]); 
        if(side %2 != 0)
            sum-= mat[(side/2)][(side/2)];
        return sum;
    }
}