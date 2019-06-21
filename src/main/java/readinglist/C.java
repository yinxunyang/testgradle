package readinglist;

public class C {
    int i = 1;

    public C() {
        Thread thread = new Thread() {
            public void run() {
                for (; ; ) {//表示是死循环
                    C.this.run();//调用外部方法run()
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };//注意这里有分号;
        thread.start();
    }

    public void run() {
        System.out.println("i = " + i);
        i++;
    }

    public static void main(String[] args) throws Exception {
        new C();
    }
}
