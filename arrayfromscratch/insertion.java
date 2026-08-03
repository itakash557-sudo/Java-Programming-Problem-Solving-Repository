import java.util.Arrays;
class insertion
{
    public static void main(String[] args){
        System.out.println("Insertion in Array");
        int[] array1={10,20,40,50};
        System.out.println("before:Array "+Arrays.toString(array1));

        int[] newarray=new int[array1.length+1];
        int indexvalue=2;
        int value=30;
        for(int i=0;i<indexvalue;i++)
        {
            newarray[i]=array1[i];
        }    
        newarray[indexvalue]=value;
        for(int i=indexvalue;i<array1.length;i++)
        {
            newarray[i+1]=array1[i];
        }
        System.out.println("After:Array "+Arrays.toString(newarray));
        }
}