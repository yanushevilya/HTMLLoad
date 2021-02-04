package patternSingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingletonObj implements Planet{

    public static void main(String[] args) {
        System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String r = reader.readLine();
        if (r.equals(SUN)) {
            thePlanet = Sun.getSun();
        } else if (r.equals(MOON)) {
            thePlanet = Moon.getMoon();
        } else if (r.equals(EARTH)) {
            thePlanet = Earth.getEarth();
        } else {
            thePlanet = null;
        }
        reader.close();
    }

}
