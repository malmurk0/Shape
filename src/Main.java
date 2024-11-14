
abstract class Shape{

    abstract void calculateArea();
    abstract void calculatePerimeter();




}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea( ) {
        double area = Math.PI * radius * radius;

        System.out.println("wzor na pole kola"+ area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("wzor na obwod kola"+ perimeter);

    }
}
class Triangle extends Shape{
double a, b, c,h;
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    void calculateArea() {
        double area = (a*h)/2;
        System.out.println("wzor na pole trojkata"+ area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter = a+b+c;
        System.out.println("wzor na obwod trojkata"+ perimeter);
    }
}






public class Main {
    public static void main(String[] args) {
 Circle circle = new Circle(20);
 circle.calculateArea();
 circle.calculatePerimeter();
 Triangle triangle = new Triangle(5,3,5,6);
 triangle.calculateArea();
 triangle.calculatePerimeter();



        }
    }
