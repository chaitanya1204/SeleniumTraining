package Old.programs;

public class Word2 {


    public static void main(String[] args) {

        String s = "OpenText Solutions";

        //  _Open_Text _Solutions

        int n = s.length();
        int i;
        char c = 'a';
        for (i = 0; i < n; ) {

            System.out.println("i value: " + i + " ,c value: " + c);
            c = s.charAt(i);
            boolean b = Character.isUpperCase(c);
            System.out.println(b);
            if (b) {
                s = s.replace(String.valueOf(c), "_" + String.valueOf(s.charAt(i)));
            }
            i++;
        }

        System.out.println(s);

    }


}
