package Jcore_HW4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyPhoneBook {
    private final HashMap<String, String> numberName;
    public MyPhoneBook() {
        numberName = new HashMap<>();
    }

    public void newPositionInBook (String phone, String name) {
        numberName.put(phone, name);
    }

    public ArrayList<String> getNumber(String name) {
        ArrayList<String> result = new ArrayList<>();

        for (Map.Entry<String, String> phoneEnt : numberName.entrySet()) {
            if (phoneEnt.getValue().equals(name)) {
                result.add(phoneEnt.getKey());
            }
        }
        return result;
    }
}
