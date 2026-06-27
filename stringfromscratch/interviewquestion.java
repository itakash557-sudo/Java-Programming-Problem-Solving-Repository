class interviewquestion{
    public static void main (String[]args)
    {
        System.out.println("Interview string questions");


        //reverse a string


        System.out.println("1.)reverse a string");
        System.out.println("using method");
        StringBuilder sb=new StringBuilder("Java"); //String doesnot have a reverse method
        sb.reverse();
        System.out.println(sb);
        System.out.println("using loop");
        for(int i=sb.length()-1;i>=0;i--)
        {
            System.out.print(sb.charAt(i));
        }


        //count characters


        System.out.println("count characters");
        String s1="Akash";
        System.out.println(s1.length());
        System.out.println("using loop");
        int count=0;
        for(int i=0;i<=s1.length()-1;i++)
        {
            count+=1;
        }
        System.out.println(count);


        //count vowels

        System.out.println("Count vowels");
        StringBuffer s2=new StringBuffer("Akaaaash");
        int countt=0;
        for(int i=0;i<=s2.length()-1;i++)
        {   
            char ch=s2.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                countt+=1;
                System.out.print(ch); //print the vowels
            }
            
        }
        System.out.println(countt);


        //palindrome String

        StringBuilder palindrome=new StringBuilder("Madam");
        StringBuilder palindromereverse=new StringBuilder(palindrome);
        palindromereverse=palindromereverse.reverse();
        if(palindrome.toString().equalsIgnoreCase(palindromereverse.toString())){
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }


        //count words

        String countwords="i love java programming";
        int counttt=0;
        for (int i =0;i>=countwords.length()-1;i++)
        {   
            char charr=charAt(i);
            if(charr==" ")
            {
                count+=1;
            }
        System.out.println(count);
        }
    }
}