package static1;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성을 막는다
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }

        return sum;
    }

    static double average(int[] array) {
        return (double)sum(array) / array.length;
    }

    static int min(int[] array) {
        int min = 0;
        min = 2147483647;
        for (int i : array) {
            if (min > i)
                min = i;
        }

        return min;
    }

    static int max(int[] array) {
        int max = 0;
        max = -2147483648;
        for (int i : array) {
            if (max < i)
                max = i;
        }

        return max;
    }
}
