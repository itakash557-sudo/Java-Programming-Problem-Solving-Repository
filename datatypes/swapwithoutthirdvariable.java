import java.util.Scanner;
    class swapwithoutthirdvariable
    {
    public static void main(String[]args)
    {
    Scanner src=new Scanner(System.in);
    int a=src.nextInt();
    int b=src.nextInt();

    a=a^b;   //or a=a+b
    b=a^b;   //or b=a-b
    a=a^b;   //or a=a-b

    System.out.println("value of a:"+a + "value of b:"+b);
    }
    }
