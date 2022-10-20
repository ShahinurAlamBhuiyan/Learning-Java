public class array {
    public static void main (String args[]){
        // 11111111
        int arr[] = new int[10];
        arr[0] = 5;
        arr[9] = 10;
        for (int k = 0; k < arr.length; k++){
            System.out.println(arr[k]);
        }

        // 222222222
        System.out.println("___________");
        int arr1[];
        arr = new int[5];
        for (int x: arr){
            System.out.println(arr[x]);
        }

        // 33333333
        System.out.println("___________");
        int size = 5; // we can take it from user.
        int arr4[];
        arr4 = new int[size];
        for (int x: arr4){
            System.out.println(arr4[x]);
        }

        // 4444444444444444
        System.out.println("___________");
        int arr2[] = {1, 2, 3, 4, 5};
        for (int y: arr2){
            System.out.println(arr2[y]);
        }


        // 55555555
        System.out.println("___________");
        int arr5[]; // both are same.
        int []arr6;// both are same.

        int [] arr7, a5, arr8; // here each variable represented each array.
        int arr9[], a, k, arr10[];// here a, k is integer variable & arr9 , arr10 are array.
    }
}
