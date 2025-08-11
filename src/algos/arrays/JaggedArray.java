package algos.arrays;
public class JaggedArray {
    public static void main(String[] args) {
        // 2D Array is an array of arrays r x c
        // 2D array with unequal rows is called Jagged Array
        int[][] jagged = {{1,2,3,4,5,6,7,8,9},
                          {5,6,7,8},
                          {9,8,7}};
        for (int r=0; r<jagged.length; r++){
            for (int c=0; c<jagged[r].length; c++){
                System.out.print(jagged[r][c] + " ");
            }
            System.out.println();
        }
        for (int[] arr : jagged){
            for (int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        char[][] data = {{'J','A','V','A'},{'S','Q','L'},
                {'C','+','+'}, {'P','H','P'}};
        for (char[] arr : data){
            for (char c : arr){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
