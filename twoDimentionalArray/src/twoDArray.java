public class twoDArray {
    public static void main (String args[]){
        // normal rectangular array.
        // 4 rows and 5 columns.
        int arr[][] = new int[4][5];

        // irregular size of array...
        // 4 rows...but columns are not fixed.
        int[][] arr1 = new int[4][];
        arr1[0] = new int[1]; // first row have one column
        arr1[1] = new int[2]; // second row have two column
        arr1[2] = new int[3]; // third row have three column
        arr1[3] = new int[4]; // four row have four column

        // initializing array
        int matrix[][] = {{1, 2, 3}, {1, 2, 4}, {1, 2, 3}}; // rectangular shape // 4 by 3

        for (int i = 0; i < matrix.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrix[i].length; j++) { //this equals to the column in each row.
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
