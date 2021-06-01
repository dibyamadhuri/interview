public class Test{
    
    static int a=10;


    public static void main(String[] args) {

        a=12;
        Test t=new Test();
        t.m2();
        System.out.println(a);
    }
    
    void m2(){
        a=14;
        System.out.println(a);
    }

} 