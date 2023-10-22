import java.util.Scanner;
class mergsort
{
    void merge(int a[], int beg, int mid, int end)
    {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (i = 0; i < n1; i++)
        {
            L[i] = a[beg + i];
        }
        for (j = 0; j < n2; j++)
        {
            R[j] = a[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2)
        {
            if(L[i] <= R[j])
            {
                a[k] = L[i];
                i++;
            }
            else
            {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }

        while (j<n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }
    }
    void mergeSort(int a[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }
    void printArray(int a[], int n)
    {
        int i;
        for (i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        mergsort m1 = new mergsort();
        System.out.print("Before sorting are - ");
        m1.printArray(arr, n);
        m1.mergeSort(arr, 0, n - 1);
        System.out.print("\nAfter sorting are - ");
        m1.printArray(arr, n);
        System.out.println("");
    }
}