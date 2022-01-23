public abstract class Cirle extends Shape{
    double radius;

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}
