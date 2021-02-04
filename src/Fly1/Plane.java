package Fly1;

public class Plane implements CanFly{
    int pass;

    @Override
    public void fly() {
        System.out.println("Plane fly");
    }

    public Plane(int pass) {
        this.pass = pass;
    }
}
