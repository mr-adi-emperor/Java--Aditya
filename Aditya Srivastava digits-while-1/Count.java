import java.util.*;
class Count
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            n=n/10;c++;
        }
        System.out.println(c+"digits");
    }
}