package HW6;

public class Zoo {
    public static void main(String[] args) {

        String yes = " может";
        String no = " не может.";
        String sobitie;
        String itog;

        /*
        Бег: Кот - 200 м. Собака - 500 м.
        Плавание: Кот, как ни странно, плавать не может, или не хочет. Собака - 10 м (наверное, против течения).
         */

        Kit kit1 = new Kit("Шерстяной", 10, 25);
        Kit kit2 = new Kit("Рыжий", 100,15);
        Kit kit3 = new Kit("Тыгыдык", 500,300);
        Sebek sebek1 = new Sebek("Анукафу", 30.7f, 96);
        Sebek sebek2 = new Sebek("Шарик", 450, 8);
        Sebek sebek3 = new Sebek("Каштанка", 1.4f,  3f);

        Animal[] animals = {kit1,kit2,kit3,sebek1,sebek3,sebek2};

        float runDistance = 170;
        float swimDistance = 5;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может";

            sobitie = " пробежать на " + animals[i].getMaxRun() + " м. Очень старается пробежать на ";
            itog = animals[i].run(runDistance) ? yes : no;
            result(nameString, sobitie, runDistance, itog);

            int swimItog = animals[i].swim(swimDistance);
            sobitie = " проплыть " + animals[i].getMaxSwim() + " м. Еще больше старается проплыть ";
            itog = (swimItog == Animal.SWIM_OK) ? yes : no;

            if (swimItog == Animal.SWIM_NONE)
                itog = " но безуспешно. Это же котик, чего от него ждать в воде?";
            result(nameString, sobitie, swimDistance, itog);
        }

        System.out.println("Vsego: " + Animal.counter + " | Kotikov: " + Kit.howManyKit + " | Sebekov: " + Sebek.howManySebek);

    }

    private static void result (String nameAnimal, String event, float evenDistance, String resultEvent) {
        System.out.println(nameAnimal + event + evenDistance + " м и " + resultEvent);
    }
}
