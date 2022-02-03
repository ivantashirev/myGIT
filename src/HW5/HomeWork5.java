package HW5;

public class HomeWork5 {

    public static void main(String[] args) {

        Person[] array = {
                new Person("Tashirev","Ivan","Andreevich", "Junior QA","89221234567","tia@pochta.ru",50000,30),
                new Person("Сергеев","Сергей","Сергеевич","Менеджер проекта","89228765432","sss@pochta.ru",80000, 41),
                new Person("Иванов","Иван","Иванович","Разработчик","89225671234","iii@pochta.ru",60000, 39),
                new Person("Андреев","Андрей","Андреевич","Тех.директор","89226785432","aaa@pochta.ru",100000, 42),
                new Person("Павлов","Павел","Павлович","QA Lead","89221239876","ppp@pochta.ru",80000, 35),
        };

        getAllPerson(array);
        System.out.println("               ");
        getOld(array, 40);

    }

    private static void getOld(Person[] array, int age) {
        for (int i = 0; i < array.length; i++)
            if(array[i].getAge() > age) {
                System.out.println(array[i].getAllFields());
            }
    }

    private static void getAllPerson (Person[] array) {
        System.out.println("All person: ");
        for (int i = 0; i < array.length; i++)
            System.out.println((i+1) + " " + array[i].getAllFields());
    }

}
