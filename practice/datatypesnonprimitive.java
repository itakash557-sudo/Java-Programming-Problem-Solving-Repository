import java.util.Arrays;
class datatypesnonprimitive
{
    public static void main(String[]args)
    {

        // //String

        // String s1="java";
        // String s2="java";
        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.println(s1==s2); //both are in same memory location (uses string pool)

        // String st1=new String("java");
        // String st2=new String("java");
        // System.out.println(st1==st2); //different obj and memory

        // /* if u want to check the the value is same or not use .equals() */
        // System.out.println(s1.equals(st2));
        // System.out.println(st1.equals(st2));



        // /* Strings are immutable */
        // String st3=new String("Akash");
        // String st4=new String("Akash");
        // String st5=new String();
        // System.out.println(st3+st4);
        // System.out.println(st4);


        // String oldRef=new String("Akash");
        // String st6 = oldRef;
        // st6="programmer";
        // System.out.println(oldRef);
        // System.out.println(st6);


        //Array

        int[]array1=new int[4];
        array1[0]=10;
        System.out.println(Arrays.toString(array1));

        int[] array2={10,20,30,40,50};
        System.out.println(Arrays.toString(array2));
        array2[0]=20;
        System.out.println(Arrays.toString(array2));
        }
}