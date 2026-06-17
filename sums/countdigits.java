import java.lang.Math;
class countdigits
{
    public static void main (String[]args)
    {
        int num=-10234;
        int count=0;
        int temp =Math.abs(num);

        if (temp==0)
        {
            count=1;
        }
        else
        {
            while(temp!=0)
            {
                temp=temp/10;
                count+=1;
            }
        }
        System.out.println(count);
    }

}