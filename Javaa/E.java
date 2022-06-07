import java.util.*;

class E {
    public static void main(String args[]) {
        int c = 0, i = 0;
        for (String a : args) {
            for (i = 0; i < a.length(); i++) {
                if (Character.isDigit(a.charAt(i)))
                    c++;
            }
        }
        System.out.println("Total digits are:" + c);
    }

}