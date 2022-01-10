import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }

    public static int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            result ^= start + 2 * i;
        }
        return result;
    }

}
