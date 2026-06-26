class stringbuffer{
    public static void main(String[]args){
        System.out.println("string buffer");
        StringBuffer sb=new StringBuffer("java");
        StringBuffer sb2=new StringBuffer(" programming");
        sb=sb.append(sb2);
        System.out.println(sb);
        sb.insert(2,'J');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb3=new StringBuffer();
        System.out.println(sb3.capacity()); //creates a 16 space 
        System.out.println("String buffer is for thread safety");

    }
}