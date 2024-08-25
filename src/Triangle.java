public class Triangle implements Figure{
    @Override
    public float area() {
        float p = perimetr() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }

    @Override
    public float perimetr() {
        return a+b+c ;
    }

    @Override
    public void setFillColor(String color) {
        System.out.println("Цвет заливки треугольника⁚ " + color);
    }

    @Override
    public void setBorderColor(String color) {
        System.out.println("Цвет границы треугольника⁚ " + color);
    }

    public String toString() {

        String info = name;
        info += " Периметр:" + perimetr();
        info += ". Площадь:" + area();
        return info;
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private float a, b, c;
    private final String name = "Треугольник.";

}
