public class Rectangle implements Figure{
    @Override
    public float area() {
        return a * b;
    }

    @Override
    public float perimetr() {
        return 2*a + 2*b;
    }

    @Override
    public void setFillColor(String color) {
        System.out.println("Цвет заливки прямоугольника⁚ " + color);
    }

    @Override
    public void setBorderColor(String color) {
        System.out.println("Цвет границы прямоугольника⁚ " + color);
    }

    public String toString() {

        String info = name;
        info += " Периметр:" + perimetr();
        info += ". Площадь:" + area();
        return info;
    }

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    private float a, b;
    private final String name = "Прямоугольник.";
}
