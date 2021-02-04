package patternSingleton;

public class Moon implements Planet{
    // получается можно создавать объект прямо в своем классе? Что это дает?
    // И какие поля и методы будут доступны этому объекту?
    private static Moon moon;
    private Moon(){
    }

    // что дает статик у метода?
    public static Moon getMoon() {
        if (moon == null) {
            return new Moon();
        } else {
            return moon;
        }
    }
}
