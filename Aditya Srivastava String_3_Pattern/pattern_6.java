import java.util.*;
class pattern_6
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        for(int x=s.length()-1;x>=0;x--)
        {
            for(int y=0;y<x;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y<s.length();y++)
            {
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
    }
}