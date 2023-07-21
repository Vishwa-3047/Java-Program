class adjinv
{
    public static void main(String args[]){
        int a[][]={{2,2},{6,8}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
            {
                if(i==0 && j==0){
                    System.out.print(a[1][1]+" ");
                }
                else if(i==1 && j==1)
                {
                    System.out.print(a[0][0]+" ");
                }
                else if(i==0 && j==1)
                {
                    System.out.print(-(a[0][1])+" ");
                }
                else if(i==1 && j==0)
                {
                    System.out.print(-(a[1][0])+" ");
                }
            }System.out.println();
        }
        System.out.println();


        float inv[][]=new float[2][2];
        float det=(a[0][0]*a[1][1] - a[0][1]*a[1][0]);
        inv[0][0]=a[1][1]/det;
        inv[1][1]=a[0][0]/det;
        inv[1][0]=-a[1][0]/det;
        inv[0][1]=-a[0][1]/det;

        for(int i=0;i<inv.length;i++)
        {
            for(int j=0;j<inv[i].length;j++)
            {
                System.out.print(inv[i][j]+" ");
            }
            System.out.println();
        }
    }
}