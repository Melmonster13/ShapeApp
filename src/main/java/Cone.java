public class Cone extends Shape {
    private double radius;
    private double height;

    /**
     * Constructor to initialize a Cone with given radius and height
     * @param radius The radius of the base of the cone
     * @param height The height of the cone
     * @throws IllegalArgumentException if radius or height is negative
     */
    public Cone(double radius, double height) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        if (height < 0) {
            throw new IllegalArgumentException("height cannot be negative");
        }
        this.radius = radius;
        this.height = height;
    }

    /**
     * Calculates the slant height of the cone
     * Slant height = sqrt(r^2 + h^2)
     * @return slant height
     */
    public double getSlantHeight() {
        return Math.sqrt(radius * radius + height * height);
    }

    /**
     * Calculates the surface area of the cone
     * Surface Area = PIr^2 + PIrs (base circle + lateral surface)
     * where s is the slant height
     * @return surface area
     */
    public double getSurfaceArea() {
        double baseArea = Math.PI * radius * radius;
        double lateralArea = Math.PI * radius * getSlantHeight();
        return baseArea + lateralArea;
    }

    /**
     * Calculates the volume of the cone
     * Volume = (1/3)PIr^2h
     * @return volume
     */
    public double getVolume() {
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }

    /**
     * Gets the radius of the cone's base
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the cone's base
     * @param radius The new radius
     * @throws IllegalArgumentException if radius is negative
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }

    /**
     * Gets the height of the cone
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the cone
     * @param height The new height
     * @throws IllegalArgumentException if height is negative
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height cannot be negative");
        }
        this.height = height;
    }

    /**
     * Returns a string representation of the cone
     * @return String containing the cone's dimensions, surface area and volume
     */
    @Override
    public String toString() {
        return String.format("Cone[radius=%.2f, height=%.2f, surface area=%.2f, volume=%.2f]",
                radius, height, getSurfaceArea(), getVolume());
    }
}
