package MyThreads;

public class Foo implements Runnable{
    @Override
    public void run() {
        f1();
    }

    public static synchronized void f1() {
        for(int i=0; i<99; i++) {
            System.out.println("b1 - " + i);
            Bar.b2();
        }
    }

    public static synchronized void f2() {
        for(int i=0; i<99; i++) {
            System.out.println("b2 - " + i);
        }
    }
}
