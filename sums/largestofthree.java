import java.util.Scanner;
    class largestofthree
    {
        public static void main(String[]args)
        {
            Scanner src=new Scanner(System.in);
            int a=src.nextInt();
            int b=src.nextInt();
            int c=src.nextInt();


            if(a>=b && a>=c)
            {
                System.out.println("A is larger"+a);
            }
            else if(b>=c&&b>=a)
            {
                System.out.println("B is larger"+b);
            }
            else
            {
                System.out.println("C is larger"+c);
            }
        }
    }
