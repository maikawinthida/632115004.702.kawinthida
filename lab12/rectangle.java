public class rectangle extends shape {
    private double widthh, lengthh;

    public rectangle() {
        this.widthh = 1;
        this.lengthh = 1;
    }

    public rectangle(double widthh, double lengthh) {
        this.widthh = widthh;
        this.lengthh = lengthh;
    }

    public double getArea() {
        return widthh * lengthh;
    }
}
