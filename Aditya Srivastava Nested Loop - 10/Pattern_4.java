class Pattern_4
{
    public static void main()
    {
        for(int x=1;x<=9;x+=2)
        {
            for(int y=1;y<x;y+=2)
            {
                System.out.print(" ");
            }
            for(int y=x;y<=9;y+=2)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}