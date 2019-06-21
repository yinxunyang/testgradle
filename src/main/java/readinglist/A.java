package readinglist;

public class A {
    /*   public A(){
           new B(this).print();
       }*/
    public A() {
        new B(this).print();
    }

    public void print() {
        System.out.println("From A!");
    }

    public static void main(String[] args) {
        new A();
    }
}
