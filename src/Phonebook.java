import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, HashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        HashSet <String> numbers;
        if (phonebook.containsKey(surname)){
            numbers = phonebook.get(surname);
        }
        else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        phonebook.put(surname, numbers);
    }
    Set<String> get (String surname){
        return phonebook.get(surname);
    }
}