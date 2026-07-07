class advanced_string
{
    public static void main(String[]args)
    {
        System.out.println("Count uppercase and lowercase");
        System.out.println("Method 1");
        String s="Akash Programming";
        int uppercase=0;
        int lowercase=0;
        int symbol=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                uppercase+=1;
            }
            else if(Character.isLowerCase(ch))
            {
                lowercase+=1;
            }
            else {
                symbol+=1;
            }
        }
            System.out.println(uppercase);
            System.out.println(lowercase);
            System.out.println(symbol);



        int lettercount=0;
        int count=0;
            String st="Akash123456";

            for(int i=0;i<=st.length()-1;i++)
            {
                char c=st.charAt(i);
                if(Character.isLetter(c))
                {
                    lettercount+=1;
                }
                else if(Character.isDigit(c)){
                    count+=1;
                }
            }
                System.out.println(lettercount);
                System.out.println(count);
            
         }
    }
