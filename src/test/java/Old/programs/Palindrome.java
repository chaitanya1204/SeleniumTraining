package Old.programs;

public class Palindrome {

    public static void main(String[] args) {
        String name = "madam";
        String res = "";
        for(int i =name.length()-1;i>=0;i--) {
            char ch = name.charAt(i);
            res = res + ch;
        }
            if(res.equals(name)){
                System.out.println("Name is palindrome" + res);
            }
            else{
                System.out.println("Name is not palindrome");
            }
        }

}
