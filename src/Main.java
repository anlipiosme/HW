public class Main {
    public static void main(String[] args) {
        Employee [] persArray = new Employee[5];
        persArray[0] = new Employee ("Денис Юрьевич Касьянов", "Директор по развитию", "kas@impulse.ru", "79139335533", 120000, 33);
        persArray[1] = new Employee ("Ксения Андреевна Сазонова", "BTL-менеджер", "sazonova@impulse.ru", "79130030055", 35000, 27);
        persArray[2] = new Employee ("Ксения Алексеевна Попова", "BTL-менеджер", "popik@impulse.ru", "79232200757", 35000, 26);
        persArray[3] = new Employee ("Глеб Романович Свистунов", "Дизайнер", "designer@impulse.ru", "79833330502", 45000, 31);
        persArray[4] = new Employee ("Анна Николаевна Алексеева", "Менеджер", "manager@impulse.ru", "79232526262", 30000, 27);
        for (Employee employee : persArray) {
            employee.printInfo();
        }

        System.out.println(" ");

        Park park1 = new Park();
        park1.name = "Сочи Парк";
        park1.city = "Адлер";

        Park.Attraction attraction1 = new Park.Attraction();
        attraction1.attractionName = "Вечный двигатель";
        attraction1.attractionTime = "10.00-20.00";
        attraction1.AttractionPrice = 400;
        Park.Attraction attraction2 = new Park.Attraction();
        attraction2.attractionName = "Змей горыныч";
        attraction2.attractionTime = "10.00-20.00";
        attraction2.AttractionPrice = 500;

        System.out.println("Развлекательный центр "+park1.name+" в городе "+park1.city+" приглашает отдохнуть!");

        System.out.println("Аттракцион "+attraction1.attractionName+", время работы: "+attraction1.attractionTime+". Цена одного билета: "+attraction1.AttractionPrice+" руб.");
        System.out.println("Аттракцион "+attraction2.attractionName+", время работы: "+attraction2.attractionTime+". Цена одного билета: "+attraction2.AttractionPrice+" руб.");

    }

}