import java.util.Arrays;
class deletion{
    public static void main(String[]args)
    {
        System.out.println("Deletion in array");
        int[] array={10,20,25,30,40};
        for(int i =2;i<array.length-1;i++){
            array[i]=array[i+1];
        }
    System.out.println(Arrays.toString(array));




        System.out.println("method 2"); //finding the number in array and deletion the number 
        int[]array2={10,20,30,40,45,50,60,70,80,90};
        for(int i=0;i<array2.length-1;i++)
        {
            if(array2[i]==45)
            {
                for(int j=i;j<array2.length-1;j++){
                array2[j]=array2[j+1];
                }
                System.out.print(Arrays.toString(array2));
            }

        }
    }
}