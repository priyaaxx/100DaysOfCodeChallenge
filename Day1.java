import java.util.*;
public class Day1
{
    public static void bubbleSorting(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
        
        bubbleSorting(arr,n);
        printArray(arr);
    }
}