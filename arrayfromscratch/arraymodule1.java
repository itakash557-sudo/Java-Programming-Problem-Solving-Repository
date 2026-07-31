import java.util.Arrays;
class arraymodule1
{
    public static void main(String[]args)
    {
        int [] arr={10,20,30,40,50}; //java creates a object automatically using new keyword
        int [] arrr=new int[2]; //created by using new keyword
        arrr[0]=10;
        arrr[1]=20;
        String [] str;
        str=new String[]{"akash","developer","java"};
        char [] ch;
        ch=new char[2];
        ch[0]='A';
        ch[1]='a';

        System.out.println(Arrays.toString(arrr));
        System.out.println(Arrays.toString(arr));        
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(ch));
        System.out.println(str.length);


        int[] array1={10,20,30,60,40,50,60,70};
        for(int i=0;i<array1.length;i++){ //i=5 length=6  5<6                       
            System.out.println(array1[i]);
        }
        
        //deletion element in Array 

        int [] array2={10,20,30,40,50};
        for(int i=1;i<array2.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(array2));
    }
}