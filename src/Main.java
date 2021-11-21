public class Main {

    public static void main(String[] args) {


        Shape sha [] = new Shape[2];
        sha[0] = new Circle(30.7f,3.14f, 0, 0, 0, 0);
        sha[1] = new Square(15.2f,28, 0, 0);

        for (int i = 0; i < sha.length ; i++) {
            sha[i].print("");
        }
    }
}
