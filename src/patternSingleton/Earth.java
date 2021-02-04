package patternSingleton;

public class Earth implements Planet{
    // получается можно создавать объект прямо в своем классе? Что это дает?
    // И какие поля и методы будут доступны этому объекту?
    private static Earth earth;
    private Earth(){
    }

    // что дает статик у метода?
    public static Earth getEarth() {
        if (earth == null) {
            return new Earth();
        } else {
            return earth;
        }
    }
}
