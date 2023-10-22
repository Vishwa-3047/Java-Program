import java.util.*;
class englishwords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        word1 = word1.replaceAll("[aeiouAEIOU]", "%");
        String word2 = sc.nextLine();
        word2 = word2.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "#");
        String word3 = sc.nextLine();
        word3 = word3.toUpperCase();
        String output = word1 + word2 + word3;
        System.out.println(output);
        sc.close();
    }
}
