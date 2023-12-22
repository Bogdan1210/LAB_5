public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();


        Shape circle = new Circle();
        Shape square = new Square();

        drawing.drawShape(circle);
        drawing.drawShape(square);


        AbstractShape triangle = new Triangle();
        drawing.drawAbstractShape(triangle);
    }
}