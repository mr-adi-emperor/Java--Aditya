class Pattern_4
{
    public static void main()
    {
        int p=1;
        for(int x=1;x<=5;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print((char)(p+64));p++;
            }
            System.out.println();
        }
    }
}