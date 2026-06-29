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
        System.out.println("without methods");
        int counttt=1;
        for (int i =0;i<=countwords.length()-1;i++)
        {   
            char charr=countwords.charAt(i);
            if(charr==' ')
            {
                counttt+=1;

            }
        }
        System.out.println(counttt);
        System.out.println("with methods");

        System.out.println("using split method");
        String strr = "i love java programming";
        String[] splitWords = strr.split(" ");
        System.out.println(splitWords.length);

        System.out.println("using trim and split method");
        String[] trimmedWords = strr.trim().split("\\s+");
        System.out.println(trimmedWords.length);

        //Remove Spaces

        System.out.println("Remove Spaces");
        String rs="i love java";
        rs=rs.replace(" ","");
        System.out.println(rs);

        //convert upper to lower and lower to upper

        System.out.println("Convert upper to lower and lower to upper");
        String caase="Akash Programmer";
        caase=caase.toUpperCase();
        System.out.println(caase);
        caase=caase.toLowerCase();
        System.out.println(caase);

        //count Specific character

        System.out.println("count Specific character");
        String a="program and programming";
        char c='m';
        int cou=0;
        for (int i=0;i<=a.length()-1;i++)
        {
            char d=a.charAt(i);
            if (d==c)
            {
                cou+=1;
            }

        }
        System.out.println(cou);

        // Check String Contains Word
        System.out.println(a.contains("and"));
        //First character
        System.out.println(a.charAt(0));
        //last character
        int num=a.length()-1;
        System.out.println(a.charAt(num));
        //reverse a each word
        String sti="akash programmer and developer";
        String[] s=sti.split(" ");
        for(String wo:s)
        {
            StringBuffer sb1=new StringBuffer(wo);
            sb1=sb1.reverse();
            System.out.print(sb1+" ");
        }
    }
}





// Most Asked MNC Programs

    // Top Priority
// Reverse String
// Palindrome
// Count Vowels
// Count Characters
// Remove Spaces
// Contains
// equals()
    // Medium Priority
// Reverse Each Word
// Count Words
// Frequency of Characters
// Duplicate Characters
// Anagram