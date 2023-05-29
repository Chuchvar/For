import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int a, b, c;
        int o = 0;
        for (a = 0; a < 24; a++) {
            b = a / 10;
            c = a % 10;
            if ((c * 10 + b) < 60) {
                System.out.println(a + ":" + c + b);
                o++;
            }
        }
        System.out.println(o);
    }
}
