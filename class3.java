public class class3{
    public static void main(String args[])
    {
        for (int a=0;a<7;a++)
        {
            for (int b=0;b<16;b++) {
                if (a==0 && b==0)
                    System.out.print("1");
                else if (a==0 && b==12) {
                    System.out.print("13");
                }
                    else if(a==1 && b==1){
                        System.out.print("2");
                    }
                    else if(a==1 && b==11){
                    System.out.print("12");

                }
                else if(a==1 && b==13){
                    System.out.print("14");

                }
                else if(a==2 && b==2){
                    System.out.print("3");

                }
                else if(a==2 && b==10){
                    System.out.print("11");

                }
                else if(a==2 && b==14){
                    System.out.print("15");

                }
                else if(a==3 && b==3){
                    System.out.print("4");

                }
                else if(a==3 && b==9){
                    System.out.print("10");

                }
                else if(a==3 && b==15){
                    System.out.print("16");

                }
                else if(a==4 && b==4){
                    System.out.print("5");

                }
                else if(a==4 && b==8){
                    System.out.print("9");

                }
                else if(a==1 && b==11){
                    System.out.print("12");

                }else if(a==5 && b==5){
                    System.out.print("6");

                }
                else if(a==5 && b==7){
                    System.out.print("8");

                }
                else if(a==6 && b==6){
                    System.out.print("7");

                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

