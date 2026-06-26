class Stringconversion
{
    public static void main (String[]args)
    {
        System.out.println("String Conversion");
        String name="25";
        System.out.println(name+5); //string+num
        System.out.println(Integer.parseInt(name)+5);
        int age=25;
        System.out.println(String.valueOf(age)+5);
    }
}