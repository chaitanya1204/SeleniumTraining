package Old.programs;

public class Word4 {


    public static void main(String[] args) {
        String s = "OpenTextSolutions";

        String s2 = s.replaceAll("()([A-Z])()", "$1_$2_$3");

        System.out.println(s2);

    }
}
