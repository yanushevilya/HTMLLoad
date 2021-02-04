package MyThreads;

public class Bar implements Runnable{

    @Override
    public void run() {
        b1();
    }

    public static synchronized void b1() {
        for(int i=0; i<99; i++) {
            System.out.println("b1 - " + i);
            Foo.f2();
        }
    }

    public static synchronized void b2() {
        for(int i=0; i<99; i++) {
            System.out.println("b2 - " + i);
        }
    }
}
