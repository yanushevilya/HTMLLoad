package patternSingleton;

public class Sun implements Planet{

    // получается можно создавать объект прямо в своем классе? Что это дает?
    // И какие поля и методы будут доступны этому объекту?
    private static Sun sun;
    private Sun(){
    }

    // что дает статик у метода?
    public static Sun getSun() {
        if (sun == null) {
            return new Sun();
        } else {
            return sun;
        }
    }
}
