public abstract class Treangle extends Shape {
    double sideA;
    double sideB;
    double sideC;
    double angleA;
    double angleB;
    double angleC;

    @Override
    double getArea() {
        double perimeter =  Math.abs(sideA + sideB + sideC);
        return Math.sqrt (0.5*perimeter*(perimeter-sideA)*(0.5*perimeter-sideB)*(0.5*perimeter-sideC));
    }
}