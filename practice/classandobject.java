public class classandobject{
    class student{
        student() //constructor its runs the inner class statement automatically
        {
        System.out.println("this is a student class");
        }
    }
    public static void main(String[]args)
    {
        System.out.println("Class and Object Program");
        classandobject sample=new classandobject(); //first you need to create a obj for outer class thenn u create a obj for inner class 
        student s=sample.new student(); //student is non-static, it belongs to an object of classandobject,So you must create the student object using sample
        System.out.println(s);
    }
}