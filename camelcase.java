import java.util.*;
public class camelcase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = sc.nextLine();
        String c="";
        c=c+String.valueOf(a.charAt(0)).toUpperCase();
        for(int i=1;i<a.length();i++){
            if (a.charAt(i) == ' ') {
                c=c+" "+String.valueOf(a.charAt(i+1)).toUpperCase();
                i++;
            }else
            {
                c=c+a.charAt(i);
            }
        }
        System.out.println(c);
    }
}