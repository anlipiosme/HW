import java.util.Arrays;

public class Task {
    // task 1
    public static void writeThreeWords() {
        String or = "Orange";
        String ba = "Banana";
        String ap = "Apple";
        System.out.println(or);
        System.out.println(ba);
        System.out.println(ap);
    }

    // task 2
    public static void checkSumSign() {
        int a;
        int b;
        a = -15;
        b = 8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    // task 3
    public static void printColor() {
        int value = 111;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        } else System.out.println("Желтый");
    }

    //task 4
    public static void compareNumbers() {
        int a = 44;
        int b = 96;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    //task 5
    public static boolean check(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum < 21;
    }

    // task 6
    public static int positive(int c) {
        if (c >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
        return c;
    }

    // task 7
    public static boolean negative(int d) {
        return d < 0;
    }

    // task 8
    public static void generate(String story, int q) {
        for (int e = 0; e < q; e++) {
            System.out.println(story);
        }
    }

    // task 9
    public static boolean year(int y) {
        return (y%4==0 && y%100!=0 || y%400==0);
    }

    // task 10
    public static void task10(){
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int m = 0; m < mass.length; m++) {
            if (mass[m] == 0)
                mass[m] = 1;
            else
                mass[m] = 0;
        }
        System.out.println(Arrays.toString(mass));
    }
    //task 11
    public static void task11(){
        int [] arr = new int [100];
        for (int y = 0; y < 100; y++){
            arr[y] = y+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    // task12
    public static void task12() {
        int[] less6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int k = 0; k < less6.length; k++)
            if (less6[k] < 6) {
                less6[k] = less6[k] * 2;
            }
        System.out.println(Arrays.toString(less6));
    }
    // task 13
    public static void task13() {
        int[][] multi = new int[5][5];
        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++){
                if (multi[i] == multi[j]){
                    multi[i][j] = 1;
                }
                System.out.print(multi[i][j]);
            }
            System.out.print("\n");
        }
    }

    //task 14
    public static int[] task14(int len, int initialValue) {
        int[] arr2 = new int[len];
        for (int y = 0; y < len; y++) {
            arr2[y] = initialValue;
        }
        return arr2;
    }
}