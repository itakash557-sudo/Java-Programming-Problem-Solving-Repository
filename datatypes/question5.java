class question5{
    public static void main(String[]args)
    {
        System.out.println("Write a program to swap two numbers without using a third variable");
        int a=10;
        int b=20;
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println(a);
        System.out.println(b);
    }
}