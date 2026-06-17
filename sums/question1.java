import java.util.Scanner;
class question1
{
    public static void main(String[]args)
    {
        System.out.println("question no:1");
        System.out.println("Take two integers and one double as input");
        System.out.println("Add the two integers");
        System.out.println("Multiply the result with the double");
        System.out.println("print result");
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the integer 1");
        int num1=src.nextInt();
        System.out.println("Enter the integer 2");
        int num2=src.nextInt();
        int add1=num1+num2;
        System.out.println("Enter the double value");
        double num3=src.nextDouble();
        double result=add1*num3;
        System.out.println(result);
        src.close();
    
    }
}