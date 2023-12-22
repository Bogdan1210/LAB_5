
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}


class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Абстрактний клас
abstract class AbstractShape {
    abstract void drawAbstract();
}

// Клас, який реалізує абстрактний клас
class Triangle extends AbstractShape {
    @Override
    void drawAbstract() {
        System.out.println("Drawing a triangle");
    }
}