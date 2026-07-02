class advanced_string.java
{
    public static void main(String[]args){
        System.out.println("Count uppercase and lowercase");
        System.out.println("Method 1");
        String s="Akash Programming";
        int uppercase=0;
        int lowercase=0;
        for(int i=0;i>=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch.isUpperCase)
            {
                uppercase+=1;
            }
            else if(ch.LowerCase)
            {
                lowercase+=1;
            }
            else{
                System.out.println("its a not a letter");
            }
            System.out.println(uppercase);
            System.out.println(lowercase);
        }
    }
}