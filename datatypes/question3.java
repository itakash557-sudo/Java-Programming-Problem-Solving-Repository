import java.util.Scanner;
    class question3
{
    
    public static void main(String[] args)
    {
        System.out.println("Take a character input and check whether it is a vowel or consonant");
        Scanner src=new Scanner(System.in);
        char ch=src.next().charAt(0);

        if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("vowel");
        }
        else
        {
            System.out.println("Consonent");
        }
    src.close();
    }

}
