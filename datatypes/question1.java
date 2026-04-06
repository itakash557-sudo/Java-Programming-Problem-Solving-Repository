import java.util.Scanner;
class question1
{
    public static void main(String[]args)
    {
        System.out.println("question no:1");
        System.out.println("Take two integers and one double as input");
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the integer 1");
        int num1=src.nextInt();
        System.out.println("Integer"+ num1);
        System.out.println("Enter the integer 2");
        int num2=src.nextInt();
        System.out.println("Integer 2"+num2);
        System.out.println("Enter the double value");
        double num3=src.nextDouble();
        System.out.print("Double"+num3);
        src.close();
    
    }
}