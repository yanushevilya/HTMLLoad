package MyThreads;

public class Myner {

    public static void main(String[] args) {

        Foo t1 = new Foo();
        Bar t2 = new Bar();

        Thread tr1 = new Thread(t1);
        Thread tr2 = new Thread(t2);
        tr1.start();
        tr2.start();
    }


}
