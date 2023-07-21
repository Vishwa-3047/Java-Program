import java.util.*;

class sd{
    void matrix(){
        int[][] m= new int [3][3];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<m.length;i++) {
            for(int j=0; j<m[i].length;j++){
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for (int i=0;i<m.length;i++) {
            for(int j=0; j<m[i].length;j++) {
                if((i==0 && j==0) || (i==2 && j==0) ||(i==0 && j==2) || (i==2 && j==2)){
                    System.out.print(m[i][j]+m[1][1]+" ");
                }
                else if((i==1 && j==1)){
                    System.out.print(m[i][j]+" ");
                }
                else if(i==0 && j==1){
                    int a=m[0][1]+m[0][0];
                    if(a>9){
                        System.out.print("D ");
                    }
                    else{
                        System.out.print("S ");
                    }
                }
                else if(i==2 && j==1){
                    int a=m[1][2]+m[0][0];
                    if(a>9){
                        System.out.print("D ");
                    }
                    else{
                        System.out.print("S ");
                    }
                }
                else if(i==1 && j==0){
                    int a=m[1][0]+m[2][1];
                    if(a>9){
                        System.out.print("D ");
                    }
                    else{
                        System.out.print("S ");
                    }
                }
                else if(i==1 && j==2){
                    int a=m[2][1]+m[1][2];
                    if(a>9){
                        System.out.print("D ");
                    }
                    else{
                        System.out.print("S ");
                    }
                }
            }System.out.println();
        }
    }
}

public class sd_matrix{
    public static void main(String[] args) {
        sd s=new sd();
        s.matrix();
}
}