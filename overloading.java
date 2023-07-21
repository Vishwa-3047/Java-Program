 class plus {

     static int plusmethod(int x, int y) {
         return x + y;
     }

     static double plusmethod(double x, double y) {
         return x + y;
     }

     public static void main(String args[]) {
         int mynum1 = plusmethod(8,5);
         double mynum2 = plusmethod(4.54,6.26);
         System.out.println("int:" + mynum1);
         System.out.println("double:" + mynum2);
     }
 }