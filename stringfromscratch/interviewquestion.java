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
        String s2="Akash";
        int countt=0;
        for(int i=0;i<=s2.length()-1;i++)
        {
            if(i=='a'||i=='A'||i=='e'||i=='E'||i=='i'||i=='I'||i=='o'||i=='O'||i=='u'||i=='U')
            {
                countt+=1;
            }
            
        }
        System.out.println(countt);
    }
}