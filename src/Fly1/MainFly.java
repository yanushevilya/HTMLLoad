package Fly1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainFly{
    public static CanFly result;

    static {
        result = reset();
    }

    public static CanFly reset() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferedReader.readLine();
            if (s.equals("Plane")) {
                result = new Plane(4);
            } else if (s.equals("Helicopter")) {
                result = new Helicopter();
            } else {
                System.out.println("Error!");
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("IO Error");
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(MainFly.result);
    }
}
