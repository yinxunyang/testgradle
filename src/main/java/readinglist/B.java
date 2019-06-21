package readinglist;

public class B {
    A a;
    public B(A a){
        this.a = a;
    }

    public void print(){
        a.print();
        System.out.println("From B!");
    }
}
