import java.util.*;
 class test {
    public static void main(String[] args) {
        int[][] a= new int [3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<a.length;i++) {
            for(int j=0; j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a.length;i++) {
            for(int j=0; j<a[i].length;j++) {
                if((i==0 && j==0) || (i==1 && j==0) || (i==2 && j==0)){
                    System.out.print(a[i][2]+a[i][0]+" ");
                }
                else if((i==0 && j==2) || (i==1 && j==2) || (i==2 && j==2)){
                    System.out.print(a[i][2]- a[i][0]+ " ");
                }
                else if((i==0 && j==1) || (i==1 && j==1) || (i==2 && j==1)){
                    System.out.print(a[i][j]+" ");
                }
            }System.out.println();
     }
}
}