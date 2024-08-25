class Cat extends Animal {
    private static final int maxRun = 200;
    private static int catCount = 0;
    private boolean hungry;

    public Cat(String name) {
        super(name);
        catCount++;
        this.hungry = true;
    }

    public void run(int barier) {
        if (barier <= maxRun) {
            System.out.println(name + " может пробежать " + barier + " метров, чтобы преодолеть препятствие.");
        } else {
            System.out.println(name + " не может пробежать " + barier + " м ((((");
        }
    }

    public void swim(int barier) {
        System.out.println(name + " не плавает");
    }

    public void eat(Bowl bowl, int portion) {
        if (bowl.decreaseFood(portion)) {
            this.hungry = false;
            System.out.println(name + " поел и доволен жизнью");
        } else {
            System.out.println(name + " не успел поесть. Еда закончилась");
        }
    }

    public boolean hungry() {
        return hungry;
    }

    public static int getCatCount() {
        return catCount;
    }
}