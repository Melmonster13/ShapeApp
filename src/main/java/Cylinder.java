public class Cylinder extends Shape {
    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[radius=%.2f, height=%.2f, surface area=%.2f, volume=%.2f]",
                radius, height, surface_area(), volume());
    }
}
