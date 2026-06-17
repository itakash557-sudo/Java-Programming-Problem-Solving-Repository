import java.util.Scanner;
    class question4{
        public static void main(String[]args)
        {
            System.out.println("Take a number and print its square using appropriate data types");
            Scanner scr=new Scanner(System.in);
            int num=scr.nextInt();
            int result=num*num;
            System.out.println(result);

        scr.close();
        }
   }