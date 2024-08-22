import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task.writeThreeWords();
        Task.checkSumSign();
        Task.printColor();
        Task.compareNumbers();
        System.out.println(Task.check(8, 14));
        Task.positive(-5);
        System.out.println(Task.negative(-9));
        Task.generate("Классный текст", 5);
        System.out.println(Task.year(800));
        Task.task10();
        Task.task11();
        Task.task12();
        Task.task13();
        System.out.println(Arrays.toString(Task.task14(5, 14)));
    }
}