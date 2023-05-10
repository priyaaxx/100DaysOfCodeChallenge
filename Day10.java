class Day10 {
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int l=s.length();
        int count=0;
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=32)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
   
    public static void main(String args[])
    {
        String s="My name is   ";
        int l=lengthOfLastWord(s);
        System.out.println(l);
    }
}