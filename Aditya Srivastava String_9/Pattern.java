import java.util.*;
class Pattern
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = sc.next();
        for(int x=0;x<s.length();x++)
        {
            for(int y=0;y<=x;y++)
            {
                System.out.print(s.charAt(x));
            }
            System.out.println();
        }
    }
}