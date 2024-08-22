public class Employee {
    String FIO;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String FIO, String position, String email, String phone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО: "+FIO+". Должность: "+position+". email: "+email+". Телефон: "+phone+". Зарплата: "+salary+". age: "+age);
    }

}
