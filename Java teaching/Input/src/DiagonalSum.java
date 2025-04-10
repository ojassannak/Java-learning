public class DiagonalSum {
    public static void main(String[] args) {
        int[][]  mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int count = diagonalSum(mat);
        System.out.println(count + "");
    }
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            count += mat[i][i] + mat[i][n-i-1];
        }
        if(n%2==0){
            return count;
        }
        else{
            return count - mat[n / 2][n / 2];
        }
    }
}
