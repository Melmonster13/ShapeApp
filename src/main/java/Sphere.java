public abstract class Sphere extends Shape {
    private double radius;

    // Constructor to initialize Sphere with given radius
    public Sphere(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    // Calculate surface area of Sphere
    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Calculate volume of Sphere
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Get radius of Sphere
    public double getRadius() {
        return radius;
    }

    // Set radius of sphere
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    // Return String representation of sphere
    @Override
    public String toString() {
        return String.format("Sphere[radius=%.2f, surface_area=%.2f, volume=%.2f]",
                radius, getSurfaceArea(), getVolume());
    }
}
