package inheriting;

public class Goose extends Solution.SmallAnimal{

    Integer a = 10;

    static int b = 11;

    @Override
    String getSize() {
        return "Гусь маленький, " + super.getSize();
    }

    @Override
    String getText() { return "text"; }

    String gooseMet() {return "gooseMet" ; }
}
