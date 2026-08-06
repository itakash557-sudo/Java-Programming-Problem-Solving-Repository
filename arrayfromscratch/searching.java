import java.util.Arrays;
class searching
{
    public static void main(String[]args)
    {
        System.out.println("Searching element in Array");
        String[] Array={"Akash","Technology","IT","Developer"};
        String target="akash";
        boolean found=false;
        for (int i=0;i<Array.length;i++)
        {
            if(Array[i].equalsIgnoreCase(target))
            {
                System.out.println("target element is found");
                System.out.println("index value "+i);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("not found");
        }
    }
}