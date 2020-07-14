public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle();
        shape[1] = new Rectangle();
        shape[2] = new Square();

        for (Shape shape1 : shape){
            System.out.println(shape1.getArea());
            System.out.println();
            if (shape1 instanceof Square){
                shape1.howToColor();
            }
        }
    }
}
