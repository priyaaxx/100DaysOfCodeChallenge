import java.util.*;
public class Day8
{
    public static boolean isPalindrome(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str=sc.next();
        boolean pal=isPalindrome(str);
        if(pal==true)
        {
        System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}