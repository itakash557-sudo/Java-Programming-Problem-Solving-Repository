import java.util.Scanner;
class question2{

    public static void main (String[] args)
    {
    System.out.println("Write a program to take an integer and print whether it is even or odd");
    Scanner src=new Scanner(System.in);
    int num=src.nextInt();
    if (num % 2==0)
    {
        System.out.println("even");
    }
    else
    {
        System.out.println("odd");
    }
    }
}