public class Circle extends Shape {

    private float diameter;
    final float pai = 3.14f;

    public Circle(float diameter) {
        this.diameter = diameter;
        }

    @Override
    public void getPerimeter() {

        float perimeter;
        float radius = diameter / 2;
        perimeter = 2 * (radius) * pai;
        System.out.println("This circle perimeter is: " + perimeter);
    }

    @Override
    public void getArea() {

        float area;
        float radius = diameter / 2;
        area = (radius*radius) * pai;
        System.out.println("This circle area is: " + area);
    }
}

