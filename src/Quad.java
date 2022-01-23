public abstract class Quad extends Shape{
    double sideA;
    double sideB;

    @Override
    double getArea() {
        return sideA*sideB;
    }
}
