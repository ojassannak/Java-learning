// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    int n = 5;
    pattern8(n);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n; row++){
            //for every row run the col
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            //When one row is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= n; row++){
            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            //When one row is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= n; row++){
            //for every row run the col
            for (int col = 1; col <= n - row + 1 ; col++){
                System.out.print("* ");
            }
            //When one row is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 1; row <= n; row++){
            //for every row run the col
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            //When one row is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row ;
                for(int col = 0 ; col < totalColsInRow; col++){
                    System.out.print("* ");
                }
        }
    }

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){

                for(int s = 1; s <= n - row; s++){
                    System.out.print(" ");
                }
                for(int col = 1; col <= row; col++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row = 0; row <= n -1; row++){
            for(int col = 0 ; col <= row; col++){
            System.out.print(" ");
            }
            for (int col = 0 ; col < n - row - 1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int row = 0; row < n; row++){
                System.out.print(" ");
            for(int col = 0 ; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++){
            int totalColsInRow = row > n ? 2 * n - row : row ;

            int noOfSpaces = n - totalColsInRow;
                 for(int s = 0; s < noOfSpaces; s++){
                     System.out.print(" ");
                 }

            for(int col = 0 ; col < totalColsInRow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++){

            for (int space = 0; space < n - row; space++){
                System.out.print("  ");
            }

            for (int col= row; col >= 1; col--){
                System.out.print(col + " ");
            }

            for (int col= 2; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++){

            int c = row > n ?  2 * n - row : row;
            for (int space = 0; space < n - c; space++){
                System.out.print("  ");
            }

            for (int col= c; col >= 1; col--){
                System.out.print(col + " ");
            }

            for (int col= 2; col <= c; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int orignalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++){
            for (int col = 0; col <= n; col++){
                int atEveryIndex = orignalN - Math.min(Math.min(row, col), Math.min(n - row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}