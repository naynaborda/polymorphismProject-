public class PracticeForPolymorphism {
    //overloading Polymorphism,static or Compile time
    //return type with parameter
    //1.method overloading with changing parameter
    public static int add(int a,int b){
        return (a+b);
    }
    public static int add(int a,int b,int c)
    {
        return (a+b+c);
    }
    //2.method overloading with changing datatype
    static int add(int a,int b,String c){
        System.out.println(c);
        return (a+b);
    }
    //different example
    static double add(double a,double b)
    {
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(add(34,20));
        System.out.println(add(34,20,30));
        System.out.println(add(2,3,"prakash"));
        System.out.println(add(10.20,20.40));

    }


}
