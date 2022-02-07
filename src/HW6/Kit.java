package HW6;

public class Kit extends Animal {

    public static int howManyKit =0;
    public static String typeClass = "Кошакетник";

    Kit(String name, float maxRun, float maxSwim) {
        super(typeClass, name, maxRun, maxSwim);
        ++howManyKit;
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }
}
