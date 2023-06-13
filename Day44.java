public class Day44
{
    public int climbStairs(int n) {
        if ( n==0 || n==1 )
        {
            return n;
        }
        int firstStr=1;
        int secondStr=2;
        for(int i=3;i<=n;i++)
        {
            int nextStr=firstStr+secondStr;
            firstStr=secondStr;
            secondStr=nextStr;
        }
        return secondStr;
    }
}