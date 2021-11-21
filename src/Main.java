public class Main {

    public static void main(String[] args) {

        Shape [] sha = new Shape[2];
        sha [0] = new Square(10.3f, 16.4f);
        sha [1] = new Circle(12.7f);

        for (int i = 0; i < sha.length ; i++) {
            sha[i].getPerimeter();
            sha[i].getArea();
            System.out.println();
        }
    }
}

