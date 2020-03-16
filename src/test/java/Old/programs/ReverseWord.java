package Old.programs;

public class ReverseWord {


    public static void main(String[] args) {
        String name = "Welcome";
        String res = "";
        for (int i = name.length() - 1; i >= 0; i--) {  // i = 6
            char ch = name.charAt(i);
            res = res + ch;
        }
        System.out.println(res);

    }
}
