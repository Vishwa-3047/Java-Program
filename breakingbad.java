public class breakingbad {
    public static void main(String[] args) {
        String str = "BREAKINGBAD";
        int length = str.length();

        for (int i = 2; i <= length; i += 2) {
            String substring = str.substring(0, i);
            if (i % 4 == 2) {
                substring = substring.replaceFirst("A", "R");
            } else {
                substring = substring.replaceFirst("R", "E");
            }
            System.out.println(substring);
 }
}
}