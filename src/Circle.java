public class Circle extends Shape {

    public Circle(float area, float perimeter) {
        super(area, perimeter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public void print (String s){

        System.out.println("This is a Circle!!!");
    }
}
