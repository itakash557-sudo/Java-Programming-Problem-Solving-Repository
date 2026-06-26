class Stringbuilder
{
    public static void main(String[]args)
    {
        System.out.println("String builder concept");
        StringBuilder sb=new StringBuilder("java");
        sb.append(" program");
        System.out.println(sb);
        sb.insert(12,"ming");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}