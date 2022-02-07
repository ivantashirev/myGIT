package HW6;

public class Sebek extends Animal {

    public static int howManySebek = 0;
    public static String typeClass = "Пёс";

    Sebek(String name, float maxRun, float maxSwim) {
        super(typeClass, name, maxRun, maxSwim);
        ++howManySebek;
    }
}
