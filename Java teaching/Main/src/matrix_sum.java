public class matrix_sum {
    public static long main(String[] args) {
      int[][] matrix = {{1,2,3},{-1,-2,-3},{1,2,3}};
        System.out.println(maxMatrixSum(matrix));
        public long maxMatrixSum(int[][] matrix) {
            int row;
            int col;
            long sum =0;
            for(row = 0; row<= matrix.length; row++){
                for(col = 0; col <= matrix.length; col++){
                    sum = row * col;
                }
            }
            return sum;
        }
    }
}
