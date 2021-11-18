public class Square extends Shape {

    public Square(float area, float perimeter) {
        super(area, perimeter);
    }

    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
    public void print(String s){
        System.out.println("This is a Square!!!");
    }
}
