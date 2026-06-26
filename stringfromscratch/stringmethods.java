class stringmethods{
    public static void main(String[]args)
    {
    System.out.println("String methods");
    String name="Java Programming";
    String name2=" welcome";
    System.out.println(name.length()); //used tofind the length of the string
    System.out.println(name.indexOf('P')); //if the char is not present in the string then it will return the -1
    System.out.println(name.charAt(5)); //returns the chr in that specific index
    System.out.println(name.substring(2,5)); //extract the specific part from the string
    System.out.println(name.lastIndexOf('g')); //search from last 
    System.out.println(name.contains("java"));
    System.out.println(name.startsWith("Ja"));
    System.out.println(name.endsWith("ing"));
    System.out.println(name.isEmpty());
    System.out.println(name.trim());//removes the space from start and end
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.concat(name2));
    }
}