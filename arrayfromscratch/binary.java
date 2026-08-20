class binary{
    public static void main(String[]args)
    {
        System.out.println("Binary Search");
        int[] arr={10,20,30,40,50,60,70};
        int low=0;
        int high=arr.length -1;
        int target=50;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                System.out.println("Target found "+arr[mid]);
                break;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1; 
            }
        }
    }
}