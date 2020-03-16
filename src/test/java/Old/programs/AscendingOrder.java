package Old.programs;

import java.util.Arrays;

public class AscendingOrder {

    public static void main(String[] args) {
        int[] a = {3, 5, 2, 1, 4}; // 0 1 2 3 4
        int minVal;
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            minVal = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (minVal < a[j]) {
                    minVal = a[j];
                    a[j] = a[i];
                    a[i] = minVal;
                }
            }

        }
        System.out.println(Arrays.toString(a));


    }


}
