package util;

public class InputTest {

    public static void main(String[] args) {
        Input test = new Input();
        System.out.println(test.getInteger());
        System.out.println(test.getDouble());
        System.out.println(test.getInteger(1,10));
        System.out.println(test.getDouble(1,10));
        System.out.println(test.getString());
        System.out.println(test.yesNo());

    }
}
