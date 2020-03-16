package Old.programs;

public class Word3 {

    public static void main(String[] args) {
        String s = "OpenTextSolutions";


        System.out.println("1st :" + s.charAt(0));
        System.out.println("2nd :" + s.charAt(1));
        char c;
        int n = 0;
        int k = s.length();
        System.out.println("k length: " + k);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            System.out.println("n value : " + n);
            c = s.charAt(n);
            System.out.println("char value: " + c);

            boolean b = Character.isUpperCase(c);
            System.out.println(b);
            if (b) {
                //  s = s.replace(String.valueOf(c), "_" + String.valueOf(s.charAt(i)));
                sb.append("_" + s.charAt(i));
            } else {
                sb.append(s.charAt(i));
            }
            n++;
          /*  if (c == 't') {
                //  s = s.replace("t", String.valueOf(n));

                s = s.replaceFirst("t", String.valueOf(n)); // 1estingt
                n = n + 1;

            }*/

        }
        System.out.println(sb);

    }
}
