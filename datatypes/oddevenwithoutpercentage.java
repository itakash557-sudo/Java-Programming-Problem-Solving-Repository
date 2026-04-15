// approach 1

import java.util.Scanner;
class oddevenwithoutpercentage
{

    public static void main(String[]args)
    {
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();

        if ((num&1)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}

// approaach 2
// int num=10;
// if ((num/2)*2==num)
// {
//     System.out.println("even");
// }
// else
// {
//     System.out.println("odd");
// }
