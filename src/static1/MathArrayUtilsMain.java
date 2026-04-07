package static1;

import static static1.MathArrayUtils.*;

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = new int[] {1, 2, 3, 4, 5};
        // MathArrayUtils m = new MathArrayUtils();
        System.out.println("sum= " + sum(values));
        System.out.println("average= " + average(values));
        System.out.println("max= " + max(values));
        System.out.println("min= " + min(values));
    }
}
