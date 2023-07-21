import java.util.*;
public class anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int count = 0;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < a.length(); j++) {

                    if (a.charAt(i) == b.charAt(i)) {
                        count++;
                    }
                }
            }
            System.out.println(a.length() - count + "\n it is anagram");
        }
        else
        {
            System.out.println("not anagram");
        }
    }
}