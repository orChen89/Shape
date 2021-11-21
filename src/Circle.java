public class Circle extends Shape {

    private float radius;
    private static float pai = 3.14f;

    public Circle(float radius, float pai, float length, float height, float area, float perimeter) {
        super(radius, pai, length, height, area, perimeter);
        this.radius = radius;
        this.pai = pai;
    }

    public float circlePerimeter(float perimeter){

        perimeter = 2 * radius * pai;
        return perimeter;
    }

    public float circleArea(float area){
        area = (radius*radius) * pai;
        return area;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pai=" + pai +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void print (String s){

        System.out.println("This circle perimeter is: " + circlePerimeter(perimeter));
        System.out.println("This circle area is: " + circleArea(area));
    }
}
