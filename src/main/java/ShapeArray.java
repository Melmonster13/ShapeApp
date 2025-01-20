public class ShapeArray {
    public static void main(String[] args) {
        // Create instances
        Sphere sphere = new Sphere(5.0);
        Cylinder cylinder = new Cylinder(3.0, 7.0);
        Cone cone = new Cone(3.0, 7.0);

        cone.setRadius(4.5);
        cone.setHeight(6.5);

        // Create array of Shape to store instances
        Shape[] shapeArray = new Shape[3];

        // Store shapes in array
        shapeArray[0] = sphere;
        shapeArray[1] = cylinder;
        shapeArray[2] = cone;

        // Loop through array and print each shape
        System.out.println("The shape array is: ");
        System.out.println("--------------------");

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
