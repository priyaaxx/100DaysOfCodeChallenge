import java.util.*;
public class Day4
{
    public static void countingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
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

        countingSort(arr);
        printArray(arr);
    }
}