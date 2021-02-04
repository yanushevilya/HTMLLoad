package inheriting;

public class Dragon extends Solution.BigAnimal {

    @Override
    protected String getSize() {
        return "Дракон большой, " + super.getSize();
    }
}
