import org.w3c.dom.ls.LSOutput;

public abstract class Shape {

    protected float area;
    protected float perimeter;


    public Shape(float area, float perimeter) {

        this.area = area;
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float length) {
        this.area = length;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

    public abstract void print(String s);

}
