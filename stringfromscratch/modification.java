class modification
{
    public static void main(String[]args)
    {
        System.out.println("String Modification");
        String ss="JAVA programming";
        String s="java java java java java";
        System.out.println(s.replace("ja","JA"));
        System.out.println(s.replaceFirst("java","Python"));
        System.out.println(ss.replaceAll("[A-Z]", "#")); //regex exp
    }   
}