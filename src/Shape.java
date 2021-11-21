
public abstract class Shape {

    protected float length;
    protected float height;
    protected float area;
    protected float perimeter;


    public Shape(float length, float height ,float area, float perimeter) {

        this.length = length;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
    }

    public Shape(float radius, float pai, float length, float height, float area, float perimeter) {
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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


    public abstract void print(String s);

}
