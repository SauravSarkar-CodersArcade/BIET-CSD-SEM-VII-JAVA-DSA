package strings;
public class PerformanceTesting {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("BIET");
        for (int i=1; i<1000000; i++){
            buffer.append("College");
        }
        System.out.println("Buffer Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis(); // reset the counter
        StringBuilder builder = new StringBuilder("BIET");
        for (int i=1; i<1000000; i++){
            builder.append("College");
        }
        System.out.println("Builder Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
    }
}
