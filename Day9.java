import java.util.*;
public class Day9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1=sc.next();
        System.out.print("Enter string 2 : ");
        String str2=sc.next();
        int l1=str1.length();
        int l2=str2.length();
        if(l1==l2)
        {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();

            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean flag = true;
            for(int i=0;i<l1;i++)
            {
                if(ch1[i]!=ch2[i])
                {
                    flag=false;
                    System.out.println("Not anagram");
                    break;
                }
            }
            if(flag==true){
            System.out.println("Anagrams");
            }

        }
        else
        {
            System.out.println("Not anagrams");
        }
    }
}