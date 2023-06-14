public class Day45
{
    public static boolean isHappy(int n) {
       int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));

        while (slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }

    return slow == 1;
    }

    private static int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
    return sum; 
    }

    public static void main(String args[])
    {
        boolean flag=isHappy(19);
        if(flag==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}