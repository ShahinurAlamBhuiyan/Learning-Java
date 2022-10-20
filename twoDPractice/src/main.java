import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        twoD[1][2] = 5;

        for (int i = 0; i < twoD.length; i++){
            for (int j = 0; j < twoD[i].length; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        // output
//        0 0 0 0 0
//        0 0 5 0 0
//        0 0 0 0 0
//        0 0 0 0 0

        System.out.println("--------Initializing---------");

        int arr[][] = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------Irregular Array---------");
        int arr1[][] = new int[4][];
        arr1[0] = new int[3];
        arr1[1] = new int[1];
        arr1[2] = new int[5];
        arr1[3] = new int[2];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("--------SPattern---------");
        int[][] sPattern = new int[12][5];

        for (int row = 0; row < sPattern.length; row++){
            for (int col = 4; col >= 0; col-- ){
                if(row + col == 3 || row - col == 3){
                    sPattern[row][col] = 5;
                }
//                sPattern[row][col-1] = 5;
            }
        }

        for (int i = 0; i < sPattern.length; i++){
            for (int j = 0; j < sPattern[i].length; j++){
                System.out.print(sPattern[i][j] + " ");
            }
            System.out.println();
        }



    }
}
