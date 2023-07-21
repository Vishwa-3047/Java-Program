import java.util.*;

class Employee{
    public static String[][] details(){
        Scanner e = new Scanner(System.in);
        System.out.println("Enter Employee Details (Id,Name,age,Dept,mobile) : ");
        String a[][] = new String[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                a[i][j]=e.next();
            }
        }
        return a;
    }
}

class Employee1{
    void display(String[][] a){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter emp Id you want : ");
        int id = sc.nextInt();
        if(id == 1){
            for(int i=0;i<1;i++){
                for(int j=0;j<5;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        else if(id == 2){
            for(int i=1;i<2;i++){
                for(int j=0;j<5;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        else if(id == 3){
            for(int i=2;i<3;i++){
                for(int j=0;j<5;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        else if(id == 4){
            for(int i=3;i<4;i++){
                for(int j=0;j<5;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        else if(id == 5){
            for(int i=4;i<5;i++){
                for(int j=0;j<5;j++){
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}

public class class1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee1 e1 = new Employee1();
        String[][] details = e.details();
        e1.display(details);
    }
}
