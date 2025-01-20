public class Cone extends Shape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        double slant_height = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slant_height);
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Cone [radius=%.2f, height=%.2f, surface area=%.2f, volume=%.2f]",
                radius, height, surface_area(), volume());
    }
}
