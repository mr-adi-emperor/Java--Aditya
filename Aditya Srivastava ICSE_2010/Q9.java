class Q9 extends A
{
    public static void main(String args [])
    {
        System.out.println("Enter any String");
        String s=sc.nextLine().toUpperCase();
        
        System.out.println("CHARACTERS\tFREQUENCY");
        int l=s.length();
        for(char x='A';x<='Z';x++)
        {
            int c=0;
            for(int y=0;y<l;y++)
            {
                if(s.charAt(y)==x)
                {
                    c++;
                }
            }
            if(c>0)
            System.out.println(x+"\t\t"+c);
        }
    }
}