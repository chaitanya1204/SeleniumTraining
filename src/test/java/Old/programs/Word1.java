package Old.programs;

public class Word1 {

    public static void main(String[] args) {

        String s = "OpenText Solutions";

        //   String expectedResult = "1es2ing3";


        int n = 1;
        int k = s.length();
        System.out.println("k length: " + k);
        for (int i = 0; i < k; i++) {

            char c = s.charAt(i);
            System.out.println("char value: " + c);

            if (c == 't') {
                //  s = s.replace("t", String.valueOf(n));

                s = s.replaceFirst("t", String.valueOf(n)); // 1estingt
                n = n + 1;

            }

        }

        System.out.println("Expected S: " + s);


    }


}
