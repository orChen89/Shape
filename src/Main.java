public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(30.7f, 15);
        Square s1 = new Square(15.2f, 28);

        Shape sha [] = new Shape[2];
        sha[0] = new Circle(30.7f,15);
        sha[1] = new Square(15.2f,28);

        for (int i = 0; i < sha.length ; i++) {
            sha[i].print("");
        }

        c1.setArea(40.2f);
        c1.setPerimeter(26);
        s1.setArea(18);
        s1.setPerimeter(32);

        System.out.println(c1);
        System.out.println(s1);
    }
}
