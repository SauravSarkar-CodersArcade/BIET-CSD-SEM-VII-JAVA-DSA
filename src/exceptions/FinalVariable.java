package exceptions;
public class FinalVariable {
    final int x = 0;
    final int y;
    static final int z = 10;
    static final int a;
    FinalVariable(){
        y = 10;
    }
    static {
        a = 1000;
    }
}
