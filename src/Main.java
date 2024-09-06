import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> constellation = new ArrayList<>();
       constellation.add("Овен");
        constellation.add("Весы");
        constellation.add("Близнецы");
        constellation.add("Дева");
        constellation.add("Скорпион");
        constellation.add("Весы");
        constellation.add("Водолей");
        constellation.add("Рыбы");
        constellation.add("Скорпион");
        constellation.add("Рак");
        constellation.add("Дева");
        constellation.add("Козерог");
        constellation.add("Стрелец");
        constellation.add("Рыбы");
        constellation.add("Телец");
        constellation.add("Молодец");
        System.out.println(constellation);
        System.out.println("В коллекции Созвездия "+constellation.size()+" элементов.");
        HashSet<String> uniqe = new HashSet<>(constellation);
        System.out.println(uniqe);
        System.out.println("В коллекции Созвездия "+uniqe.size()+" уникальных элементов.");
        HashMap<String, Integer> uniqeConstellation = new HashMap<>();
        for(String item : constellation) {
            uniqeConstellation.put(item, uniqeConstellation.getOrDefault(item, 0) + 1);
        }
        int occurrences = uniqeConstellation.getOrDefault("Весы", 0);
        System.out.println(uniqeConstellation);
        System.out.println();

        Phonebook phonebook = new Phonebook();

        phonebook.add("Филатов", "7913012345");
        phonebook.add("Иванов", "7913012346");
        phonebook.add("Сергеев", "7913012347");
        phonebook.add("Филатов", "7913012348");
        phonebook.add("Иванов", "7913012349");
        phonebook.add("Филатов", "7913012340");

        System.out.println("Номер Филатова: " + phonebook.get("Филатов"));
        System.out.println("Номер Иванова: " + phonebook.get("Иванов"));
        System.out.println("Номер Сергеева: " + phonebook.get("Сергеев"));
    }
}
