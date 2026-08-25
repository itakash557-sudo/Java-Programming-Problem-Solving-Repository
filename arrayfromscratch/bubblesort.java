import java.util.Arrays;
class bubblesort
{
    public static void main(String[]args)
    {
        System.out.println("Bubble Sort");
        int[] array={10,30,80,40,20,70,50,60};
        
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int k:array){
        System.out.print(k+" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(array));
        }
    }
