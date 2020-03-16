package Old.programs;

public class Swapping {


    public static void main(String[] args) {
        int a = 20, b = 30, temp;

       /* temp = a;
        a = b;
        b = temp;*/

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

    }
}
