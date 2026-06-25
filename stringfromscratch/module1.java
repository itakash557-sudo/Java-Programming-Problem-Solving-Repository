class module1
{
    public static void main(String[]args)
    {
        System.out.println("String literal");
        System.out.println("stored in String constant pool (scp)");

        String s1="java";
        String s2="java"; //object create in string constant pool and s1 and s2 points the same object
        System.out.println(s1==s2);  //obj=1



        System.out.println("String object");
        System.out.println("heap memory");

        String s3=new String("java");
        String s4=new String("java"); //stores in different memory
        System.out.println(s3==s4); //obj=2 already java exist in string pool 




        System.out.println("Strings are immutable");
        System.out.println("it will modify the old obj and new obj is created and variable points to the new obj");
        String s5=new String("java programming");
        System.out.println(s5+".com"); //without storing the value  
        System.out.println(s5);
        String s6=new String("java");
        s6=s6+" new programming"; //it stores or create a new object and s6 points to new obj 
        System.out.println(s6);


        System.out.println("string comparison");
        System.out.println(s1==s2);//checks the memory location or address
        System.out.println(s1.equals(s3)); //checks the content
        String s7="JAVA";
        String s8=new String("java");
        System.out.println(s7.equalsIgnoreCase(s8)); //it ignores the upper and lower case
        String s9="Apple";
        String s10="Banana";
        System.out.println(s9.compareTo(s10)); // gives the negative value A=65 B=66 (A-B=negative value)(65-66=-1)
        String s11="Banana";
        String s12="Apple";
        System.out.println(s11.compareTo(s12)); //used in sorting
        String s13="apple";
        String s14="Banana";
        System.out.println(s13.compareTo(s14));
        System.out.println(s13.compareToIgnoreCase(s14)); //it ignores the upper and lower case 
        String s15="Apple";
        String s16="apple";
        System.out.println(s15.compareToIgnoreCase(s16)); //if the value is same then return zero
        }



}