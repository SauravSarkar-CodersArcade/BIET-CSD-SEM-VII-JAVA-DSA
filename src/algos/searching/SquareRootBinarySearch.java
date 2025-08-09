package algos.searching;

public class SquareRootBinarySearch {
    public static int squareRootBinarySearch(int n){
        int s = 0;
        int e = n;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if(square == n){
                return mid;
            }
            else if(square > n){
                e = mid - 1; // Too large, go to the left
            }else {
                ans = mid;
                s = mid + 1; // Too small, store and move to right
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(squareRootBinarySearch(35));
    }
}
