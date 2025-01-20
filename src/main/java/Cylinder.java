public class Cylinder extends Shape {
    private double radius;
    private double height;

    /**
     * Constructor to initialize a Cylinder with given radius and height
     * @param radius The radius of cylinder
     * @param height The height of cylinder
     * @throws IllegalArgumentException if radius or height is negative
     */
    public Cylinder(double radius, double height) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculate the surface area of the cylinder
     * Surface Area = 2PIr^2 + 2PIrh (two circles + lateral surface)
     * @return surface area
     */
    public double getSurfaceArea() {
        double circleArea = 2 * Math.PI * radius * radius;
        double lateralArea = 2 * Math.PI * radius * height;
        return circleArea + lateralArea;
    }

    /**
     * Calculates the volume of the cylinder
     * Volume = PIr^2h
     * @return volume
     */
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    /**
     * Gets the radius of the cylinder
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the cylinder
     * @param radius The new radius
     * @throws IllegalArgumentException if radius is negative
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    /**
     * Gets the height of the cylinder
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the cylinder
     * @param height The new height
     * @throws IllegalArgumentException if height is negative
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }

    /**
     * Returns a string representation of the cylinder
     * @return String containing the cylinder's dimensions, surface area and volume
     */
    @Override
    public String toString() {
        return String.format("Cylinder[radius=%.2f, height=%.2f, surface area=%.2f, volume=%.2f]",
                radius, height, getSurfaceArea(), getVolume());
    }
}
