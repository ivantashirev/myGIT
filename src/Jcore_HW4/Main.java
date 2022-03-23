package Jcore_HW4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /* 1. Массив с набором слов, где встречаются повторяющиеся,
    чтоб потом , как настоящие молодцы вывести список уникальных слов и посчитать,
    сколько раз встречается каждое слово. */

    public static void main(String[] args) {
        String[] wordsForTask1 = {"Собака","Птица","Лошадь","Кошка",
                "Хомяк","Корова","Птица","Кит","Кошка","Тюлень",
                "Морж","Собака","Ящерица","Птица","Змея","Баран",
                "Кошка","Коза","Куница","Птица"};

        UniqWordsCounter(wordsForTask1);
        System.out.println("Телефонный справочник");

        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.newPositionInBook("8(111)111-11-11", "Яблочков");
        myPhoneBook.newPositionInBook("8(111)111-11-12","Грушев");
        myPhoneBook.newPositionInBook("8(111)111-11-13","Сливовая");
        myPhoneBook.newPositionInBook("8(111)111-11-14","Огурцов");
        myPhoneBook.newPositionInBook("8(111)111-11-15","Помидоркова");
        myPhoneBook.newPositionInBook("8(111)111-11-16","Тыквина");
        myPhoneBook.newPositionInBook("8(111)111-11-17","Петрушкин");
        myPhoneBook.newPositionInBook("8(111)111-11-18","Картофельный");

        System.out.println(myPhoneBook.getNumber("Яблочков"));
        System.out.println(myPhoneBook.getNumber("Грушев"));
        System.out.println(myPhoneBook.getNumber("Сливовая"));
        System.out.println(myPhoneBook.getNumber("Помидоркова"));
        System.out.println(myPhoneBook.getNumber("Огурцов"));
        System.out.println(myPhoneBook.getNumber("Картофельный"));
        System.out.println(myPhoneBook.getNumber("Тыквина"));
        System.out.println(myPhoneBook.getNumber("Петрушкин"));
    }

    public static void UniqWordsCounter(String[] array) {
        HashMap<String, Integer> wordsToCount = new HashMap<>();
        final int firstTimeSee = 1;
        for (String word : array) {
            if (wordsToCount.containsKey(word)) {
                int count = wordsToCount.get(word);
                wordsToCount.put(word, count +1);
            } else {
                wordsToCount.put(word, firstTimeSee);
            }
        }

        System.out.println("Вывод уникальных слов в массиве");
        for(Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            if(wordEntry.getValue() == firstTimeSee) {
                System.out.println(wordEntry.getKey());
            }
        }
        System.out.println("Вывод повторений слов в массиве");
        for (Map.Entry<String, Integer> wordEntry : wordsToCount.entrySet()) {
            System.out.println(wordEntry.getKey() + " : " + wordEntry.getValue());
        }
    }

}
