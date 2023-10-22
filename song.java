import java.util.*;
public class song {

    public static boolean isMelody(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        int f = freq[s.charAt(0) - 'a'];
        for (int i = 1; i < 26; i++) {
            if (freq[i] != 0 && freq[i] != f) {
                return false;
            }
        }
        return true;
    }


    public static int minDays(String song) {

        int minDays = 0;

        int pointer = 0;

        while (pointer < song.length()) {

            int len = 1;

            while (pointer + len <= song.length() && !isMelody(song.substring(pointer, pointer + len))) {
                len++;
            }

            minDays++;
            pointer += len;
        }
        return minDays;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a song string:");

        String song = sc.nextLine();

        sc.close();

        System.out.println("The minimum number of days to teach " + song + " is " + minDays(song));
    }
}
