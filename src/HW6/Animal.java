package HW6;

public abstract class Animal {

    private String type;
    protected String name;
    private float maxRun;
    private float maxSwim;

    public static int counter = 0;

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    Animal(String type, String name, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++counter;
    }

    String getName() {
        return this.name;
    }
    String getType() {
        return this.type;
    }
    float getMaxRun() {
        return this.maxRun;
    }
    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }

}

