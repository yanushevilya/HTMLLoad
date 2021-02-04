package inheriting;

public class Solution {
    public static void main(String[] args) {
        SmallAnimal goose = new Goose();
        Goose gose = new Goose();
        System.out.println(goose.getSize());
        System.out.println(goose.getClass());
        System.out.println(goose.getText());
        System.out.println(goose.a);

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }

    }

    public static class SmallAnimal {
        Integer a=5;
        String getSize() {
            return "как кошка";
        }

        String getText() {
            return "jjh";
        }
    }

}
