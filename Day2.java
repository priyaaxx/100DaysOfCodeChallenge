import java.util.*;
public class Day2
{
    public static void selectionSort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter array element at index ["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        selectionSort(arr);
        printArray(arr);
    }
}