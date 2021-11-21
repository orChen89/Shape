public class Square extends Shape {

    public Square(float length, float height, float area, float perimeter) {
        super(length, height, area, perimeter);
    }
    public float squarePerimeter(float perimeter){

        perimeter = (2 * length) + (2 * height);
        return perimeter;
    }

    public float squareArea(float area) {
        area = length * height;
        return area;
    }
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", height=" + height +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void print(String s){

        System.out.println("This square perimeter is: " + squarePerimeter(perimeter));
        System.out.println("This square area is: " + squareArea(area));
    }
}
