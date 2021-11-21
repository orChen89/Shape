public class Square extends Shape {

    private float length;
    private float height;

    public Square(float length, float height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public void getPerimeter() {
        float perimeter;

        perimeter = (2 * length) + (2 * height);
        System.out.println("This square perimeter is: " + perimeter);
    }

    @Override
    public void getArea() {
        float area;

        area = length * height;
        System.out.println("This square area is: " + area);
    }
}
