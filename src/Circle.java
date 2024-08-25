public class Circle implements Figure{
    @Override
    public float area() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float perimetr() {
        return (float) (2 * Math.PI * r);
    }

    @Override
    public void setFillColor(String color) {
        System.out.println("Цвет заливки круга: " + color);
    }

    @Override
    public void setBorderColor(String color) {
        System.out.println("Цвет границы круга⁚ " + color);
    }

    public String toString() {

        String info = name;
        info += " Периметр:" + perimetr();
        info += ". Площадь:" + area();
        return info;
    }

    public Circle(float r) {
        this.r = r;
    }

    private float r;
    private final String name = "Круг.";
}
