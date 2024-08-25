class Dog extends Animal {
    private static final int maxRun = 500;
    private static final int maxSwim = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public void run(int barier) {
        if (barier <= maxRun) {
            System.out.println(name + " может пробежать " + barier + " метров, чтобы преодолеть препятствие.");
        } else {
            System.out.println(name + " не может пробежать " + barier + " м, он устанет ((((");
        }
    }

    public void swim(int barier) {
        if (barier <= maxSwim) {
            System.out.println(name + " может проплыть " + barier + " метров, чтобы преодолеть препятствие.");
        } else {
            System.out.println(name + " не может проплыть " + barier + " м, он утонет ((((");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}