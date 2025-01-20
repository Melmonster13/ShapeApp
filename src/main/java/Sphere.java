public class Sphere extends Shape {
    private double radius;


    /**
     * Constructor to initialize sphere with given radius
     * @param radius The radius of the sphere
     * @throws IllegalArgumentException if radius is negative
     */
    public Sphere(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    /**
     * Calculates the surface area of the sphere
     * @return surface area (4PIr^2)
     */
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    /**
     * Calculates the volume of the sphere
     * @return volume (4/3PIr^3)
     */
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Gets the radius of the sphere
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the sphere
     * @param radius The new radius
     * @throws IllegalArgumentException if radius is negative
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    /**
     * Return a string representation of the sphere
     * @return String containing sphere's surface area and volume
     */
    @Override
    public String toString() {
        return String.format("Sphere[radius=%.2f, surface_area=%.2f, volume=%.2f]",
                radius, getSurfaceArea(), getVolume());
    }
}
