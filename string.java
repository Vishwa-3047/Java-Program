import java.util.Scanner;
public class string{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arr[]=a.split(" ");
        String brr[]= new String[arr.length];
        int i=0;
        while(i != arr.length){
            int size=Integer.MAX_VALUE;
            int place=0;
            for(int j=0;j< arr.length;j++) {
                if (arr[j] != null) {
                    if (size > arr[j].length()) {
                        size = arr[j].length();
                        place = j;
                    }
                }
            }
            brr[i]=arr[place];
            arr[place]=null;
            i++;
        }
        String res ="";
        for(int j=0;j< brr.length;j++){
            res=res+brr[j]+" ";
        }
        System.out.println(res);
    }
}