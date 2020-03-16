package Old.programs;

import java.util.Arrays;

public class DesendingOrder {
    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        int maxval;
        for (int i = 0; i < a.length - 1; i++) {
            maxval = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (maxval < a[j]) {
                    maxval = a[j];
                    a[j] = a[i];
                    a[i] = maxval;

                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
