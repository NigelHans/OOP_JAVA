public class Main {
    public static void main(String[] args) {
       
        Square square = new Square(12.5);
        Rectangle rectangle = new Rectangle(10.7, 13.4);
        Triangle triangle = new Triangle(20,24, 30);

        Shape[] shapes = { square, rectangle, triangle };
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}
