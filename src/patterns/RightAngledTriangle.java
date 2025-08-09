package patterns;
public class RightAngledTriangle {
    public static void printRightAngledTriangle(int n){
        for (int r=1; r<=n; r++){
            for (int c=1; c<=r; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRightAngledTriangle(5);
    }
}
