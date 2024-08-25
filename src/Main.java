public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Шарик");

        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Васька");
        Cat cat3 = new Cat("Рыжий");


        dog1.run(300);
        dog1.swim(5);
        System.out.println();

        dog2.run(600);
        dog2.swim(15);
        System.out.println();

        cat1.run(150);
        cat1.swim(10);
        System.out.println();
        cat2.run(335);
        cat2.swim(20);
        System.out.println();
        cat3.run(77);
        cat3.swim(5);
        System.out.println();

        System.out.println("Собачек создано: " + Dog.getDogCount());
        System.out.println("Котиков создано: " + Cat.getCatCount());
        System.out.println();

        Bowl bowl = new Bowl(20);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }
        System.out.println();
        bowl.addFood(15);
        System.out.println("Ура! в миску упала еще еда! Там теперь: " + bowl.getFood() + " ед.");

        for (Cat cat : cats) {
            if (!cat.hungry()) {
                cat.eat(bowl, 10);

            }
        }
        System.out.println();
        Circle circle = new Circle(16);
        Rectangle rectangle = new Rectangle(8, 4);
        Triangle triangle = new Triangle(4,5,6);
        System.out.println(circle);
        circle.setFillColor("Красный");
        circle.setBorderColor("Черный");
        System.out.println();
        System.out.println(rectangle);
        rectangle.setFillColor("Желтый");
        rectangle.setBorderColor("Синий");
        System.out.println();
        System.out.println(triangle);
        triangle.setFillColor("Белый");
        triangle.setBorderColor("Зеленый");

    }
}